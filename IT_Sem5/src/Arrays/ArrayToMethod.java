package Arrays;

import java.util.Scanner;

class Array{
    int a [] = new int [10];
    void getArray() {
        Scanner S = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.print("\nEnter Array value " + (i+1) + ": ");
            a[i] = S.nextInt();
        }
        Add2(a);
    }

    int [] Add2(int A[]) {
        for(int j = 0; j < A.length; j++){
            if(j % 2 == 0)
                A[j] += 2;
            else
                A[j] = 0;
        }
    return A;
    }

    void disp() {
        System.out.println("New Array is:");
        for(int i = 0; i< a.length; i++)
            System.out.print(a[i] + "\t");
    }
}

public class ArrayToMethod {
    public static void main(String[] args) {
        Array arr = new Array();
        arr.getArray();
        //arr.Add2(a);
        arr.disp();
    }

}
