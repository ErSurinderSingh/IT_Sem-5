//writes string
package File_Handling.ByteStream;

import java.io.*;
import java.util.Scanner;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        try{
            Scanner S = new Scanner(System.in);
            
            String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\ByteStream\\output.txt", data;
            
            FileOutputStream output = new FileOutputStream(path,true);//default is false: overwrite
            
            System.out.print("Enter Ur Name:");
            data = S.nextLine();

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            output.close();
            
        }catch(IOException ioe){
            System.out.println(ioe.toString());
        }
    }
}
