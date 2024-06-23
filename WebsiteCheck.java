package NetworkProgramming;
import java.net.*;

public class WebsiteCheck {
    public static void main(String[] args) {
        try{
        InetAddress ad = InetAddress.getByName("www.google.com");
        InetAddress ad2 = InetAddress.getByName("www.youtube.com");
        if(ad.equals(ad2)){
            System.out.println("Same");
        }
        else{
            System.out.println("Different");
        }
    }
        catch(UnknownHostException ex){
            System.out.println(ex);
        }
    }    
}
