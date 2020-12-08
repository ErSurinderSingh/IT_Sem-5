package AWT_and_Swings;


import java.awt.*;

public class AWTControls1{

    //Declarig the required controls.
    Label lbl_Enrollno, lbl_name, lbl_Mobile, lbl_Sem, lbl_Branch, lbl_city, lbl_age, lbl_gender;
    TextField txt_enroll, txt_name, txt_mob, txt_city;
    Choice ch_sem;
    Checkbox ckbx_g1,ckbx_g2;
    List lst_branch, lst_age;
    Button btn_Submit;

    Frame f;

    AWTControls1() {
        initialize();
    }
    
    void initialize(){
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

        txt_enroll = new TextField();
        txt_enroll.setBounds(200, 80, 150, 30);
        
        txt_name = new TextField();
       
        
        txt_mob = new TextField();
        txt_city = new TextField();

        ch_sem = new Choice();
        ch_sem.add("1");
        ch_sem.add("3");
        ch_sem.add("5");
        ch_sem.add("7");
        
        ckbx_g1 = new Checkbox("Female");
        ckbx_g2 = new Checkbox("Male");
        
        btn_Submit = new Button("Submit");
        
        lst_age = new List(5);
        lst_age.add("16");
        lst_age.add("17");
        lst_age.add("18");
        lst_age.add("19");
        lst_age.add("20");
        
        lst_branch = new List(5);
        lst_branch.add("CSE");
        lst_branch.add("IT");
        lst_branch.add("EC");
        lst_branch.add("ME");
        lst_branch.add("CE");
        
        //creating frame to hold components
        f = new Frame("Student Information");
        
        //adding components to frame
        f.add(lbl_Enrollno);
        f.add(txt_enroll);
        
        f.add(lbl_name);
        f.add(txt_name);
        
        f.add(lbl_Mobile);
        f.add(txt_mob);
        
        f.add(lbl_Sem);
        f.add(ch_sem);
        
        f.add(lbl_Branch);
        f.add(lst_branch);
        
        f.add(lbl_city);
        f.add(txt_city);
        
        f.add(lbl_age);
        f.add(lst_age);
        
        f.add(lbl_gender);
        f.add(ckbx_g1);
        f.add(ckbx_g2);
        
        //setting frame to visible
        f.setVisible(true);
        
        //setting size of frame
        f.setSize(500,500);
        
        //setting layout to null
        f.setLayout(null);
    }
    
    public static void main(String[] args) {
        AWTControls1 awtControls = new AWTControls1();
    }
}
