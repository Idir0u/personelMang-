package metier;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
//import java.lang.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author zakar
 */
public class VerifierSupprimeDemande extends javax.swing.JFrame {
	Connection conn = Utilitaire.getConnection();

    /**
     * Creates new form VerifierSupprimeProjet
     */
    public VerifierSupprimeDemande(int idDemande) {
        
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Do you really want to delete this Demand?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 17, 0, 11);
        jPanel1.add(jLabel1, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton1.setText("Yes");
        JFrame ButtonContainer = this;
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                acceptButtonActionPerformed(evt, idDemande);
                ButtonContainer.dispose();
            }
            
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 100, 23, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void acceptButtonActionPerformed(ActionEvent evt, int idDemande) {
            try {
                if (idDemande <= 0) {
                    System.out.println("Invalid parameters provided.");
                    return;
                }

                PreparedStatement pstmt0 = conn.prepareStatement("DELETE FROM DEMANDE WHERE idDemande = ?"); 
                pstmt0.setInt(1, idDemande);

                int totalAffected = pstmt0.executeUpdate();                
                if (totalAffected >= 1) {
                    System.out.println("All statements executed successfully.");
                } else {
                    System.out.println("Some statements failed. Total affected rows: " + totalAffected);
                }
                pstmt0.close();

            } catch (Exception e) {
                System.out.println("Exception: " + e);
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
            java.util.logging.Logger.getLogger(VerifierSupprimeDemande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifierSupprimeDemande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifierSupprimeDemande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifierSupprimeDemande.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
