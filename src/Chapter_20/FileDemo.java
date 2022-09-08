package Chapter_20;

import java.io.File;

public class FileDemo {
    static void p (String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File file = new File("/java/COPYRIGHT");
        p("Name of file: " + file.getName());
        p("Path: " + file.getPath());
        p("Absolute path: " + file.getAbsolutePath());
        p("Parent catalog: " + file.getParent());
        p(file.exists() ? "exists" : " doesn't exist");
        p(file.canWrite() ? "allow for writing" : "doesn't allow for writing");
        p(file.canRead() ? "allow for reading" : "doesn't allow for reading");
        p(file.isDirectory() ? "is a catalog" : " isn't a catalog");
        p(file.isFile() ? "is an ordinary file" : "isn't an ordinary file");
        p(file.isAbsolute() ? "is absolute" : "isn;t absolute");
        p("The latest changes in file: " + file.lastModified());
        p("Size: " + file.length() + " bits");
    }
}
