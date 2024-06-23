package NetworkProgramming;

import java.net.InetAddress;

public class RemoteSystem {
    public static void main(String[] args) {
        try{
            InetAddress ad = InetAddress.getByName("192.168.1.165");
            if(ad.isReachable(1000)){
                System.out.println("Success");
            }
            else{
                System.out.println("Failed");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
