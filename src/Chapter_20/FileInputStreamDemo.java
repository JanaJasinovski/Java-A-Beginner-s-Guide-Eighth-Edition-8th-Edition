package Chapter_20;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        try (FileInputStream f = new FileInputStream("FileInputStreamDemo.java")){
            size = f.available();
            System.out.println(size);
            int n = size / 40;
            System.out.println(n);

            for (int i = 0; i < n; i++) {
                System.out.println((char) f.read());
            }

            System.out.println(f.available());

            System.out.println(n);

            byte[] b = new byte[n];
            if(f.read(b) != n){
                System.err.println(n);
            }

            System.out.println(new String(b, 0, n));
            size = f.available();

            System.out.println(size);

            f.skip(size / 2);
            System.out.println(f.available());

            System.out.println(n / 2);

            if(f.read(b, n / 2, n/ 2) != n / 2){
                System.err.println(n / 2);
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println(f.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
