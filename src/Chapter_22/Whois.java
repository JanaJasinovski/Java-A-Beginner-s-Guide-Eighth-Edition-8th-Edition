package Chapter_22;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) throws IOException {
        int c;

        Socket s = new Socket("whois.internic.net", 43);
        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        String str = (args.length == 0 ? "MHProfessional.com" : args[0]);

        byte[] buf = str.getBytes();
        outputStream.write(buf);

        while ((c = inputStream.read()) != -1){
            System.out.println((char) c);
        }

        s.close();
    }
}
