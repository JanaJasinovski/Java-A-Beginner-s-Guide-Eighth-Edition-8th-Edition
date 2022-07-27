package Chapter_5;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for\n");
            choice = (char) System.in.read();
        }while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice){
            case 1:
                System.out.println("if:\n");
                System.out.println("if();");
                System.out.println("else ;");
                break;
            case 2:
                System.out.println("switch:\n");
                System.out.println("switch()");
                System.out.println("case constant:");
                System.out.println("operators");
                System.out.println("break;");
                System.out.println("//..");
                System.out.println("}");
                break;
            case 3:
                System.out.println("while:\n");
                System.out.println("while() operator;");
            case 4:
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println(" operator;");
                System.out.println("} while () ;");
            case 5:
                System.out.println("for:\n");
                System.out.println("for()");
                System.out.println("operator");
                break;
        }
    }
}
