package Layout_Managers;


import java.awt.GridLayout;
import javax.swing.*;

public class GridLayoutDemo extends JFrame{

    public GridLayoutDemo() {
        init();
    }
    
    
    void init(){
        JButton b1 = new JButton("Button 1");
        add(b1);
        JButton b2 = new JButton("Button 2");
        add(b2);
        JButton b3 = new JButton("Button 3");
        add(b3);
        JButton b4 = new JButton("Button 4");
        add(b4);
        JButton b5 = new JButton("Button 5");
        add(b5);
        
        setVisible(true);
        setSize(500, 500);
        
        //constructors of Grid Layout
        setLayout(new GridLayout());
        
        setLayout(new GridLayout(3, 3));
        setLayout(new GridLayout(3, 3, 10, 10));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new GridLayoutDemo();
        
    }
}
