package Chapter_19;

import java.util.Scanner;

public class FindInLineDemo {
    public static void main(String[] args) {
        String instr = "Name: Tom Age: 28 ID: 77";
        Scanner scanner = new Scanner(instr);

        scanner.findInLine("Age:");
        if(scanner.hasNext()){
            System.out.println(scanner.next());
        }else {
            System.out.println("Error!");
        }
        scanner.close();
    }
}
