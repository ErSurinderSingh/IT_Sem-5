package File_Handling.CharacterStream;

import java.io.*;

public class BufferedWriterDemo {

    public static void main(String[] args) throws Exception {
        try {
            String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\CharacterStream\\output.txt";
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter buffer = new BufferedWriter(writer);
            buffer.write("\nWelcome to EC Department of CDGI.");
            buffer.close();
            System.out.println("Success");
        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        }

    }
}
