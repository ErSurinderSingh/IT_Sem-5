package Exception_Handling;

public class ThrowDemo1 {

    public static void main(String[] args) {
        int a = 25, b = 0;
        try {
            System.out.println(a/b);
            throw new ArithmeticException("Division by ZERO is not possible");
        }catch(Exception e){
            //System.out.println(e.toString());
        }
    }
}
