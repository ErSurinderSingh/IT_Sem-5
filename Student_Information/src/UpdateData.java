
import java.sql.*;
import javax.swing.*;

public class UpdateData extends JFrame {

    Connection con;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    public UpdateData() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_roll = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbl_ResAdd = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_mob = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_gen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_sem = new javax.swing.JTextField();
        txt_branch = new javax.swing.JTextField();
        txt_dob = new javax.swing.JTextField();
        btn_Update = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_city = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_enroll = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Update Student Data");
        jLabel1.setToolTipText("");

        jLabel2.setText("Enter Mobile No:");

        txt_roll.setEditable(false);
        txt_roll.setDragEnabled(true);
        txt_roll.setName("txt_roll"); // NOI18N

        txt_name.setEditable(false);
        txt_name.setName("txt_name"); // NOI18N

        jLabel3.setText("Enter Name:");

        jLabel5.setText("Enter Enrollment No:");

        txt_mob.setDragEnabled(true);
        txt_mob.setName("txt_num1"); // NOI18N

        jLabel4.setText("Gender:");

        txt_gen.setEditable(false);

        jLabel6.setText("Semester:");

        jLabel7.setText("Branch:");

        jLabel8.setText("DOB:");

        txt_branch.setEditable(false);

        txt_dob.setEditable(false);

        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        jLabel9.setText("City:");

        jLabel10.setText("Enter Enrollment No:");

        txt_enroll.setDragEnabled(true);
        txt_enroll.setName("txt_roll"); // NOI18N

        btn_Search.setText("Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Update)
                .addGap(372, 372, 372))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_name)
                                    .addComponent(txt_roll)
                                    .addComponent(txt_mob)
                                    .addComponent(txt_gen)
                                    .addComponent(txt_sem)
                                    .addComponent(txt_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(74, 74, 74)
                        .addComponent(lbl_ResAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txt_enroll, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btn_Search))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_enroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_Search)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_gen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_sem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addComponent(lbl_ResAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btn_Update)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void connect() {

        try {
            //step 1 load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step 2 create connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "javaee");
        } catch (Exception e) {

        }
    }
    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        connect();
        String query = "UPDATE student_info SET Enrollment_No = ?, S_Name = ?, Mobile = ?, Gender = ?,"
                + "Semester = ?, Branch = ?, DOB = ?, City = ? WHERE Enrollment_No = '"+ txt_roll.getText()+"'" ;
        try{
            pst = con.prepareStatement(query);
            
            pst.setString(1, txt_roll.getText());  
            pst.setString(2, txt_name.getText());
            pst.setInt(3, Integer.parseInt(txt_mob.getText()));
            pst.setString(4, txt_gen.getText());
            pst.setInt(5, Integer.parseInt(txt_sem.getText()));
            pst.setString(6, txt_branch.getText());
            pst.setString(7, txt_dob.getText());
            pst.setString(8, txt_city.getText());
            pst.executeUpdate();

            System.out.println("Values Updated.....");
            this.setVisible(false);
            DisplayData dd = new DisplayData();
            dd.setVisible(true);
            
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        // TODO add your handling code here:
        connect();
        String query = "SELECT * FROM student_info WHERE Enrollment_No = '" + txt_enroll.getText() + "'";
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            if (rs.next()) {
                    txt_roll.setText(rs.getString(1));
                    txt_name.setText(rs.getString(2));
                    txt_mob.setText(rs.getString(3));
                    txt_gen.setText(rs.getString(4));
                    txt_sem.setText(rs.getString(5));
                    txt_branch.setText(rs.getString(6));
                    txt_dob.setText(rs.getString(7));
                    txt_city.setText(rs.getString(8));
                    con.close();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Record does not Exists.....");
            }

        } catch (Exception e) {

        }


    }//GEN-LAST:event_btn_SearchActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager
                            .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info
                        .getName())) {
                    javax.swing.UIManager
                            .setLookAndFeel(info
                                    .getClassName());

                    break;

                }
            }
        } catch (Exception ex) {
            
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue
                .invokeLater(new Runnable() {
                    public void run() {
                        new UpdateData().setVisible(true);

                    }
                });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_ResAdd;
    private javax.swing.JTextField txt_branch;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_dob;
    private javax.swing.JTextField txt_enroll;
    private javax.swing.JTextField txt_gen;
    private javax.swing.JTextField txt_mob;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_roll;
    private javax.swing.JTextField txt_sem;
    // End of variables declaration//GEN-END:variables
}
