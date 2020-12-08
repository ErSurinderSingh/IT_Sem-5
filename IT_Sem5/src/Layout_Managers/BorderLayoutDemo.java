package Layout_Managers;


import java.awt.BorderLayout;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame{

    public BorderLayoutDemo() {
        init();
    }
    
    
    void init(){
        JButton b1 = new JButton("Button 1");
        add(b1,BorderLayout.NORTH);
        JButton b2 = new JButton("Button 2");
        add(b2,BorderLayout.SOUTH);
        JButton b3 = new JButton("Button 3");
        add(b3,BorderLayout.EAST);
        JButton b4 = new JButton("Button 4");
        add(b4,BorderLayout.WEST);
        JButton b5 = new JButton("Button 5");
        add(b5,BorderLayout.CENTER);
        
        setVisible(true);
        setSize(500, 500);
        
        //constructors of Grid Layout
        //setLayout(new BorderLayout());
        
        setLayout(new BorderLayout(10, 10));

        //setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new BorderLayoutDemo();
        
    }
}
