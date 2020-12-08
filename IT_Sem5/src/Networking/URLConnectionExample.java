package Networking;

import java.io.*;
import java.net.*;

public class URLConnectionExample {

    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://www.javatpoint.com/URLConnection-class");
        URLConnection urlcon = url.openConnection();
        InputStream stream = urlcon.getInputStream();
        int i;
        while ((i = stream.read()) != -1)
            System.out.print((char) i);
    }
}
