package NetworkProgramming;
import java.net.*;
import java.util.Enumeration;

public class NetorkInterface {
    public static void main(String[] args) {
        try{
            Enumeration<NetworkInterface> networkInterface = NetworkInterface.getNetworkInterfaces();

            while(networkInterface.hasMoreElements()){
                NetworkInterface nf = networkInterface.nextElement();

                System.out.println("Name: "+ nf.getName());
                System.out.println("Display Name: "+ nf.getDisplayName());
                System.out.println("MTU: "+ nf.getMTU());
                System.out.println("Loopback: "+ nf.isLoopback());
                System.out.println("Up: "+ nf.isUp());
                System.out.println("Virtual: "+ nf.isVirtual());

            }
        }
        catch(SocketException ex){
            ex.printStackTrace();
        }
    }
}
