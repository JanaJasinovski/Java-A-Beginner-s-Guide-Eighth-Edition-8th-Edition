package Chapter_20;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp = "abcdefghicjklmnoprstuvwxyz";
        int length = tmp.length();
        char[] c = new char[length];

        tmp.getChars(0, length, c, 0);
        int i;

        try (CharArrayReader input = new CharArrayReader(c)){
            while ((i = input.read()) != -1){
                System.out.println((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (CharArrayReader input = new CharArrayReader(c,0,5)){
            while ((i = input.read()) != -1){
                System.out.println((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
