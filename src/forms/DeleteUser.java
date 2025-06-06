/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import java.sql.*;
import dao.ConnectionProvider;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.File;
import java.util.Objects;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import utility.BDutility;

/**
 *
 * @author Vaibhav

 */
public class DeleteUser extends javax.swing.JFrame {

    /**
     * Creates new form DeleteUser
     */
    public DeleteUser() {
        initComponents();
        BDutility.setImage(this, "images/Delete.jpg", 1100, 500);
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(6, 6, 6, 6, Color.BLACK));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 500));
        setMinimumSize(new java.awt.Dimension(1100, 500));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("NSimSun", 1, 36)); // NOI18N
        jLabel1.setText("DELETE USER");

        txtExit.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        txtExit.setText("X");
        txtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExitActionPerformed(evt);
            }
        });

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Gender", "Email", "Contact", "Address", "State", "Country", "Registration Id", "ImageName"
            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        txtSearch.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        jLabel2.setText("SEARCH");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                        .addComponent(txtExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtExit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_txtExitActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        fetchUser(null);
    }//GEN-LAST:event_formComponentShown

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String searchText = txtSearch.getText().toString();
        if (Objects.isNull(searchText) || searchText.isEmpty()) {
            fetchUser(null);
        } else {
            fetchUser(searchText);
        }


    }//GEN-LAST:event_txtSearchKeyReleased

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
        try {
    int dialogResult = JOptionPane.showConfirmDialog(null, "*userdetails\n*images\n*QR codes\n*Attendance\n\nAssociated with this user will be deleted.\n Are You Sure you want to proceed ?", "Confirmation", JOptionPane.YES_NO_OPTION);

    if (dialogResult == JOptionPane.YES_OPTION) {
        int index = userTable.getSelectedRow();
        TableModel model = userTable.getModel();
        String email = model.getValueAt(index, 3).toString();
        String imagePath = BDutility.getPath("/images" + File.separator + email + ".jpg");
        deleteFile(imagePath);
        imagePath = BDutility.getPath("qrcodes" + File.separator + email + ".jpg");
        deleteFile(imagePath);

        Connection connection = ConnectionProvider.getCon();
        connection.setAutoCommit(false); // Ensure auto-commit is off
        String attendanceDeleteQuery1 = "DELETE FROM userattendance WHERE userid = (SELECT id FROM userdetails WHERE email = ?)";
        String attendanceDeleteQuery2 = "DELETE FROM userdetails WHERE email = ?";
        
        try (PreparedStatement preparedStatement1 = connection.prepareStatement(attendanceDeleteQuery1);
             PreparedStatement preparedStatement2 = connection.prepareStatement(attendanceDeleteQuery2)) {
             
            preparedStatement1.setString(1, email);
            preparedStatement1.executeUpdate();
            
            preparedStatement2.setString(1, email);
            preparedStatement2.executeUpdate();
            
            connection.commit(); // Commit the transaction
        } catch (SQLException e) {
            connection.rollback(); // Rollback on error
            e.printStackTrace(); // Print the stack trace
            JOptionPane.showMessageDialog(null, "Error during deletion: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        fetchUser(null);
        JOptionPane.showMessageDialog(null, "User Deleted Successfully", "Confirmation", JOptionPane.INFORMATION_MESSAGE);

    } else {
        JOptionPane.showMessageDialog(null, "Deletion Canceled", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }

} catch (Exception ex) {
    ex.printStackTrace(); // Print the stack trace
    JOptionPane.showMessageDialog(null, "Something went wrong: " + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_userTableMouseClicked

    private void fetchUser(String searchText) throws HeadlessException {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);
        try {
            Connection con = ConnectionProvider.getCon();
            Statement statement = con.createStatement();
            String query = null;
            if (Objects.isNull(searchText)) {
                query = "select * from userdetails";
            } else {
                query = "select * from userdetails where name like '%" + searchText + "%' or email like '%" + searchText + "%'";
            }
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                model.addRow(new Object[]{
                    resultSet.getString("id"),
                    resultSet.getString("name"),
                    resultSet.getString("gender"),
                    resultSet.getString("email"),
                    resultSet.getString("contact"),
                    resultSet.getString("address"),
                    resultSet.getString("state"),
                    resultSet.getString("country"),
                    resultSet.getString("uniqueregid"),
                    resultSet.getString("imagename"),});
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void deleteFile(String filePath) {
        File fileToDelete = new File(filePath);
        if (fileToDelete.exists()) {
            if (fileToDelete.delete()) {
                System.out.println("File deleted Successfully");

            } else {
                System.out.println("Failed to delete File");
            }
        } else {
            System.out.println("File doesn't exists");
        }
    }

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
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtExit;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
