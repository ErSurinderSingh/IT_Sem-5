/*WAP to create a sequential file that can store details of 5 products.
Prod code, name, cost & no of items availabale.
provided thro keyboard.*/
package File_Handling.ByteStream;

import java.io.*;
import java.util.StringTokenizer;
//this is a sentence 
//default delimiter space
//delim ;-,
public class ExamQuest {

    static String pcode, pcost, noa, pname;

    public static void main(String[] args) throws IOException {

        String path = "I:\\NetBeansProjects\\IT_Sem5\\src\\File_Handling\\ByteStream\\product.txt";
        StringTokenizer S;

        DataInputStream dis = new DataInputStream(System.in);
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(path));
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print("\nEnter Product Name:");
                S = new StringTokenizer(dis.readLine());
                pname = S.nextToken();

                System.out.print("\n Eneter Product Code:");
                S = new StringTokenizer(dis.readLine());
                pcode = S.nextToken();

                System.out.print("\n Eneter Product Cost:");
                S = new StringTokenizer(dis.readLine());
                pcost = S.nextToken();

                System.out.print("\n Eneter Availabale Quantity:");
                S = new StringTokenizer(dis.readLine());
                noa = S.nextToken();

                //WRITING DATA TO FILE
                dos.writeUTF(pcode);
                dos.writeUTF(pname);
                dos.writeUTF(pcost);
                dos.writeUTF(noa);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        DataInputStream di = new DataInputStream(new FileInputStream(path));

        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("==========Product Details==========");
                System.out.println("Product Code: " + di.readUTF());
                System.out.println("Product Name: " + di.readUTF());
                System.out.println("Cost: " + di.readUTF());
                System.out.println("No of Avail Items: " + di.readUTF());
                System.out.println();

            }
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            di.close();
        }
    }

}
