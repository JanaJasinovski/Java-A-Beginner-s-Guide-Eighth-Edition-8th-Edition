package Chapter_18;

import java.io.*;
import java.util.Properties;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try {
            fin = new FileInputStream("phonebook.dat");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            if(fin != null){
                ht.load(fin);
                fin.close();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        do {
            name = br.readLine();
            if(name.equals("out")) continue;
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        }while (!name.equals("out"));

        if(changed){
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Tel book");
            fout.close();
        }

        do {
            name = br.readLine();
            if(name.equals("out")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        }while (!name.equals("out"));
    }
}
