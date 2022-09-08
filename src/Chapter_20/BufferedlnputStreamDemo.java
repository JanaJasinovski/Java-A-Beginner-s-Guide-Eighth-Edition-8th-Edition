package Chapter_20;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedlnputStreamDemo {
    public static void main(String[] args) {
        String s = "This is a sign from author &copy; " +
                ", and &copy - no. \n";

        byte[] b = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(b);
        int c;
        boolean marked = false;

        try (BufferedInputStream f = new BufferedInputStream(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.println("(c)");
                        } else {
                            System.out.println((char) c);
                        }
                    case ' ':
                        if (marked) {
                            marked = false;
                            f.reset();
                            System.out.println("&");
                        } else {
                            System.out.println((char) c);
                        }
                        break;
                    default:
                        if (!marked) {
                            System.out.println((char) c);
                        }
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
