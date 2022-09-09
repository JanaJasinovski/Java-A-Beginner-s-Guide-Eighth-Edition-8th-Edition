package Chapter_21;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "\\MyDir";

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dirname))){
            System.out.println("Catalog: " + dirname);

            for (Path entry: directoryStream){
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if(attributes.isDirectory()) System.out.println("<DIR> ");
                else System.out.println("       ");
                System.out.println(entry.getName(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
