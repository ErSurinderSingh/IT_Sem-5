package Swing_Notepad_Application;

import java.awt.Font;
import java.io.*;
import javax.swing.*;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.*;

public class NotepadApplication extends JFrame implements UndoableEditListener {

    JFileChooser jfc;
    Font font = new Font("Courier New", Font.PLAIN, 18);
    UndoManager manager = new UndoManager();

    public NotepadApplication() {
        super("My Notepad Application");
        initComponents();
        txt_content.setFont(font);
        txt_content.getDocument().addUndoableEditListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jSeparator4 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_content = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        btn_new = new javax.swing.JButton();
        btn_open = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_new = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmi_open = new javax.swing.JMenuItem();
        jmi_save = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_undo = new javax.swing.JMenuItem();
        jmi_redo = new javax.swing.JMenuItem();
        jmi_cut = new javax.swing.JMenuItem();
        jmi_copy = new javax.swing.JMenuItem();
        jmi_paste = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmi_selectall = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jmi_font_regular = new javax.swing.JMenuItem();
        jmi_font_bold = new javax.swing.JMenuItem();
        jmi_font_italics = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("jMenu5");

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenu8.setText("jMenu8");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_content.setColumns(20);
        txt_content.setRows(5);
        jScrollPane2.setViewportView(txt_content);

        jToolBar1.setRollover(true);

        btn_new.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new.png"))); // NOI18N
        btn_new.setToolTipText("Creates a new file (Ctrl + N)");
        btn_new.setFocusable(false);
        btn_new.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_new.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_new);

