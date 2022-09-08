package Chapter_20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("FileReaderDemo.java")){
            int c;
            while ((c = fileReader.read()) != -1) System.out.println((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
