package Keyword_Static;

class A2 {
    static int num;
    static {  
         num = 98;
        System.out.println("static block 1 is invoked");
    }
    
    static {  
        num = 100;
        System.out.println("static block 2 is invoked");
    }
    public static void main(String args[]) {
        System.out.println(num);
        System.out.println("Hello main" );
    }
}
