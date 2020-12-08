package Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        //declaring a source array  
        char[] copyFrom = {'I', 'L', 'o', 'v', 'e', 'J', 'a', 'v', 'a', 'P', 'r', 'o', 'g', 'r', 'a', 'm', };
        //declaring a destination array  
        char[] copyTo = new char[8];
        //copying array using System.arraycopy() method  
        System.arraycopy(copyFrom, 1, copyTo, 0, 8);
        //printing the destination array  
        System.out.println(String.valueOf(copyTo));
    }
}

/*String s1 = "JAVA PROGRAMMING";
        String s2 = "Java PROGRAMMING";
        if (s1 == s2)
            System.out.println("Equal");
        else
            System.out.println("Not Equal");*/
