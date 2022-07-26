package Chapter_7;

class Stack2{
    private int[] stck;
    private int tos;

    public Stack2(int size) {
        this.stck = new int[size];
        this.tos = -1;
    }

    void push(int item){
        if(tos == stck.length - 1){
            System.out.println("Stack is full");
        }
        else {
            stck[++tos] = item;
        }
    }

    int pop(){
        if(tos < 0){
            System.out.println("Stack is empty");
            return 0;
        }else {
            return stck[tos--];
        }
    }
}

public class TestStack2 {
    public static void main(String[] args) {
        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(8);

        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }

        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }

        System.out.println("mystack1");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("mystack2");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
