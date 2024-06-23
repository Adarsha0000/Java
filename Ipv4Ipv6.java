package NetworkProgramming;
import java.net.*;

public class Ipv4Ipv6 {
    public static void main(String[] args) {
        try{
            InetAddress ad = InetAddress.getByName("www.google.com");

            if(ad instanceof Inet6Address){
                System.out.println("Ipv6 = "+ ad.getHostAddress());
            }

            if(ad instanceof Inet4Address){
                System.out.println("Ipv4 ="+ ad.getHostAddress());
            }
        }
        catch(UnknownHostException ex){
            ex.printStackTrace();
        }
    }
}
