/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel_management_system.GUI;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kareem Zayed
 */
public class EditWorkerForm extends javax.swing.JFrame {

    /**
     * Creates new form EditWorkerForm
     */
    
    public String st = "room service";
    
    public EditWorkerForm() {
        initComponents();
        id.setEditable(false);
        
        try {
            // TODO code application logic here
            Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system", "root", "");
            String stm = "Select * from workers";
            PreparedStatement pst = Conn.prepareStatement(stm);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String name = String.valueOf(rs.getString("name"));
                String phone = String.valueOf(rs.getString("phone"));
                String address = String.valueOf(rs.getString("address"));
                String age = String.valueOf(rs.getInt("age"));
                String jobtitle = String.valueOf( rs.getString("job_title"));
                String salary = String.valueOf(rs.getInt("salary"));
                
                String tbData[] = {id, name, phone, address, age, jobtitle, salary};
                DefaultTableModel tablemodel = (DefaultTableModel) workerstable.getModel();
                tablemodel.addRow(tbData);
                
            }
            
            Conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workerstable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        workername = new javax.swing.JTextField();
        workerphone = new javax.swing.JTextField();
        workeraddress = new javax.swing.JTextField();
        workerage = new javax.swing.JTextField();
        workerjob = new javax.swing.JComboBox<>();
        workersalary = new javax.swing.JTextField();
        recUsername = new javax.swing.JLabel();
        recPass = new javax.swing.JLabel();
        reciptionistpassword = new javax.swing.JPasswordField();
        reciptionistusername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jlabel56 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Edit Worker");

        workerstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Address", "Age", "Job Title", "Salary"
            }
        ));
        workerstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workerstableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(workerstable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("New Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("New Phone");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("New Address");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("New Age");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("New  Job Title");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("New Salary");

        workername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workernameActionPerformed(evt);
            }
        });

        workerphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workerphoneActionPerformed(evt);
            }
        });

        workerage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workerageActionPerformed(evt);
            }
        });

        workerjob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "receptionist", "room service" }));
        workerjob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workerjobActionPerformed(evt);
            }
        });

        workersalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workersalaryActionPerformed(evt);
            }
        });

        recUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        recUsername.setText("Receptionist New Username");

        recPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        recPass.setText("Receptionist New Password");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("<- Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jlabel56.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlabel56.setText("Select Wanted Worker From The Table :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Worker ID");

        id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(33, 33, 33))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(workerphone, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(workeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(workerage, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(workersalary, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(workerjob, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(141, 708, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(workername, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlabel56)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(511, 511, 511))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton2)
                .addGap(353, 353, 353)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recPass)
                            .addComponent(recUsername))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reciptionistusername, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(reciptionistpassword))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 105, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(workername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(workerphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(workeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(workerage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(workerjob, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(workersalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlabel56)
                                .addGap(301, 301, 301)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(recUsername)
                                    .addComponent(reciptionistusername, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(recPass)
                                    .addComponent(reciptionistpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))
                                .addGap(30, 30, 30))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void workernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workernameActionPerformed

    private void workerphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workerphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workerphoneActionPerformed

    private void workerageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workerageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workerageActionPerformed

    private void workerjobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workerjobActionPerformed
        // TODO add your handling code here:
 
        if((workerjob.getSelectedItem().toString()).equalsIgnoreCase("receptionist")){
            reciptionistusername.setVisible(true);
            reciptionistpassword.setVisible(true);
            recUsername.setVisible(true);
            recPass.setVisible(true);
        }
        else {
            reciptionistusername.setVisible(false);
            reciptionistpassword.setVisible(false);
            recUsername.setVisible(false);
            recPass.setVisible(false);
        }
        
        if(this.st.equalsIgnoreCase("room service") && (workerjob.getSelectedItem().toString()).equalsIgnoreCase("receptionist")) {
            reciptionistusername.setEditable(true);
            reciptionistpassword.setEditable(true);
        }
        
    }//GEN-LAST:event_workerjobActionPerformed

    private void workersalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workersalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workersalaryActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ManagerForm manager = new ManagerForm();
        manager.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO code application logic here
            Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system", "root", "");
            String sql = "UPDATE workers SET name=?, phone=?, address=?, age=?, salary=?, job_title=? where id=?";
            
            PreparedStatement pst = Conn.prepareStatement(sql);
            pst.setString(1, workername.getText());
            pst.setString(2, workerphone.getText());
            pst.setString(3, workeraddress.getText());
            pst.setInt(4, Integer.parseInt(workerage.getText()));
            pst.setInt(5, Integer.parseInt(workersalary.getText()));
            pst.setString(6, workerjob.getSelectedItem().toString());
            pst.setInt(7, Integer.parseInt(id.getText()));

            if((workerjob.getSelectedItem().toString()).equalsIgnoreCase("receptionist") && this.st.equalsIgnoreCase("room service")) {
                String sql2 = "INSERT INTO users(name, username, password, user_type) VALUES(?,?,?,?)";
            
                PreparedStatement pst2 = Conn.prepareStatement(sql2);
                pst2.setString(1, workername.getText());
                pst2.setString(2, reciptionistusername.getText());
                pst2.setString(3, reciptionistpassword.getText());
                pst2.setString(4, workerjob.getSelectedItem().toString());
                pst2.executeUpdate();
            }
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Updated Successfuly");
            Conn.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void workerstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workerstableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tablemodel = (DefaultTableModel) workerstable.getModel();
        int selectedRow = workerstable.getSelectedRow();
        
        id.setText(tablemodel.getValueAt(selectedRow, 0).toString());
        workername.setText(tablemodel.getValueAt(selectedRow, 1).toString());
        workerphone.setText(tablemodel.getValueAt(selectedRow, 2).toString());
        workeraddress.setText(tablemodel.getValueAt(selectedRow, 3).toString());
        workerage.setText(tablemodel.getValueAt(selectedRow, 4).toString());
        workerjob.setSelectedItem(tablemodel.getValueAt(selectedRow, 5).toString());
        workersalary.setText(tablemodel.getValueAt(selectedRow, 6).toString());
        
        this.st = tablemodel.getValueAt(selectedRow, 5).toString();
        
        if(this.st.equalsIgnoreCase("receptionist")) {
            reciptionistusername.setEditable(false);
            reciptionistpassword.setEditable(false);
        }
        
    }//GEN-LAST:event_workerstableMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EditWorkerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditWorkerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditWorkerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditWorkerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditWorkerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel56;
    private javax.swing.JLabel recPass;
    private javax.swing.JLabel recUsername;
    private javax.swing.JPasswordField reciptionistpassword;
    private javax.swing.JTextField reciptionistusername;
    private javax.swing.JTextField workeraddress;
    private javax.swing.JTextField workerage;
    private javax.swing.JComboBox<String> workerjob;
    private javax.swing.JTextField workername;
    private javax.swing.JTextField workerphone;
    private javax.swing.JTextField workersalary;
    private javax.swing.JTable workerstable;
    // End of variables declaration//GEN-END:variables
}