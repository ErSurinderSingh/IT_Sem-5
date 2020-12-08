package Exception_Handling;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a,b;
        Scanner S = new Scanner(System.in);
        a = S.nextInt();
        b = S.nextInt();
        System.out.println("Division Result:" + (a/b));
        System.out.println("Program Completes Successfully......");
    }
}
