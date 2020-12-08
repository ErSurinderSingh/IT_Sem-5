package Exception_Handling;

public class ThrowDemo {

    static void check(int age) throws ArithmeticException {
        /*try {
            if (age < 18) {
                //throw new ArithmeticException("Not Eligible to Vote");
            } else {
                System.out.println("U R Eligible for voting");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }*/
//        int a[5];
//        a[9] = 9;
    }

    public static void main(String[] args) {
        check(17);
        System.out.println("Main Ends....");
    }
}
