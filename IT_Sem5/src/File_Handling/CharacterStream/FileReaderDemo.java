
package File_Handling.CharacterStream;
import java.io.*;

public class FileReaderDemo {
    public static void main(String args[])throws Exception{    
          String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\CharacterStream\\input.txt";
          FileReader fr = new FileReader(path);    
          int i;//=fr.read();    
          while((i=fr.read())!= -1) //EOF REACH read it.....   
            System.out.print((char)i);    
          fr.close();    
    }    
}