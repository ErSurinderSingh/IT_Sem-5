package File_Handling.CharacterStream;

import java.io.*;

class Question2 {
    public static void main(String[] args) throws IOException{
        String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\CharacterStream\\input.txt";
        
        String path2 = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\CharacterStream\\output.txt";
        
        BufferedReader br = new BufferedReader(new FileReader(path));
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(path2));
        
        int i;
        while ((i = br.read()) != -1) {
            if ((char) i == 32)
                continue;
            bw.write((char)i);
        }
        
    }
}
