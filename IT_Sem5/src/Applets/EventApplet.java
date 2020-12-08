/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applets;

    import java.applet.*;  
    import java.awt.*;  
    import java.awt.event.*;  
    public class EventApplet extends Applet implements ActionListener{  
    Button b;  
    TextField tf;  
      
    public void init(){  
    tf=new TextField();  
    tf.setBounds(30,40,150,20);  
      
    b=new Button("Click");  
    b.setBounds(80,150,60,50);  
      
    add(b);add(tf);  
    b.addActionListener(this);  
      
    setLayout(null);  
    }  
      
     public void actionPerformed(ActionEvent e){  
      tf.setText("Welcome");  
     }   
    }  
/*<applet code="EventApplet.class" width="300" height="300"></applet> */
