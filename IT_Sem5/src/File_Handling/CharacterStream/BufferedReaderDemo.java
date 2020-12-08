package File_Handling.CharacterStream;

import java.io.*;

public class BufferedReaderDemo {

    public static void main(String[] args) {
        try {
            String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\CharacterStream\\input.txt";
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }
            br.close();
            fr.close();
        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}
