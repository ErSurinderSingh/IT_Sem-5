package AWT_and_Swings;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swing_Controls extends JFrame implements ActionListener, ItemListener {

    JLabel lbl_enroll, lbl_name, lbl_Mobile, lbl_Sem, lbl_Branch, lbl_city, lbl_age, lbl_gender;
    JTextField txt_roll, txt_name, txt_mob, txt_city;
    JComboBox ch_sem, ch_age;
    JRadioButton rbtn_g1, rbtn_g2;
    JList lst_branch;
    JButton btn_Submit;
    String gender;

    Swing_Controls() {
        super("Student Information");
        init();
    }

    public void init() {
        lbl_enroll = new JLabel("Enter Enrollment Number: ");
        lbl_enroll.setBounds(20, 50, 150, 100);
        add(lbl_enroll);

        txt_roll = new JTextField();
        txt_roll.setBounds(200, 90, 120, 30);
        add(txt_roll);

        lbl_name = new JLabel("Enter Name:");
        lbl_name.setBounds(20, 110, 150, 100);
        add(lbl_name);

        txt_name = new JTextField();
        txt_name.setBounds(200, 150, 120, 30);
        add(txt_name);

        lbl_Mobile = new JLabel("Enter Contact Number: ");
        lbl_Mobile.setBounds(20, 170, 150, 100);
        add(lbl_Mobile);

        txt_mob = new JTextField();
        txt_mob.setBounds(200, 210, 120, 30);
        add(txt_mob);

        lbl_Sem = new JLabel("Select Your Semester:");
        lbl_Sem.setBounds(20, 230, 150, 100);
        add(lbl_Sem);

        /*ch_sem = new ComboBox();
        ch_sem.add("1");
        ch_sem.add("3");
        ch_sem.add("5");
        ch_sem.add("7");
        ch_sem.setBounds(200, 270, 120, 30);
        add(ch_sem);*/

        lbl_Branch = new JLabel("Select Your Branch:");
        lbl_Branch.setBounds(20, 290, 150, 100);
        add(lbl_Branch);

        /*lst_branch = new List(5);
        lst_branch.add("CSE",1);
        lst_branch.add("IT");
        lst_branch.add("EC");
        lst_branch.add("ME");
        lst_branch.add("CE");
        lst_branch.setBounds(200, 330, 120, 50);
        add(lst_branch);*/

        lbl_age = new JLabel("Select Your Age:");
        lbl_age.setBounds(20, 350, 150, 100);
        add(lbl_age);

        /*ch_age = new Choice();
        ch_age.add("17");
        ch_age.add("18");
        ch_age.add("19");
        ch_age.add("20");
        ch_age.setBounds(200, 390, 120, 30);
        add(ch_age);*/

        lbl_city = new JLabel("Enter City:");
        lbl_city.setBounds(20, 410, 150, 100);
        add(lbl_city);

        txt_city = new JTextField();
        txt_city.setBounds(200, 450, 120, 30);
        add(txt_city);

        lbl_gender = new JLabel("Select Gender:");
        lbl_gender.setBounds(20, 470, 150, 100);
        add(lbl_gender);

        //CheckboxGroup cbg = new CheckboxGroup();
        rbtn_g1 = new JRadioButton("Female");
        rbtn_g1.setBounds(200, 510, 100, 30);
        add(rbtn_g1);
        rbtn_g1.addItemListener(this);

        rbtn_g2 = new JRadioButton("Male");
        rbtn_g2.setBounds(300, 510, 100, 30);
        add(rbtn_g2);
        rbtn_g2.addItemListener(this);

        btn_Submit = new JButton("Submit");
        btn_Submit.setBounds(150, 570, 120, 50);
        add(btn_Submit);
        btn_Submit.addActionListener(this);

        setLayout(null);

        // make the frame half the height and width
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        setSize(width / 2, height / 2);
        setLocationRelativeTo(this);

        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == rbtn_g1) {
            gender = (e.getStateChange() == 1 ? "Female" : "Male");
        } else {
            if (e.getSource() == rbtn_g2) {
                gender = (e.getStateChange() == 1 ? "Male" : "Female");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.print("Button " + e.getActionCommand() + " selected");
        System.out.print("\n\t\t\t\tStudent's Information\nEnrollment No: " + txt_roll.getText() + "\nName: " + txt_name.getText());
        System.out.print("\nContact Number: " + txt_mob.getText() + "\nSemester: " + ch_sem.getSelectedItem());
        System.out.print(/*"\nBranch: " + lst_branch.getSelectedItem() +*/ "\nAge: " + ch_age.getSelectedItem());
        System.out.print("\nCity: " + txt_city.getText() + "\nGender: " + gender);
    }

    public static void main(String[] args) {
        Swing_Controls awt = new Swing_Controls();
    }

}
