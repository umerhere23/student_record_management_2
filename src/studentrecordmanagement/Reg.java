package studentrecordmanagement;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.*;
import javax.print.attribute.standard.JobStateReason;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aktar
 */
public class Reg extends javax.swing.JFrame {

    /**
     * Creates new form Reg
     */
    String nid, un, pa, pa1;
    String nul = "";
    String ut;

    public Reg() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chu = new javax.swing.JComboBox<>();
        repass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        re = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("User Name ");

        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Password");

        uid.setBackground(new java.awt.Color(108, 122, 137));

        jButton1.setBackground(new java.awt.Color(242, 38, 19));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pass.setBackground(new java.awt.Color(108, 122, 137));

        jButton2.setBackground(new java.awt.Color(34, 167, 240));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Want to Login");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Division :");

        chu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Teacher" }));
        chu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chuActionPerformed(evt);
            }
        });

        repass.setBackground(new java.awt.Color(108, 122, 137));

        jLabel8.setForeground(new java.awt.Color(236, 240, 241));
        jLabel8.setText("Re-Password");

        jLabel9.setForeground(new java.awt.Color(236, 240, 241));
        jLabel9.setText("REG ID");

        re.setBackground(new java.awt.Color(108, 122, 137));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(34, 34, 34)
                                .addComponent(jButton2))
                            .addComponent(chu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(re, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uid, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(repass)
                            .addComponent(pass))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(repass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("Login Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("-");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        String pass= new String(pass.getPassword());
        getdata();

        String password = new String(pass.getPassword());
        String repassword = new String(repass.getPassword());

        if (nid.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Enter your ID");
            uid.requestFocus();
        } else {
            if (un.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Enter your User name");
                uid.requestFocus();
            } else {
                if (pa.length() < 8) {
                    JOptionPane.showMessageDialog(rootPane, "password should be 8 charecter");
                    pass.requestFocus();

                } else {
                    if (password.equals(repassword)) {
                        //  JOptionPane.showMessageDialog(rootPane, "Data save");
                        savedata();
                        cleardata();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Password doesnot match", "Warning", JOptionPane.WARNING_MESSAGE);
                        repass.requestFocus();
                    }
                }
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        UserLogin reg = new UserLogin();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void chuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void getdata() {
        nid = re.getText();
        un = uid.getText();
        pa = pass.getText();
        pa1 = repass.getText();

    }

    private void checkuser() {/////////////////////////////////////  problem 

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        String ch;
        try {
            con = DBConnection.getDBConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select user from adminid");

        } catch (Exception e) {
        }

    }

    private void savedata() {

        ut = chu.getSelectedItem().toString();
        Connection con = null;
        Statement stmt = null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            con = DBConnection.getDBConnection();
            stmt = con.createStatement();
            int count = 0;
            //if(count>0){
            if (chu.getSelectedIndex() == 0) {

                    String sql2 = "select * from student_info where stu_id='" + nid + "'";
                    String SQL = "select user_id from student_info where stu_id='" + nid + "'";
                    ResultSet rscc = stmt.executeQuery(sql2);

                    if (!rscc.next()) {
                        JOptionPane.showMessageDialog(rootPane, "Enter yor valid REG-ID");
                        uid.requestFocus();
                    } else {
                        ResultSet rsc = stmt.executeQuery(SQL);
                        if (rsc.next()) {
                            if (rsc.getString("user_id") == null) {
                                count = stmt.executeUpdate("update student_info set user_id='" + un + "', password='" + pa + "' where stu_id='" + nid + "'");
                                
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "This stu_id alrady have user name");
                                re.requestFocus();
                                System.out.println("duplicate");
                            }
                        }
                    }
                } else {
                    if (chu.getSelectedIndex() == 1) {
                        String SQL2 = "select * from teacherid where t_jobid='" + nid + "'";
                        String SQL = "select user_id from teacherid where t_jobid='" + nid + "'";
                        ResultSet rscc = stmt.executeQuery(SQL2);
                        if (!rscc.next()) {
                            JOptionPane.showMessageDialog(rootPane, "Enter your valid JOB-ID");
                            uid.requestFocus();
                        } else {
                            ResultSet rsc = stmt.executeQuery(SQL);
                            if (rsc.next()) {
                                if (rsc.getString("user_id") == null){
                                count = stmt.executeUpdate("update  teacherid set user_id='" + un + "' ,pass='" + pa + "' where t_jobid='" + nid + "'");
                                }else{
                                JOptionPane.showMessageDialog(rootPane, "This Jobid alrady have user name ");
                                re.requestFocus();
                                }
                                 
                            }
                        }

                    

                }
            }
            // }
            if (count > 0) {
                // System.out.println("Insertion Successfully");
                JOptionPane.showMessageDialog(rootPane, "Registration  Successfully");
            } else {
                //JOptionPane.showMessageDialog(rootPane, "Insertion Faild", "Faild", JOptionPane.ERROR_MESSAGE);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
                stmt.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

    }

    private void cleardata() {

        uid.setText("");
        pass.setText("");
        repass.setText("");
        chu.setSelectedIndex(0);

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
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> chu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField re;
    private javax.swing.JPasswordField repass;
    private javax.swing.JTextField uid;
    // End of variables declaration//GEN-END:variables
}
