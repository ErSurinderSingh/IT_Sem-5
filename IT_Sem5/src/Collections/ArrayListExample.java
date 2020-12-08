package Collections;

import java.util.*;

public class ArrayListExample {

    //Creating arraylist
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String args[]) {
        //Adding object in arraylist  
        System.out.println("IS List Empty?: " +list.isEmpty());
        list.add("Mango");  
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //list.add(1);
        System.out.println(list);
        addMoreFruits();
        //Printing the arraylist object   
        System.out.println(list);
        sortFruits();
    }

    static public void addMoreFruits() {
        list.add("Pineapple");
        list.add(2,"Orange");
        list.add("Kiwi");
    }
    
    static public void sortFruits(){
        Collections.sort(list);
        System.out.println(list);
        
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        System.out.println("Size of List:" + list.size());
    }
}
