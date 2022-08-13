package Chapter_10;

public class FinallyDemo {
    static void procA(){
        try {
            System.out.println("procA()");
            throw new RuntimeException("demonstration");
        }finally {
            System.out.println("finally procA()");
        }
    }

    static void procB(){
        try {
            System.out.println("procB()");
            return;
        }finally {
            System.out.println("finally procB()");
        }
    }

    static void procC(){
        try {
            System.out.println("procC()");
        }finally {
            System.out.println("finally procC()");
        }
    }


    public static void main(String[] args) {
        try {
            procA();
        }catch (Exception e){
            System.out.println("Exception");
        }
        procB();
        procC();
    }
}
