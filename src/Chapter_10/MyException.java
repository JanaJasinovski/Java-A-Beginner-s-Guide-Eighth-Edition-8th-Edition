package Chapter_10;

class MyException extends Exception{
    private int detail;

    MyException(int a){
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}

class ExceptionDemo{
    static void compute(int a) throws MyException{
        if(a > 10)
            throw new MyException(a);
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        }catch (MyException e) {
            System.out.println(e);
        }
    }
}