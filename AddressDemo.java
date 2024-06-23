package NetworkProgramming;
import java.net.*;

public class AddressDemo {   
    public static void main(String[] args) {
        try{
            InetAddress address= InetAddress.getByName("www.youtube.com");
            System.out.println(address);
        }
        catch(UnknownHostException ex)
        {
            System.out.println(ex);
        }
    }
}
