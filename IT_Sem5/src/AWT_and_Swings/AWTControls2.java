package AWT_and_Swings;


import java.awt.*;

public class AWTControls2 extends Frame /*implements ActionListener*/{

    //Declarig the required controls.
    Label lbl_Enrollno, lbl_name, lbl_Mobile, lbl_Sem, lbl_Branch, lbl_city, lbl_age, lbl_gender;
    TextField txt_enroll, txt_name, txt_mob, txt_city;
    Choice ch_sem;
    Checkbox ckbx_g1,ckbx_g2;
    List lst_branch, lst_age;
    Button btn_Submit;

    Frame f;    

    AWTControls2() {
        initialize();
    }
    
    void initialize(){
        //creating panel to hold components
        
    
        //creating the components
        lbl_Enrollno = new Label("Enter Enrollment Number:");
        lbl_Enrollno.setBounds(20, 50, 150, 100);
        
        lbl_name = new Label("Enter Name:");
        lbl_name.setBounds(20, 110, 150, 100);
        
        lbl_Mobile = new Label("Enter Contact Number:");
        lbl_Mobile.setBounds(20, 170, 150, 100);
        
        lbl_Sem = new Label("Select Your Semester:");
        lbl_Sem.setBounds(20, 230, 150, 100);
        
        lbl_Branch = new Label("Select Your Branch:");
        lbl_Branch.setBounds(20, 290, 150, 100);
        
        lbl_city = new Label("Enter City:");
        lbl_city.setBounds(20, 350, 150, 100);
        
        lbl_age = new Label("Select Your Age:");
        lbl_age.setBounds(20, 410, 150, 100);
        
        lbl_gender = new Label("Select Your Gender:");
        lbl_gender.setBounds(20, 470, 150, 100);

        txt_enroll = new TextField("1");
        txt_enroll.setBounds(200, 80, 150, 30);
        
        txt_name = new TextField("2");
        txt_name.setBounds(300, 80, 150, 30);
        
        txt_mob = new TextField("3");
        txt_mob.setBounds(200, 190, 150, 30);
        
        txt_city = new TextField("4");
        txt_city.setBounds(200, 250, 150, 30);

        ch_sem = new Choice();
        ch_sem.add("1");
        ch_sem.add("3");
        ch_sem.add("5");
        ch_sem.add("7");
        ch_sem.setBounds(200, 310, 150, 30);
        
        CheckboxGroup cbg = new CheckboxGroup(); 
        ckbx_g1 = new Checkbox("Female",cbg,false);
        ckbx_g2 = new Checkbox("Male",cbg,false);
        ckbx_g1.setBounds(200, 80, 150, 30);
        ckbx_g2.setBounds(250, 80, 150, 30);
        System.out.println(ckbx_g1.getSelectedObjects().toString());
        
        btn_Submit = new Button("Submit");
        
        //adding Action Listner to Button
        //btn_Submit.addActionListener(this);
        
        lst_age = new List(5);
        lst_age.add("16");
        lst_age.add("17");
        lst_age.add("18");
        lst_age.add("19");
        lst_age.add("20");
        System.out.println(lst_age.getSelectedItem());
        
        lst_branch = new List(5);
        lst_branch.add("CSE");
        lst_branch.add("IT");
        lst_branch.add("EC");
        lst_branch.add("ME");
        lst_branch.add("CE");
        
        //adding components to frame
        /*p.add(lbl_Enrollno);     
        p.add(lbl_name);
        p.add(lbl_Mobile);
        p.add(lbl_Sem);
        p.add(lbl_Branch);
        p.add(lbl_city);
        p.add(lbl_age);
        p.add(lbl_gender); */
        
        add(txt_enroll);
        add(txt_name);       
        add(txt_mob);
        add(ch_sem);
        add(lst_branch);
        add(txt_city);
        add(lst_age);
        add(ckbx_g1);
        add(ckbx_g2);
        
        //setting visible
        setVisible(true);
        
        //setting size of frame
        setSize(500,500);
        
        //setting layout to null
        setLayout(null);
        
        
    }
    
    public static void main(String[] args) {
      new AWTControls1();
    }
}
