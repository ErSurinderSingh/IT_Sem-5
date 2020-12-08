package Layout_Managers;

import java.awt.event.*;
import static java.lang.Math.abs;
import javax.swing.*;

public class Multi_Button extends JFrame implements ActionListener {

    JLabel lbl_msg1, lbl_msg2, lbl_result;
    JTextField txt_num1, txt_num2, txt_result;
    JButton btn_add, btn_sub, btn_mul, btn_div, btn_exit;

    public Multi_Button() {
        init();
    }

    public void init() {
        setLayout(null);

        lbl_msg1 = new JLabel("Enter First Number: ");
        lbl_msg1.setBounds(20, 50, 150, 100);
        add(lbl_msg1);

        txt_num1 = new JTextField();
        txt_num1.setBounds(200, 90, 120, 30);
        add(txt_num1);

        lbl_msg2 = new JLabel("Enter Second Number:");
        lbl_msg2.setBounds(20, 110, 150, 100);
        add(lbl_msg2);

        txt_num2 = new JTextField();
        txt_num2.setBounds(200, 150, 120, 30);
        add(txt_num2);

        lbl_result = new JLabel("Result: ");
        lbl_result.setBounds(20, 170, 150, 100);
        add(lbl_result);

        txt_result = new JTextField();
        txt_result.setBounds(200, 210, 120, 30);
        txt_result.setEditable(false);
        add(txt_result);

        btn_add = new JButton("Add");
        btn_add.setBounds(20, 270, 100, 30);
        add(btn_add);
        btn_add.addActionListener(this);

        btn_sub = new JButton("Subtract");
        btn_sub.setBounds(150, 270, 100, 30);
        add(btn_sub);
        btn_sub.addActionListener(this);

        btn_mul = new JButton("Multiply");
        btn_mul.setBounds(280, 270, 100, 30);
        add(btn_mul);
        btn_mul.addActionListener(this);

        btn_div = new JButton("Divide");
        btn_div.setBounds(20, 330, 100, 30);
        add(btn_div);
        btn_div.addActionListener(this);

        btn_exit = new JButton("Exit");
        btn_exit.setBounds(150, 330, 100, 30);
        add(btn_exit);
        btn_exit.addActionListener(this);

        setVisible(true);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int a = Integer.parseInt(txt_num1.getText());
        int b = Integer.parseInt(txt_num2.getText());

        if (e.getActionCommand().equals("Add")) {
            int c = a + b;
            txt_result.setText(String.valueOf(c));
        } else if (e.getActionCommand().equals("Subtract")) {
            Integer c = abs(a - b);
            txt_result.setText(c.toString());
        } else if (e.getActionCommand().equals("Multiply")) {
            Integer c = a * b;
            txt_result.setText(c.toString());
        } else if (e.getActionCommand().equals("Divide")) {
            Integer c = a / b;
            txt_result.setText(c.toString());
        }else
            System.exit(0);
    }

    public static void main(String[] args) {
        new Multi_Button();
    }
}
