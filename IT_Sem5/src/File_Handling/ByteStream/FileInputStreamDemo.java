//FILE INPUT STREAM TO READ A SINGLE CHARACTER IN THE FILE input.txt.
package File_Handling.ByteStream;

import java.io.*;

public class FileInputStreamDemo {

    public static void main(String args[]) {
           try {
            String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\ByteStream\\input.txt";
            FileInputStream input = new FileInputStream(path);
            
            System.out.println("Data in the file: " + input.available());
            
            // Reads the first byte
            int i = input.read();
            System.out.println((char)i);
            
            input.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}