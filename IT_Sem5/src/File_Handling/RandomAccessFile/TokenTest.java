
package File_Handling.RandomAccessFile;
import java.awt.BorderLayout;
import java.util.*;


public class TokenTest {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = S.nextLine(),
                delim =",";
        
        StringTokenizer tokens = new StringTokenizer(s);
        
        System.out.println("No of Tokens: " + tokens.countTokens());
        
        while(tokens.hasMoreTokens())
            System.out.println("Tokens Are: " + tokens.nextToken(delim));
    }
}
