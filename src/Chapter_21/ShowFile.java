package Chapter_21;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ShowFile {
    public static void main(String[] args) {
        int i;

        if(args.length != 1){
            return;
        }

        try (InputStream inputStream = Files.newInputStream(Paths.get(args[0]))){
            do {
                i = inputStream.read();
                if(i != -1) System.out.println((char) i);
            }while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
