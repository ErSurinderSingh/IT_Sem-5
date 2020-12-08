package Exception_Handling;

public class ExceptionPropagationDemo {

    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p(){
        n();
    }
    void q() {
       try {
            p();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }
    

    public static void main(String args[]) {
        ExceptionPropagationDemo obj = new ExceptionPropagationDemo();
        //try{
            obj.q();
        /*}catch(Exception e){
            System.out.println(e.toString());
        }*/
        System.out.println("normal flow...");
    }
}
