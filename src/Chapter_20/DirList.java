package Chapter_20;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "/java";
        File file = new File(dirname);
        if(file.isDirectory()){
            System.out.println("Catalog: " + dirname);
            String[] str = file.list();

            for (int i = 0; i < str.length; i++) {
                File file1 = new File(dirname + "/" + str[i]);
                if(file1.isDirectory()){
                    System.out.println(str[i] + " is a catalog");
                }else {
                    System.out.println(str[i] + " is a file");
                }
            }
        }else {
            System.out.println(dirname + " isn't a catalog");
        }
    }
}
