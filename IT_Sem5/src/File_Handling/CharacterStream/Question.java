package File_Handling.CharacterStream;

import java.io.*;

public class Question {

    public static void main(String[] args) throws IOException {
        String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\CharacterStream\\input.txt";
        String path2 = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\CharacterStream\\output.txt";
        BufferedReader br = new BufferedReader(new FileReader(path));
        int i;
        while ((i = br.read()) != -1) {
            //System.out.print((char)i);
            BufferedWriter bw = new BufferedWriter(new FileWriter(path2));

            if (i == 32) //OR if(i == ' ')
                continue;
            else
                bw.write(i);
        }
        br.close();
    }
}
