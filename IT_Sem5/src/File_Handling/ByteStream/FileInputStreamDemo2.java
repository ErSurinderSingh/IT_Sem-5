//FILE INPUT STREAM TO READ ALL CHARACETRS IN THE FILE input.txt.
package File_Handling.ByteStream;

import java.io.*;

public class FileInputStreamDemo2 {

    public static void main(String[] args) {
        try {
            String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\ByteStream\\input.txt";
            FileInputStream input = new FileInputStream(path);

            System.out.println("Data in the file: " + input.available() + " bytes");

            int i = 0;
            byte [] b = null ;
            input.read(b, 0, 10);
                System.out.print(b);
            
            
            System.out.println("\n");
            input.close();

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
