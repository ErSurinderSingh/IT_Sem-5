package AdjustmentListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class AdjustmentListenerDemo extends JFrame implements AdjustmentListener {

    AdjustmentListenerDemo(){
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void init() {
        setLayout(new BorderLayout());

        // A plain scrollbar that delegates to the applet
        Scrollbar sbar_west = new Scrollbar();

        sbar_west.addAdjustmentListener(this);
        add(sbar_west, "West");

        // A subclass that handles its own adjustment events
        SelfScrollbar sbar_east = new SelfScrollbar();

        add(sbar_east, "East");
    }

    public void adjustmentValueChanged(AdjustmentEvent AdjEvt) {
        System.out.println("scrollbar #West:" + AdjEvt.getValue());
    }
    
    public static void main(String[] args) {
        AdjustmentListenerDemo adjust = new AdjustmentListenerDemo();
        adjust.init();
    }
}

class SelfScrollbar extends Scrollbar {

    public SelfScrollbar() {
        enableEvents(AWTEvent.ADJUSTMENT_EVENT_MASK);
    }

    public void processAdjustmentEvent(AdjustmentEvent AdjEvt) {
        System.out.println("Scrollbar #East:" + AdjEvt.getValue());
    }
}
