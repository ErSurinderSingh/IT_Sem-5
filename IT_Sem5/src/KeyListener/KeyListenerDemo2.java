package KeyListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class KeyListenerDemo2 extends JFrame implements KeyListener {

    Label l;
    TextArea area;

    KeyListenerDemo2() {

        l = new Label();
        l.setBounds(20, 50, 200, 20);
        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);

        add(l);
        add(area);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
        String text = area.getText();
        String words[] = text.split("\\s");
        l.setText("Words: " + words.length + " Characters:" + text.length());
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new KeyListenerDemo2();
    }
}
