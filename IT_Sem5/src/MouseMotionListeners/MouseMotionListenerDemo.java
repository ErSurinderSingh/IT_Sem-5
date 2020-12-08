package MouseMotionListeners;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class MouseMotionListenerDemo extends JFrame implements MouseMotionListener {

    Label l;
    Color c = Color.BLUE;

    MouseMotionListenerDemo() {
        l = new Label();
        l.setBounds(20, 40, 100, 20);
        add(l);
        addMouseMotionListener(this);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void mouseDragged(MouseEvent e) {
        l.setText("X=" + e.getX() + ", Y=" + e.getY());
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(), e.getY(), 20, 20);
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("X=" + e.getX() + ", Y=" + e.getY());
    }

    public static void main(String[] args) {
        new MouseMotionListenerDemo();
    }
}
