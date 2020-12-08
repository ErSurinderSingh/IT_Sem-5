package Layout_Managers;

import java.awt.FlowLayout;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame{

    public FlowLayoutDemo() {
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
        
        //constructors of Flow Layout
        //setLayout(new FlowLayout());
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        /*setLayout(new FlowLayout(FlowLayout.CENTER));
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setLayout(new FlowLayout(FlowLayout.LEADING));
        setLayout(new FlowLayout(FlowLayout.TRAILING));
        
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));*/
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new BorderLayoutDemo();
        
    }
}
