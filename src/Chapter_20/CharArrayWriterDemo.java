package Chapter_20;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = " This data must be input in array";
        char[] buf = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);

        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println(f.toString());

        char[] c = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        try (FileWriter fileWriter = new FileWriter("test.txt")){
            f.writeTo(fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        f.reset();
        for (int i = 0; i < 3; i++) {
            f.write('X');
        }

        System.out.println(f.toString());
    }
}
