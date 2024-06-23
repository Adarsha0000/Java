package NetworkProgramming;
import java.net.*;

public class IpAd {
    public static void main(String[] args) {
        try{
            InetAddress ad = InetAddress.getByName("www.youtube.com");
            System.out.println("Address: " + ad);
            printAddressDetails(ad);

            InetAddress ad2 = InetAddress.getByName("93.184.216.34");
            System.out.println("Address 2: " + ad2);
            printAddressDetails(ad2);


            InetAddress localAddress = InetAddress.getLocalHost();
            System.out.println("Local Host: "+ localAddress);
            printAddressDetails(localAddress);


            InetAddress[] allAddresses = InetAddress.getAllByName("www.google.com");
            for(InetAddress adr: allAddresses){
                printAddressDetails(adr);
                System.out.println(adr);
            }
        }
        catch(UnknownHostException ex){
            System.out.println(ex);
        }
    }    
    public static void printAddressDetails(InetAddress ad) {
        System.out.println("Caonical Hotname: " + ad.getCanonicalHostName());
        System.out.println("Host Address: "+ ad.getHostAddress());
        System.out.println("Host Address: " + ad.getHostName());
        System.out.println("Is any local address: "+ ad.isAnyLocalAddress());
        System.out.println("Is Link Local Address: " + ad.isLinkLocalAddress());
        System.out.println("Is Loopback Address: "+ ad.isLoopbackAddress());
        System.out.println("is Multicast Address: "+ ad.isMulticastAddress());
        System.out.println("Is Site Local Address: "+ ad.isSiteLocalAddress());
        System.out.println();
    }

}
