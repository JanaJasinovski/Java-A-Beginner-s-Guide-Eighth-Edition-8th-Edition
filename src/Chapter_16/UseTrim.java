package Chapter_16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTrim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Enter 'stop' to stop");
        System.out.println("Enter state name: ");
        do {
            str = br.readLine();
            str = str.trim();
            if(str.equals("Illinois")){
                System.out.println("Capital - Springfield");
            }
        }while (!str.equals("stop"));
    }
}
