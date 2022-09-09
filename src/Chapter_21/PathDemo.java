package Chapter_21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filepath = Paths.get("examples\\test.txt");
        System.out.println(filepath.getName(1));
        System.out.println(filepath.toAbsolutePath());
        System.out.println(filepath.getParent());
        if (Files.exists(filepath)) {
            System.out.println("exist");
        } else {
            System.out.println("don't exist");
        }

        try {
            if (Files.isHidden(filepath)) {
                System.out.println("open");
            } else {
                System.out.println("close");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Files.isWritable(filepath);
        Files.isReadable(filepath);

        try {
            BasicFileAttributes attributes = Files.readAttributes(filepath, BasicFileAttributes.class);

            if (attributes.isDirectory()) {
                System.out.println("It's a catalog");
            } else {
                System.out.println("It isn't catalog");
            }

            if (attributes.isRegularFile()) {
                System.out.println("It's a common file");
            } else{
                System.out.println("It isn't a common file");
            }

            if (attributes.isSymbolicLink()){
                System.out.println("It is a symbol link");
            }else {
                System.out.println("It isn't a symbol link");
            }

            System.out.println(attributes.lastModifiedTime());
            System.out.println(attributes.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
