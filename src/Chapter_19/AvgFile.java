package Chapter_19;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AvgFile {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;

        FileWriter fileWriter = new FileWriter("test.txt");
        fileWriter.write("2 3.4 5 6 7.4 9.1 10.5 stop");
        fileWriter.close();
        FileReader fileReader = new FileReader("Test.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNext()){
            if(scanner.hasNextDouble()){
                sum += scanner.nextDouble();
                count++;
            }else {
                String str = scanner.next();
                if(str.equals("stop")) break;
                else {
                    return;
                }
            }
        }
        scanner.close();
        System.out.println(sum / count);
    }
}
