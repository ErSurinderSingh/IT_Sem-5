package AWT_and_Swings;

import java.awt.event.*;
import javax.swing.*;

public class JComboBox_Test extends JFrame implements ItemListener{
    
    JComboBox cb1;          JPanel p;           JLabel l;           ImageIcon ico;          String path;
    
    String a[] = {"bug.png","bug2.gif","buganim.gif","travelbug.gif"};
    private Icon icons[] = { new ImageIcon(a[0]), new ImageIcon(a[1]),  new ImageIcon(a[2]), new ImageIcon(a[3]) };
    
    public JComboBox_Test(){
        super("JComboBox Test");
        setVisible(true);
        setSize(1024,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        path = "E:\\SEM 5\\2019-20\\IT3\\src\\Imgs\\";
        
        
        cb1 = new JComboBox(a);
        cb1.addItemListener(this);
        p = new JPanel();
        l = new JLabel();
        
        p.add(cb1);             p.add(l);
        
        getContentPane().add(p);
    }
    
    public void itemStateChanged(ItemEvent e){
        ico = new ImageIcon(path+ icons[cb1.getSelectedIndex()]);
        l.setIcon(ico);
    }
    
    public static void main(String args[]){
        new JComboBox_Test();
    }
}
