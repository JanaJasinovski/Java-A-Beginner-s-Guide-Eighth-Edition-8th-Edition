package Chapter_20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dout.writeDouble(98.6);
            dout.writeDouble(1000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))){
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println(d + " " + i + " " + b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
