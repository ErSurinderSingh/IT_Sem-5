package Arrays;


import java.util.Scanner;

class Array1{

    Scanner S = new Scanner(System.in);
    int arr[][] = new int[3][5];

    void getData() {
        System.out.println("Enter Array Values: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = S.nextInt();
            }
        }
        changetToOne(arr);
    }

    void changetToOne(int[][] A) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (A[i][j] % 3 == 0) {
                    A[i][j] = 1;
                } else {
                    A[i][j] = 0;
                }
            }
        }
    }

    void disp() {
        System.out.println("New Array Values: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

}
public class ArrayTest{
        public static void main(String [] a){
            Array1 z = new Array1();
            z.getData();
            z.disp();
}
    
}
