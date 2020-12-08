package File_Handling.CharacterStream;

import java.io.*;

public class FileWriterDemo {

    public static void main(String args[]) {
        try {
            String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\CharacterStream\\output.txt";
            FileWriter fw = new FileWriter(path,true);  //false by default for overwriting
                    //true file will be opened in append mode.
            
            fw.write("\nWelcome to EC Department of CDGI.");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}
