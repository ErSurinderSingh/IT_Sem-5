package File_Handling.CharacterStream;

import java.io.*;

public class PrintWriterDemo2 {

    public static void main(String[] args)  {
        String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\CharacterStream\\pw.dat";
        try (PrintWriter writer1 = new PrintWriter(new File(path))) {   //try with resources
            writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
            writer1.flush();
        }catch(IOException ioe){
            
        }
    }
}

/*try{
}
catch(Exception e){
}
*/