        btn_open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/open.png"))); // NOI18N
        btn_open.setToolTipText("Opens a selected File");
        btn_open.setFocusable(false);
        btn_open.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_open.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_open);

        jMenu1.setText("File");

        jmi_new.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmi_new.setText("New");
        jmi_new.setToolTipText("Clears the Text Area");
        jmi_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_newActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_new);
        jMenu1.add(jSeparator2);

        jmi_open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jmi_open.setText("Open");
        jmi_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_openActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_open);

        jmi_save.setText("Save");
        jmi_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_saveActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_save);
        jMenu1.add(jSeparator1);

        jmi_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        jmi_exit.setText("Exit");
        jmi_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_exitActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jmi_undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jmi_undo.setText("Undo");
        jmi_undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_undoActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_undo);

        jmi_redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jmi_redo.setText("Redo");
        jmi_redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_redoActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_redo);

        jmi_cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jmi_cut.setText("Cut");
        jmi_cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cutActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_cut);

        jmi_copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmi_copy.setText("Copy");
        jmi_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_copyActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_copy);

        jmi_paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jmi_paste.setText("Paste");
        jmi_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_pasteActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_paste);
        jMenu2.add(jSeparator3);

        jmi_selectall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmi_selectall.setText("Select All");
        jmi_selectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_selectallActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_selectall);

        jMenuBar1.add(jMenu2);

        jMenu9.setText("Fonts");

        jmi_font_regular.setText("Regular");
        jMenu9.add(jmi_font_regular);

        jmi_font_bold.setText("Bold");
        jmi_font_bold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_font_boldActionPerformed(evt);
            }
        });
        jMenu9.add(jmi_font_bold);

        jmi_font_italics.setText("Italics");
        jMenu9.add(jmi_font_italics);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmi_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_saveActionPerformed
        String text = txt_content.getText();
        // Create an object of JFileChooser class 
        JFileChooser j = new JFileChooser();
        // Invoke the showsSaveDialog function to show the save dialog 
        int r = j.showSaveDialog(this);
        if (r == JFileChooser.APPROVE_OPTION) {
            // Set the label to the path of the selected directory 
            File fi = new File(j.getSelectedFile().getAbsolutePath());
            try {
                // Create a file writer 
                FileWriter wr = new FileWriter(fi, false);
                // Create buffered writer to write 
                BufferedWriter w = new BufferedWriter(wr);
                // Write 
                w.write(text);
                w.flush();
                w.close();
            } catch (IOException ioe) {
                JOptionPane.showMessageDialog(this, ioe.getMessage());
            }
        } else
            JOptionPane.showMessageDialog(this, "Operation Cancelled....",
                    "Information", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jmi_saveActionPerformed

    private void jmi_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_openActionPerformed
        // Create an object of JFileChooser class 
        JFileChooser j = new JFileChooser("I:\\Java");
        // Invoke the showsOpenDialog function to show the save dialog 
        int r = j.showOpenDialog(this);
        // If the user selects a file 
        if (r == JFileChooser.APPROVE_OPTION) {
            // Set the label to the path of the selected directory 
            File fi = new File(j.getSelectedFile().getAbsolutePath());
            try {
                // String 
                String s1 = "", sl = "";
                // File reader 
                FileReader fr = new FileReader(fi);
                // Buffered reader 
                BufferedReader br = new BufferedReader(fr);
                // Initilize sl 
                sl = br.readLine();
                // Take the input from the file 
                while ((s1 = br.readLine()) != null) {
                    sl += "\n" + s1;
                }
                // Set the text 
                txt_content.setText(sl);
            } catch (IOException ioe) {
                JOptionPane.showMessageDialog(this, ioe.getMessage());
            }
        } else
            JOptionPane.showMessageDialog(this, "Operation Cancelled....",
                    "Information", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jmi_openActionPerformed

    private void jmi_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_newActionPerformed
        txt_content.setText("");
    }//GEN-LAST:event_jmi_newActionPerformed

    private void jmi_font_boldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_font_boldActionPerformed

    }//GEN-LAST:event_jmi_font_boldActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        jmi_newActionPerformed(evt);
    }//GEN-LAST:event_btn_newActionPerformed

    private void jmi_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmi_exitActionPerformed

    private void btn_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openActionPerformed
        jmi_openActionPerformed(evt);
    }//GEN-LAST:event_btn_openActionPerformed

    private void jmi_undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_undoActionPerformed
        try {
            manager.undo();
        } catch (CannotUndoException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jmi_undoActionPerformed

    private void jmi_redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_redoActionPerformed
        try {
            manager.redo();
        } catch (CannotUndoException e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jmi_redoActionPerformed

    private void jmi_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cutActionPerformed
        txt_content.cut();
    }//GEN-LAST:event_jmi_cutActionPerformed

    private void jmi_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_copyActionPerformed
        txt_content.copy();
    }//GEN-LAST:event_jmi_copyActionPerformed

    private void jmi_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_pasteActionPerformed
        txt_content.paste();
    }//GEN-LAST:event_jmi_pasteActionPerformed

    private void jmi_selectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_selectallActionPerformed
        txt_content.selectAll();
    }//GEN-LAST:event_jmi_selectallActionPerformed

    @Override
    public void undoableEditHappened(UndoableEditEvent e) {
        manager.addEdit(e.getEdit());
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotepadApplication.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadApplication.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadApplication.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadApplication.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotepadApplication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_open;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jmi_copy;
    private javax.swing.JMenuItem jmi_cut;
    private javax.swing.JMenuItem jmi_exit;
    private javax.swing.JMenuItem jmi_font_bold;
    private javax.swing.JMenuItem jmi_font_italics;
    private javax.swing.JMenuItem jmi_font_regular;
    private javax.swing.JMenuItem jmi_new;
    private javax.swing.JMenuItem jmi_open;
    private javax.swing.JMenuItem jmi_paste;
    private javax.swing.JMenuItem jmi_redo;
    private javax.swing.JMenuItem jmi_save;
    private javax.swing.JMenuItem jmi_selectall;
    private javax.swing.JMenuItem jmi_undo;
    private javax.swing.JTextArea txt_content;
    // End of variables declaration//GEN-END:variables
}
