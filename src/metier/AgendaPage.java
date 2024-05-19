package metier;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.*;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class AgendaPage extends javax.swing.JFrame {
	Connection conn = Utilitaire.getConnection();

    /**
     * Creates new form AgendaPage
     */
	private int iduser;
	private String username;
	private String NomCourt;
	
    public AgendaPage(int iduser, String username, String NomCourt) {
    	this.iduser = iduser;
    	this.username = username;
    	this.NomCourt = NomCourt;
        
        java.awt.GridBagConstraints gridBagConstraints;

        body = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        messages = new javax.swing.JButton();
        requests = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        agenda = new javax.swing.JButton();
        projects = new javax.swing.JButton();
        invitation = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        P4P = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        contenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AgendaTable = new javax.swing.JTable();
        ressources = new javax.swing.JButton();
        about = new javax.swing.JButton();
        Agenda = new javax.swing.JButton();
        membres = new javax.swing.JButton();
        adhesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new java.awt.BorderLayout());

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 1, true));
        Menu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Menu.setLayout(new java.awt.GridBagLayout());

        messages.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        messages.setForeground(new java.awt.Color(153, 0, 204));
        messages.setText("Messages");
        messages.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        messages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        messages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messagesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Menu.add(messages, gridBagConstraints);

        requests.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        requests.setForeground(new java.awt.Color(153, 0, 204));
        requests.setText("Requests");
        requests.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        requests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        requests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Menu.add(requests, gridBagConstraints);

        menu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        menu.setForeground(new java.awt.Color(153, 0, 204));
        menu.setText("Menu");
        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 109;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        Menu.add(menu, gridBagConstraints);

        agenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agenda.setForeground(new java.awt.Color(153, 0, 204));
        agenda.setText("Agenda");
        agenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        agenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Menu.add(agenda, gridBagConstraints);

        projects.setBackground(new java.awt.Color(153, 0, 204));
        projects.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        projects.setForeground(new java.awt.Color(255, 255, 255));
        projects.setText("Projects");
        projects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        projects.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        projects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectsActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 94;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        Menu.add(projects, gridBagConstraints);

        invitation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        invitation.setForeground(new java.awt.Color(153, 0, 204));
        invitation.setText("Invitation");
        invitation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        invitation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invitation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invitationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 63, 0);
        Menu.add(invitation, gridBagConstraints);

        body.add(Menu, java.awt.BorderLayout.LINE_START);

        header.setBackground(new java.awt.Color(153, 0, 204));
        header.setLayout(new java.awt.GridBagLayout());

        P4P.setBackground(new java.awt.Color(255, 255, 255));
        P4P.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        P4P.setForeground(new java.awt.Color(255, 255, 255));
        P4P.setText("P4P");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 90, 0, 0);
        header.add(P4P, gridBagConstraints);

        Username.setBackground(new java.awt.Color(255, 255, 255));
        Username.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setIcon(new javax.swing.ImageIcon(getClass().getResource("assets/icons8-user-30.png"))); // NOI18N
        Username.setText("Username_xxxx");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 596, 0, 12);
        header.add(Username, gridBagConstraints);

        body.add(header, java.awt.BorderLayout.PAGE_START);

        contenu.setBackground(new java.awt.Color(255, 255, 255));
        contenu.setLayout(new java.awt.GridBagLayout());

        AgendaTable.setAutoCreateRowSorter(true);
        AgendaTable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgendaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "titre_evenement", "description_evenement", "date", "heure"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        AgendaTable.setToolTipText("");
        AgendaTable.setColumnSelectionAllowed(true);
        AgendaTable.setEnabled(false);
        AgendaTable.setGridColor(new java.awt.Color(204, 204, 204));
        AgendaTable.setRowHeight(40);
        AgendaTable.setSelectionBackground(new java.awt.Color(153, 204, 0));
        AgendaTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        AgendaTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        AgendaTable.setShowGrid(false);
        AgendaTable.setShowHorizontalLines(true);
        AgendaTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(AgendaTable);
        AgendaTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 824;
        gridBagConstraints.ipady = 380;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 5, 0);
        contenu.add(jScrollPane1, gridBagConstraints);

        ressources.setBackground(new java.awt.Color(153, 0, 204));
        ressources.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ressources.setForeground(new java.awt.Color(255, 255, 255));
        ressources.setText("Ressources");
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        contenu.add(ressources, gridBagConstraints);

        about.setBackground(new java.awt.Color(153, 0, 204));
        about.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        about.setForeground(new java.awt.Color(255, 255, 255));
        about.setText("About");
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        contenu.add(about, gridBagConstraints);

        Agenda.setBackground(new java.awt.Color(153, 0, 204));
        Agenda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Agenda.setForeground(new java.awt.Color(255, 255, 255));
        Agenda.setText("Agenda");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        contenu.add(Agenda, gridBagConstraints);

        membres.setBackground(new java.awt.Color(153, 0, 204));
        membres.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        membres.setForeground(new java.awt.Color(255, 255, 255));
        membres.setText("Membres");
        membres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membresActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        contenu.add(membres, gridBagConstraints);

        adhesion.setBackground(new java.awt.Color(153, 0, 204));
        adhesion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        adhesion.setForeground(new java.awt.Color(255, 255, 255));
        adhesion.setText("Adhésion");
        adhesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adhesionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        contenu.add(adhesion, gridBagConstraints);

        body.add(contenu, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void messagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messagesActionPerformed

    private void requestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestsActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuActionPerformed


    private void projectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectsActionPerformed


    private void membresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membresActionPerformed
        new MembersPage(iduser, username, NomCourt).setVisible(true);
    }//GEN-LAST:event_membresActionPerformed

    private void adhesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adhesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adhesionActionPerformed

    private void invitationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invitationActionPerformed
    
    }//GEN-LAST:event_invitationActionPerformed
    ResultSet rs;
    DefaultTableModel tableModel = new DefaultTableModel();
    public void RemplirTable(int idprojet) {

        try {

           PreparedStatement ps = conn.prepareStatement("SELECT date, heure, titre_evenement, description_evenement FROM evenement WHERE idProjet=?");
           ps.setInt(1, idprojet);
           rs = ps.executeQuery();

           // Récupérez les métadonnées du ResultSet (noms de colonnes)
           int columnCount = rs.getMetaData().getColumnCount();
           for (int i = 1; i <= columnCount; i++) {
               tableModel.addColumn(rs.getMetaData().getColumnName(i));
           }

           // Ajoutez les données du ResultSet au modèle de table
           while (rs.next()) {
               Object[] rowData = new Object[columnCount];
               for (int i = 1; i <= columnCount; i++) {
                   rowData[i - 1] = rs.getObject(i);
               }
               tableModel.addRow(rowData);
           }

           }


        catch (Exception e) {
           System.out.println("Exception :" + e);
       }
       
      
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agenda;
    private javax.swing.JTable AgendaTable;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel P4P;
    private javax.swing.JLabel Username;
    private javax.swing.JButton about;
    private javax.swing.JButton adhesion;
    private javax.swing.JButton agenda;
    private javax.swing.JPanel body;
    private javax.swing.JPanel contenu;
    private javax.swing.JPanel header;
    private javax.swing.JButton invitation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton membres;
    private javax.swing.JButton menu;
    private javax.swing.JButton messages;
    private javax.swing.JButton projects;
    private javax.swing.JButton requests;
    private javax.swing.JButton ressources;
    // End of variables declaration//GEN-END:variables
}
