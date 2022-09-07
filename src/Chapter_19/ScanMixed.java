package Chapter_19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScanMixed {
    public static void main(String[] args) throws IOException {
        int i;
        double d;
        boolean b;
        String str;

        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("Testing Scanner 10 12.2 one true two false");
        fileWriter.close();

        FileReader fileReader = new FileReader("Test.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNext()){
            if(scanner.hasNextInt()) {
                i = scanner.nextInt();
                System.out.println("int: " + i);
            }else if(scanner.hasNextDouble()){
                d = scanner.nextDouble();
                System.out.println("double: " + d);
            }else if(scanner.hasNextBoolean()){
                b = scanner.nextBoolean();
                System.out.println("boolean: " + b);
            }else {
                str = scanner.next();
                System.out.println("String: " + str);
            }
        }
    }
}
