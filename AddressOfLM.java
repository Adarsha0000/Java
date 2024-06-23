package NetworkProgramming;
import java.net.*;

public class AddressOfLM {
    public static void main(String[] args) {
       try{
        InetAddress ad = InetAddress.getLocalHost();
        System.out.println(ad);
       }
       catch(UnknownHostException ex){
        System.out.println(ex);
       }
    }
}
