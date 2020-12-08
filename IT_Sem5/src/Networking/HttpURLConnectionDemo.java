package Networking;

import java.io.*;
import java.net.*;

public class HttpURLConnectionDemo {

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("http://www.javatpoint.com/java-tutorial");
        HttpURLConnection huc = (HttpURLConnection) url.openConnection();
        for (int i = 1; i <= 9; i++) 
            System.out.println(huc.getHeaderFieldKey(i) + " = " + huc.getHeaderField(i));
        huc.disconnect();

    }
}
