package Chapter_30;

public class AddClient {
    public static void main(String[] args) {
        try {
            String addServerURL = "rmi://" + args[0] + "/AddServer";

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
