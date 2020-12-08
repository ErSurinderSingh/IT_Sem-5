
package File_Handling.ByteStream;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamDEmo {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);
        int a , b;
        
        try{
            System.out.println("Enter 1st Number: ");
            a = Integer.parseInt(dis.readLine());
            //a = dis.readInt();
            
            System.out.println("Enter 2nd Number: ");
            b = Integer.parseInt(dis.readLine());
            
            System.out.println("Sum = " + (a + b));
        }catch(IOException e){
            
        }
        
        
    }
}
