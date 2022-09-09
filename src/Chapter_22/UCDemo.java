package Chapter_22;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws IOException {
        int c;
        URL hp = new URL("http://www.internic.net");
        URLConnection hpCon = hp.openConnection();

        long d = hpCon.getDate();
        if(d == 0){
            System.out.println("empty");
        }else {
            System.out.println(new Date(d));
        }

        System.out.println(hpCon.getContentType());

        d = hpCon.getExpiration();
        if(d == 0){
            System.out.println("empty");
        }else{
            System.out.println(new Date(d));
        }

        d = hpCon.getExpiration();
        if(d == 0){
            System.out.println("empty");
        }else{
            System.out.println(new Date(d));
        }

        long len = hpCon.getContentLengthLong();
        if(len == -1){
            System.out.println("false");
        }else {
            System.out.println(len);
        }

        if(len != 0){
            InputStream inputStream = hpCon.getInputStream();
            while ((c = inputStream.read()) != -1){
                System.out.println((char) c);
            }
            inputStream.close();
        }else {
            System.out.println("close");
        }
    }
}
