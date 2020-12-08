package Networking;

import java.net.*;

public class InetDemo {

    public static void main(String[] args) {
        try {
            
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println(ip);//hostname/ip
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
            System.out.println("Local Host: " + ip.getLocalHost());

        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
}
