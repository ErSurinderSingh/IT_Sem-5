package AWT_and_Swings;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JSlider_Color extends JFrame implements ChangeListener{
    JLabel l1, l2, l3, l4, l5, l6;
    JSlider js1, js2, js3, c1,c2,c3;
    JPanel p1;
    int c4,c5,c6;
    
    public JSlider_Color(){
        super("SETTING BACKGROUND COLOR USING JSLIDERS");
        p1 = new JPanel();
        l1 = new JLabel("Red:  ");
        l2 = new JLabel("Value");
        l3 = new JLabel("Green:  ");
        l4 = new JLabel("Value");
        l5 = new JLabel("Blue:  ");
        l6 = new JLabel("Value");
        js1 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        js2 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        js3 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        js1.addChangeListener(this);
        js2.addChangeListener(this);
        js3.addChangeListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(200, 200);
        p1.add(l1);p1.add(l2);
        l1.setForeground(Color.black);
        l2.setForeground(Color.black);
        p1.add(js1);
        p1.add(l3);p1.add(l4);
        l3.setForeground(Color.black);
        l4.setForeground(Color.black);
        p1.add(js2);
        p1.add(l5);p1.add(l6);
        l5.setForeground(Color.black);
        l6.setForeground(Color.black);
        p1.add(js3);
        getContentPane().add(p1);
    }
    
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == js1) {
            c1 = (JSlider) e.getSource();
            l2.setText(String.valueOf(c1.getValue()));
            c4 = Integer.parseInt(l2.getText());
        } else if (e.getSource() == js2) {
            c2 = (JSlider)e.getSource();
            l4.setText(String.valueOf(c2.getValue()));
            c5 = Integer.valueOf(l4.getText()).intValue();
        }else {
            c3 = (JSlider)e.getSource();
            l6.setText(String.valueOf(c3.getValue()));
            c6= Integer.valueOf(l6.getText()).intValue();
        }
        
        Color c = new Color(c4,c5,c6);
        p1.setBackground(c);
        //System.out.println("Color Is :" + c.toString());
    }
    

    public static void main(String args[]) {
        new JSlider_Color();
    }
}