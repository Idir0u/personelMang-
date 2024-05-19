package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

public class MembersPage extends javax.swing.JFrame {

     Connection conn = Utilitaire.getConnection();

    private javax.swing.JButton Agenda;
    private javax.swing.JTable MembersTable;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel P4P;
    private javax.swing.JLabel Username;
    private javax.swing.JButton about;
    private javax.swing.JButton agenda;
    private javax.swing.JButton ajouter_administrateur;
    private javax.swing.JButton ajouter_membre_simple;
    private javax.swing.JPanel barreAjouterMembre;
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
    private javax.swing.JButton se_deconnecter;
    private int iduser;
    private String username;

    
    public MembersPage(int iduser, String username, String nom_court) {
    	NomCourt = nom_court;
    	this.iduser = iduser;
    	this.username = username;
    	
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
        jScrollPane1 = new javax.swing.JScrollPane();
        MembersTable = new javax.swing.JTable();
        about = new javax.swing.JButton();
        ressources = new javax.swing.JButton();
        Agenda = new javax.swing.JButton();
        membres = new javax.swing.JButton();
        barreAjouterMembre = new javax.swing.JPanel();
        ajouter_administrateur = new javax.swing.JButton();
        ajouter_membre_simple = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new java.awt.BorderLayout());

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 204), 1, true));
        Menu.setFont(new java.awt.Font("Segoe UI", 1, 18));    
        Menu.setLayout(new java.awt.GridBagLayout());

        messages.setFont(new java.awt.Font("Segoe UI", 1, 14));    
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

        requests.setFont(new java.awt.Font("Segoe UI", 1, 14));    
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

        menu.setFont(new java.awt.Font("Segoe UI", 1, 14));    
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
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        Menu.add(menu, gridBagConstraints);

        agenda.setFont(new java.awt.Font("Segoe UI", 1, 14));    
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
        projects.setFont(new java.awt.Font("Segoe UI", 1, 14));    
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

        invitation.setFont(new java.awt.Font("Segoe UI", 1, 14));    
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
        Menu.add(invitation, gridBagConstraints);

        se_deconnecter.setFont(new java.awt.Font("Segoe UI", 1, 14));    
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
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 93, 0);
        Menu.add(se_deconnecter, gridBagConstraints);

        body.add(Menu, java.awt.BorderLayout.LINE_START);

        header.setBackground(new java.awt.Color(153, 0, 204));
        header.setLayout(new java.awt.GridBagLayout());

        P4P.setBackground(new java.awt.Color(255, 255, 255));
        P4P.setFont(new java.awt.Font("Segoe UI", 3, 24));    
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
        Username.setFont(new java.awt.Font("Segoe UI", 1, 24));    
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-user-30.png")));    
        Username.setText("Username_xxxx");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = -2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 566, 0, 12);
        header.add(Username, gridBagConstraints);

        body.add(header, java.awt.BorderLayout.PAGE_START);

        contenu.setBackground(new java.awt.Color(255, 255, 255));
        contenu.setLayout(new java.awt.GridBagLayout());

        MembersTable.setAutoCreateRowSorter(true);
        MembersTable.setFont(new java.awt.Font("Segoe UI", 1, 18));    
        MembersTable.setModel(tableModel);
        MembersTable.setToolTipText("");
        MembersTable.setColumnSelectionAllowed(true);
        MembersTable.setEnabled(false);
        MembersTable.setGridColor(new java.awt.Color(204, 204, 204));
        MembersTable.setRowHeight(40);
        MembersTable.setSelectionBackground(new java.awt.Color(153, 204, 0));
        MembersTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        MembersTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        MembersTable.setShowHorizontalLines(true);
        MembersTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(MembersTable);
        MembersTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1193;
        gridBagConstraints.ipady = 342;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 1);
        contenu.add(jScrollPane1, gridBagConstraints);

        about.setBackground(new java.awt.Color(153, 0, 204));
        about.setFont(new java.awt.Font("Segoe UI", 1, 24));    
        about.setForeground(new java.awt.Color(255, 255, 255));
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        contenu.add(about, gridBagConstraints);

        ressources.setBackground(new java.awt.Color(153, 0, 204));
        ressources.setFont(new java.awt.Font("Segoe UI", 1, 24));    
        ressources.setForeground(new java.awt.Color(255, 255, 255));
        ressources.setText("Ressources");
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 100, 0, 0);
        contenu.add(ressources, gridBagConstraints);

        Agenda.setBackground(new java.awt.Color(153, 0, 204));
        Agenda.setFont(new java.awt.Font("Segoe UI", 1, 24));    
        Agenda.setForeground(new java.awt.Color(255, 255, 255));
        Agenda.setText("Agenda");
        Agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 110, 0, 0);
        contenu.add(Agenda, gridBagConstraints);

        membres.setBackground(new java.awt.Color(153, 0, 204));
        membres.setFont(new java.awt.Font("Segoe UI", 1, 24));    
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
        gridBagConstraints.insets = new java.awt.Insets(10, 120, 0, 0);
        contenu.add(membres, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 100, 0, 0);

        barreAjouterMembre.setBackground(new java.awt.Color(153, 0, 204));
        barreAjouterMembre.setLayout(new java.awt.GridBagLayout());

        ajouter_administrateur.setFont(new java.awt.Font("Segoe UI", 1, 14));    
        ajouter_administrateur.setForeground(new java.awt.Color(153, 0, 204));
        ajouter_administrateur.setText("Invitation pour administrateur");
        ajouter_administrateur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        ajouter_administrateur.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ajouter_administrateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_administrateurActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 340, 20, 259);
        barreAjouterMembre.add(ajouter_administrateur, gridBagConstraints);

        ajouter_membre_simple.setFont(new java.awt.Font("Segoe UI", 1, 14));    
        ajouter_membre_simple.setForeground(new java.awt.Color(153, 0, 204));
        ajouter_membre_simple.setText("Invitation pour membre simple");
        ajouter_membre_simple.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        ajouter_membre_simple.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ajouter_membre_simple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouter_membre_simpleActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 230, 20, 0);
        barreAjouterMembre.add(ajouter_membre_simple, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 33, 1);
        contenu.add(barreAjouterMembre, gridBagConstraints);

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
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        pack();
    }

    private void messagesActionPerformed(java.awt.event.ActionEvent evt) {
       
    }
    private void requestsActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {
        
    }



    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {
       
    }
    private void membresActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void projectsActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void AgendaActionPerformed(java.awt.event.ActionEvent evt) {
        new AgendaPage(iduser, username, NomCourt).setVisible(true);
    }

    private void invitationActionPerformed(java.awt.event.ActionEvent evt) {
      
    }

    static String NomCourt;

    private void ajouter_administrateurActionPerformed(java.awt.event.ActionEvent evt) {
        AjoutAdministrateurPage admp = new AjoutAdministrateurPage(NomCourt);
        admp.setVisible(true);
    }

    private void se_deconnecterActionPerformed(java.awt.event.ActionEvent evt) {

    }
    

    private void ajouter_membre_simpleActionPerformed(java.awt.event.ActionEvent evt) {
        AjoutMembreSimplePage amsp = new AjoutMembreSimplePage(iduser, username, NomCourt);
        amsp.setVisible(true);
    }

    ResultSet rs;
    DefaultTableModel tableModel = new DefaultTableModel();
    public void RemplirTable(String nomCourt) {

        NomCourt = nomCourt;


        try {

           PreparedStatement ps = conn.prepareStatement("SELECT nom, prenom, email, adresse FROM utilisateur WHERE idUtilisateur IN (SELECT IdUtilisateur FROM ulilisateur_groupe WHERE IdGroupe IN (SELECT IdGroupe FROM groupe WHERE nom_groupe LIKE ?))");
           ps.setString(1, nomCourt+"%");
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

    
    public static void main(String args[]) {
        

            }

}
