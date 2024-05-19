package metier;

import java.time.LocalDate;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

public class AjoutMembreSimplePage extends javax.swing.JFrame {

    Connection conn = Utilitaire.getConnection();


    private javax.swing.JLabel FormulaireAjout;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel P4P;
    private javax.swing.JLabel Username;
    private javax.swing.JButton Valider;
    private javax.swing.JButton agenda;
    private javax.swing.JPanel background_formulaire;
    private javax.swing.JPanel barre_FormulaireCreation;
    private javax.swing.JPanel body;
    private javax.swing.JTextField Champ_username;
    private javax.swing.JTextField champ_nom;
    private javax.swing.JTextField champ_prenom;
    private javax.swing.JPanel contenu;
    private javax.swing.JPanel header;
    private javax.swing.JButton invitation;
    private javax.swing.JButton menu;
    private javax.swing.JButton messages;
    private javax.swing.JLabel username;
    private javax.swing.JLabel nom;
    private javax.swing.JButton projects;
    private javax.swing.JButton requests;
    private javax.swing.JButton se_deconnecter;
    private javax.swing.JLabel prenom;

    static String NomCourt;
    private int iduser;
    private String usrname;
    
    public AjoutMembreSimplePage(int iduser, String usrname, String nomCourt) {
        NomCourt = nomCourt;
        this.iduser = iduser;
        this.usrname=usrname;
        
        java.awt.GridBagConstraints gridBagConstraints;

        body = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        messages = new javax.swing.JButton();
        requests = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        agenda = new javax.swing.JButton();
        projects = new javax.swing.JButton();
        invitation = new javax.swing.JButton();
        se_deconnecter = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        P4P = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        contenu = new javax.swing.JPanel();
        barre_FormulaireCreation = new javax.swing.JPanel();
        FormulaireAjout = new javax.swing.JLabel();
        background_formulaire = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        nom = new javax.swing.JLabel();
        prenom = new javax.swing.JLabel();
        Champ_username = new javax.swing.JTextField();
        champ_nom = new javax.swing.JTextField();
        champ_prenom = new javax.swing.JTextField();
        Valider = new javax.swing.JButton();

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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 109;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 2, 0, 0);
        Menu.add(menu, gridBagConstraints);

        agenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agenda.setForeground(new java.awt.Color(153, 0, 204));
        agenda.setText("Agenda");
        agenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        agenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 94;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 2, 0, 0);
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
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(68, 1, 0, 0);
        Menu.add(invitation, gridBagConstraints);

        se_deconnecter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        se_deconnecter.setForeground(new java.awt.Color(153, 0, 204));
        se_deconnecter.setText("se_deconnecter");
        se_deconnecter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        se_deconnecter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        se_deconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                se_deconnecterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 26, 0);
        Menu.add(se_deconnecter, gridBagConstraints);

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
        Username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-user-30.png"))); // NOI18N
        Username.setText("Username_xxxx");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 576, 0, 2);
        header.add(Username, gridBagConstraints);

        body.add(header, java.awt.BorderLayout.PAGE_START);

        contenu.setBackground(new java.awt.Color(255, 255, 255));
        contenu.setLayout(new java.awt.GridBagLayout());

        barre_FormulaireCreation.setBackground(new java.awt.Color(102, 0, 204));
        barre_FormulaireCreation.setLayout(new java.awt.GridBagLayout());

        FormulaireAjout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        FormulaireAjout.setForeground(new java.awt.Color(255, 255, 255));
        FormulaireAjout.setText("FORMULAIRE D'AJOUT D'UN NOUVEAU MEMBRE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 160, 27, 180);
        barre_FormulaireCreation.add(FormulaireAjout, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        contenu.add(barre_FormulaireCreation, gridBagConstraints);

        background_formulaire.setBackground(new java.awt.Color(153, 0, 204));
        background_formulaire.setLayout(new java.awt.GridBagLayout());

        username.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");
        username.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 40, 0, 0);
        background_formulaire.add(username, gridBagConstraints);

        nom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nom.setForeground(new java.awt.Color(255, 255, 255));
        nom.setText("Nom");
        nom.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 40, 0, 0);
        background_formulaire.add(nom, gridBagConstraints);

        prenom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        prenom.setForeground(new java.awt.Color(255, 255, 255));
        prenom.setText("Prenom");
        prenom.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 40, 0, 0);
        background_formulaire.add(prenom, gridBagConstraints);

        Champ_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Champ_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champNom_courtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 326;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, 330);
        background_formulaire.add(Champ_username, gridBagConstraints);

        champ_nom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        champ_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champNom_longActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 326;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 100, 0, 330);
        background_formulaire.add(champ_nom, gridBagConstraints);

        champ_prenom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        champ_prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                champ_themeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 326;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 100, 0, 330);
        background_formulaire.add(champ_prenom, gridBagConstraints);

        Valider.setBackground(new java.awt.Color(102, 0, 204));
        Valider.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Valider.setForeground(new java.awt.Color(255, 255, 255));
        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 79;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 240, 20, 0);
        background_formulaire.add(Valider, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 86, 0);
        contenu.add(background_formulaire, gridBagConstraints);

        body.add(contenu, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
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

    private void agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaActionPerformed
        new UserAgendaPage(iduser, usrname).setVisible(true);
    }//GEN-LAST:event_agendaActionPerformed

    private void projectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectsActionPerformed

    private void invitationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invitationActionPerformed

    }//GEN-LAST:event_invitationActionPerformed

    private void se_deconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_se_deconnecterActionPerformed

    }
    
    private void champNom_courtActionPerformed(java.awt.event.ActionEvent evt) {
    
        
    }
    
    private void champNom_longActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    
    private void champ_themeActionPerformed(java.awt.event.ActionEvent evt) {
        
        
    }
    int cp = 0;
    int cp1 = 0;
    Object id1;
    Object id2;
    Object id3;
    ResultSet rs;
    ResultSet rs1;
    ResultSet rs2;
    DefaultTableModel tableModel = new DefaultTableModel();
    DefaultTableModel tableMode2 = new DefaultTableModel();
    DefaultTableModel tableMode3 = new DefaultTableModel();
    DefaultTableModel tableMode4 = new DefaultTableModel();
    ResultSet rs3;

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        try {

            PreparedStatement ps = conn.prepareStatement("SELECT username, nom, prenom FROM utilisateur WHERE idUtilisateur IN (SELECT IdUtilisateur FROM ulilisateur_groupe WHERE IdGroupe IN (SELECT IdGroupe FROM groupe WHERE nom_groupe LIKE ?))");
            ps.setString(1, NomCourt);
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
 
                 PreparedStatement ps3 = conn.prepareStatement("SELECT IdGroupe FROM groupe WHERE nom_groupe LIKE ?");
                  ps3.setString(1, NomCourt);
                  rs2 = ps3.executeQuery();
 
                  // Récupérez les métadonnées du ResultSet (noms de colonnes)
            int col = rs2.getMetaData().getColumnCount();
            for (int i = 1; i <= col; i++) {
                tableMode3.addColumn(rs2.getMetaData().getColumnName(i));
            }
 
 
 
            // Ajoutez les données du ResultSet au modèle de table
              while (rs2.next()) {
                Object[] rowData = new Object[col];
                for (int i = 1; i <= col; i++) {
                    rowData[i - 1] = rs2.getObject(i);
                }
                tableMode3.addRow(rowData);
                 }
 
                 id2 = tableMode3.getValueAt(0,0);
 
 
             
                 for (int c = 0; c < tableModel.getRowCount(); c++) {
 
                     if ((Champ_username.getText().equals(tableModel.getValueAt(c, 0))) && (champ_nom.getText().equals(tableModel.getValueAt(c, 1))) && (champ_prenom.getText().equals(tableModel.getValueAt(c, 2)))) {
                         cp++;
                         break;
                     }
                 }
                 if(cp == 1)
                 {
                     Message_Validation mv = new Message_Validation("L'utilisateur est déjà un memebre simple du projet!!");
                     mv.setVisible(true);
                 }
                 else{
                     
                     PreparedStatement ps1 = conn.prepareStatement("SELECT IdUtilisateur, username, nom, prenom FROM utilisateur");
                     rs1 = ps1.executeQuery();
          
                     // Récupérez les métadonnées du ResultSet (noms de colonnes)
                     int column = rs1.getMetaData().getColumnCount();
                     for (int j = 1; j <= column; j++) {
                         tableMode2.addColumn(rs1.getMetaData().getColumnName(j));
                     }
          
                     // Ajoutez les données du ResultSet au modèle de table
                       while (rs1.next()) {
                         Object[] rowData1 = new Object[column];
                         for (int K = 1; K <= column; K++) {
                             rowData1[K - 1] = rs1.getObject(K);
                         }
                         tableMode2.addRow(rowData1);
                          }
                          for (int c = 0; c < tableMode2.getRowCount(); c++) {
 
                             if ((Champ_username.getText().equals(tableMode2.getValueAt(c, 1))) && (champ_nom.getText().equals(tableMode2.getValueAt(c, 2))) && (champ_prenom.getText().equals(tableMode2.getValueAt(c, 3)))) {
                                 cp1++;
                                 id1 = tableMode2.getValueAt(c, 0);
                                 break;
                             }
                         }
                         if(cp1 == 1)
                         {
                             PreparedStatement ps6 = conn.prepareStatement("SELECT IdProjet FROM projet WHERE nom_court = ?");
                             ps6.setString(1, NomCourt);
                             rs3 = ps6.executeQuery();
                             // Récupérez les métadonnées du ResultSet (noms de colonnes)
                                  int co = rs3.getMetaData().getColumnCount();
                                   for (int j = 1; j <= co; j++) {
                                 tableMode4.addColumn(rs3.getMetaData().getColumnName(j));
                                      }
          
                             // Ajoutez les données du ResultSet au modèle de table
                                  while (rs3.next()) {
                                     Object[] rowData1 = new Object[co];
                                          for (int K = 1; K <= co; K++) {
                                          rowData1[K - 1] = rs3.getObject(K);
                                                  }
                                         tableMode4.addRow(rowData1);
                                      }

                             id3 = tableMode4.getValueAt(0, 0);
 
                             PreparedStatement ps2 = conn.prepareStatement("INSERT INTO invitation_demande(host, user, IdGroupe, IdProject, nom_Projet, date, etat, type) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                             ps2.setString(1, Username.getText());
                             ps2.setString(2, Champ_username.getText());
                             ps2.setObject(3, id2);
                             ps2.setObject(4, id3);
                             ps2.setString(5, NomCourt+"-adm");
                             ps2.setDate(6, Date.valueOf(LocalDate.now()));
                             ps2.setString(7, "Pending");
                             ps2.setString(8, "invitation");
                             ps2.executeUpdate();
                             
                             Message_Validation mv = new Message_Validation("Invitation envoyée avec succès!!");
                             mv.setVisible(true);
                         }
                         else
                         {
                             Message_Validation mv = new Message_Validation("Cet utilisateur n'a pas un compte sur la plateforme!!");
                             mv.setVisible(true);
                         }
                 }
             }
             catch (Exception e) {
            System.out.println("Exception :" + e);
              }
    }//GEN-LAST:event_ValiderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
                //new AjoutMembrePage().setVisible(true);
            }
    
}
