package File_Handling.CharacterStream;

import java.io.*;

public class PrintWriterDemo1 {

    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Javatpoint provides tutorials of all technology.");
        writer.flush();
        writer.close();
    }
}
