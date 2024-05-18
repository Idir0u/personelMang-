package metier;
import java.awt.*;
import java.sql.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.util.*;

public class HomePageUser extends javax.swing.JFrame {
    Connection conn = Utilitaire.getConnection();
    private int iduser;
    private String username;
    
    
    public Vector<Integer> fetchProjectsForUser(int iduser) {
    	
        Vector<Integer> projectIds = new Vector<>();

        String query = "SELECT IdProjet FROM projet";
         

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                projectIds.add(rs.getInt("IdProjet"));
            }
        } catch (SQLException e) {
            System.out.println("Exception: " + e);
        }

        return projectIds;
    }




    public HomePageUser(int iduser, String username) {
    	this.username = username;
    	this.iduser = iduser;
    	this.last_con_date = Instant.now();
        java.awt.GridBagConstraints gridBagConstraints;

        body = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        Home1 = new javax.swing.JButton();
        Projects = new javax.swing.JButton();
        Messages = new javax.swing.JButton();
        Requests = new javax.swing.JButton();
        Invitations = new javax.swing.JButton();
        Agenda = new javax.swing.JButton();
        jLabel1 = new JLabel();
        DashBord = new JPanel();
        last_connexion_date = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jScrollPane1 = new JScrollPane();
        activity_table = new JTable();
        Contenu = new javax.swing.JPanel();
        JScrollPane scrollPane = new JScrollPane(Contenu);
        
        Contenu.setLayout(new BorderLayout());
        Contenu.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Panel for the label
        /*JPanel labelPanel = new JPanel();
        JLabel projectsLabel = new JLabel("My Projects");
        projectsLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        projectsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        projectsLabel.setForeground(Color.white);
        labelPanel.setBackground(new java.awt.Color(0, 51, 204));
        labelPanel.add(projectsLabel);*/
        DashBord.setBackground(new Color(255, 255, 255));
	        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        last_connexion_date.setText("Last connexion date :" + formatter.format(last_con_date));

        jLabel3.setFont(new Font("Segoe UI Black", 3, 18)); 
        jLabel3.setForeground(new Color(153, 0, 204));
        jLabel3.setText("Your recent activities");

        jScrollPane1.setBackground(new Color(255, 255, 255));

        activity_table.setModel(new DefaultTableModel(
            new Object [][] {
                {"envoi d'un message a Zakariae","15/05/2024","14h05"},
                {"téléchargement d'un fichier du projet Site Builder","14/05/2024","18h00"},
                {"ajout évènement dans votre agenda","13/05/2024","13h05"},
                {"dépot de fichier pour le projet Site Builder","13/05/2024","00h05"},
                {"demande de création de nouveau projet","12/05/2024","17h30"},
                {"demande cloture projet Online Car Rent","12/05/2024","16h02"},
                {"retrait participant au projet site Builder","11/05/2024","13h05"},
                {"envoi d'un message à Idir","10/05/2024","14h05"},
            },
            new String [] {
                "Description", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        activity_table.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(activity_table);
        activity_table.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        GroupLayout DashBordLayout = new GroupLayout(DashBord);
        DashBord.setLayout(DashBordLayout);
        DashBordLayout.setHorizontalGroup(
            DashBordLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DashBordLayout.createSequentialGroup()
                .addGroup(DashBordLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(DashBordLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(last_connexion_date, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
                    .addGroup(DashBordLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE))
                    .addGroup(DashBordLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        DashBordLayout.setVerticalGroup(
            DashBordLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(DashBordLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(DashBordLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(last_connexion_date, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        Contenu.add(DashBord, BorderLayout.NORTH);
        // Panel for the project panels
        JPanel projectsPanel = new JPanel(new GridLayout(0, 3, 30, 30));
        projectsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        projectsPanel.setBackground(Color.white);
        Vector<Integer> idprojets = fetchProjectsForUser(iduser);
        for (int id : idprojets) {
            JPanel projectPanel = createProjectPanel(id);
            projectsPanel.add(projectPanel);
        }

        //Contenu.add(labelPanel, BorderLayout.NORTH);
        Contenu.add(projectsPanel, BorderLayout.CENTER);
        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new java.awt.BorderLayout());

        Header.setBackground(new java.awt.Color(153, 0, 204));
        Header.setLayout(new java.awt.GridBagLayout());

        LOGO.setFont(new java.awt.Font("Montserrat Black", 3, 24)); // NOI18N
        LOGO.setForeground(new java.awt.Color(255, 255, 255));
        LOGO.setText("P4P");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 67, 10, 0);
        Header.add(LOGO, gridBagConstraints);

        Username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Username.setText(username);
        Username.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Username.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Username.setIconTextGap(1);
        Username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernameMouseClicked(evt);
            }
        });
        

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 10, 49);
        Header.add(Username, gridBagConstraints);

        userIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("assets/icons8-user-30.png"))); // NOI18N
        userIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 623, 10, 0);
        Header.add(userIcon, gridBagConstraints);

        body.add(Header, java.awt.BorderLayout.NORTH);

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        Menu.setPreferredSize(new java.awt.Dimension(180, 427));
        Menu.setLayout(new java.awt.GridLayout(9, 0));

        Home1.setBackground(new java.awt.Color(153, 0, 204));
        Home1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Home1.setForeground(Color.white);
        Home1.setText("Home");
        Home1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Menu.add(Home1);

        Projects.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Projects.setBackground(Color.white);
        Projects.setForeground(new java.awt.Color(153, 0, 204));
        Projects.setText("Projects");
        Projects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        Projects.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Projects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectsActionPerformed(evt);
            }
        });

        Menu.add(Projects);

        Messages.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Messages.setForeground(new java.awt.Color(153, 0, 204));
        Messages.setText("Messages");
        Messages.setBackground(Color.white);
        Messages.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        Messages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Menu.add(Messages);

        Requests.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Requests.setBackground(Color.white);
        Requests.setForeground(new java.awt.Color(153, 0, 204));
        Requests.setText("Requests");
        Requests.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        Requests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Menu.add(Requests);

        Invitations.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Invitations.setBackground(Color.white);
        Invitations.setForeground(new java.awt.Color(153, 0, 204));
        Invitations.setText("Invitations");
        Invitations.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        Invitations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Menu.add(Invitations);

        Agenda.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Agenda.setBackground(Color.white);
        Agenda.setForeground(new java.awt.Color(153, 0, 204));
        Agenda.setText("Agenda");
        Agenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        Agenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Menu.add(Agenda);
        
        body.add(Menu, java.awt.BorderLayout.WEST);

        Contenu.setBackground(new java.awt.Color(255, 255, 255));

        body.add(scrollPane, java.awt.BorderLayout.CENTER);

        getContentPane().add(body, java.awt.BorderLayout.CENTER);

        pack();
    }

    private JPanel createProjectPanel(int id) {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setPreferredSize(new Dimension(225, 250)); // Set preferred size

        // Add padding inside the panel and retain the original border
        panel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2), // External visible border
            BorderFactory.createEmptyBorder(10, 15, 10, 15) // Inner padding
        ));

        JLabel projectName = new JLabel("Project Name");
        projectName.setFont(new Font("Segoe UI", 1, 16));
        projectName.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(projectName, BorderLayout.NORTH);
        panel.setBackground(Color.white);

        JTextArea projectDescription = new JTextArea();
        projectDescription.setBackground(new java.awt.Color(255, 255, 255));
        projectDescription.setEditable(false);
        projectDescription.setWrapStyleWord(true);
        projectDescription.setLineWrap(true);

        JScrollPane scrollPane = new JScrollPane(projectDescription);
        panel.add(scrollPane, BorderLayout.CENTER);
        scrollPane.setBorder(null);

        JButton ButtonSeeMore = new JButton();
        ButtonSeeMore.setBackground(new java.awt.Color(0, 51, 204));
        ButtonSeeMore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonSeeMore.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSeeMore.setText("See more >");
        panel.add(ButtonSeeMore, BorderLayout.SOUTH);

        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM PROJET WHERE IDPROJET = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                projectName.setText(rs.getString(2));
                projectDescription.setText(rs.getString(4));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return panel;
    }
    
    private void projectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectsActionPerformed
    	Projects prs = new Projects(iduser, username);
    	prs.setSize(1050, 650);
    	prs.setVisible(true);
    	this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_projectsActionPerformed
    private void UsernameMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    	Profile pf = new Profile(iduser, username);
    	pf.setVisible(true);
    	pf.setSize(1050, 650);
    	
    } 

    public static void main(String args[]) {
    	System.out.println("i'm in the main function");
        HomePageUser p = new HomePageUser(0,"oubeza_idir");
        p.setVisible(true);
        p.setSize(1050, 650);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Agenda;
    private javax.swing.JPanel Contenu;
    private javax.swing.JPanel Header;
    private javax.swing.JButton Home1;
    private javax.swing.JButton Invitations;
    private javax.swing.JLabel LOGO;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton Messages;
    private javax.swing.JButton Projects;
    private javax.swing.JButton Requests;
    private javax.swing.JLabel Username;
    private javax.swing.JPanel body;
    private javax.swing.JLabel userIcon;
       
    private JPanel DashBord;
    private JTable activity_table;
    /*private JButton deconnexion;
    private JButton Invitation;*/
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JScrollPane jScrollPane1;
    private JLabel last_connexion_date;
    protected Instant last_con_date ;
    // protected static String usrname ; 

    // End of variables declaration 
}
