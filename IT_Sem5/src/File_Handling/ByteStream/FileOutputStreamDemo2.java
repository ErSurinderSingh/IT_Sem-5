//writes a byte of data
package File_Handling.ByteStream;

import java.io.*;

public class FileOutputStreamDemo2 {

    public static void main(String[] args) {
        try {
            String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\output1.txt";
            FileOutputStream fout = new FileOutputStream(path);

            fout.write(48);
            fout.close();
            System.out.println("success...");
        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }

}
