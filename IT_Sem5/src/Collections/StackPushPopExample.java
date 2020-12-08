package Collections;

import java.util.*;

public class StackPushPopExample {

    public static void main(String args[]) {
        //creating an object of Stack class  
        Stack<Integer> stk = new Stack<>();
        System.out.println("stack: " + stk);
        //pushing elements into the stack  
        addItems(stk, 20);
        addItems(stk, 13);
        addItems(stk, 89);
        addItems(stk, 90);
        addItems(stk, 11);
        addItems(stk, 45);
        addItems(stk, 18);
        //popping elements from the stack  
        removeItems(stk);
        removeItems(stk);
        //throws exception if the stack is empty  
        try {
            removeItems(stk);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }

    //performing push operation  
    static void addItems(Stack stk, int x) {
        //invoking push() method      
        stk.push(new Integer(x));
        System.out.println("push -> " + x);
        //prints modified stack  
        System.out.println("stack: " + stk);
    }

    //performing pop operation  
    static void removeItems(Stack stk) {
        System.out.print("pop -> ");
        //invoking pop() method   
        Integer x = (Integer) stk.pop();
        System.out.println(x);
        //prints modified stack  
        System.out.println("stack: " + stk);
    }
}
