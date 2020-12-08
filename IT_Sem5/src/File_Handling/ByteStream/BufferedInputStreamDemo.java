package File_Handling.ByteStream;

// Java program to demonstrate working of BufferedInputStream 
import java.io.*;

// Java program to demonstrate BufferedInputStream methods 
class BufferedInputStreamDemo {

    public static void main(String args[]) throws IOException {
        try {// attach the file to FileInputStream 

            String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\ByteStream\\input.txt";

//            FileInputStream fin = new FileInputStream(path);
//            
//            BufferedInputStream bin = new BufferedInputStream(fin);
            
            BufferedInputStream bin = new BufferedInputStream(new FileInputStream(path));

            // illustrating available method 
            System.out.println("Number of remaining bytes:" + bin.available());

            // illustrating markSupported() and mark() method 
            boolean b = bin.markSupported();
            System.out.println(b);
            
            if (b) {
                bin.mark(200);
            }

            // illustrating skip method 
            /*Original File content: 
		* This is my first line 
		* This is my second line*/
            bin.skip(4);
            System.out.println("\nFileContents :");

            // read characters from FileInputStream and 
            // write them 
            int ch;
            while ((ch = bin.read()) != -1) {
                System.out.print((char) ch);
            }

            // illustrating reset() method 
            bin.reset();
            System.out.println("\n\n");
            while ((ch = bin.read()) != -1) {
                System.out.print((char) ch);
            }

            // close the file 
            //fin.close();
            bin.close();
        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        }
    }
}
