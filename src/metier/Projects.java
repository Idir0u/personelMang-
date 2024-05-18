package metier;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class Projects extends javax.swing.JFrame {
    Connection conn = Utilitaire.getConnection();
    private int iduser;
    private String username;
    
    public Vector<Integer> fetchProjectsForUser(int iduser) {
        Vector<Integer> projectIds = new Vector<>();

        String query;
        if (iduser == 0) {
            query = "SELECT IdProjet FROM projet";
        } else {
            query = "SELECT DISTINCT p.IdProjet " +
                    "FROM projet p " +
                    "JOIN groupe g ON (p.nom_court = g.nom_groupe OR p.nom_court = CONCAT(g.nom_groupe, '-adm')) " +
                    "JOIN ulilisateur_groupe ug ON g.IdGroupe = ug.IdGroupe " +
                    "WHERE ug.IdUtilisateur = ?";
        }

        try (PreparedStatement ps = conn.prepareStatement(query)) {
            if (iduser != 0) {
                ps.setInt(1, iduser);
            }
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                projectIds.add(rs.getInt("IdProjet"));
            }
        } catch (SQLException e) {
            System.out.println("Exception: " + e);
        }

        return projectIds;
    }




    public Projects(int iduser, String username) {
    	this.username = username;
    	this.iduser = iduser;
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
        Contenu = new javax.swing.JPanel();
        
        
        JScrollPane scrollPane = new JScrollPane(Contenu);

        Contenu.setLayout(new BorderLayout());
        Contenu.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        setPreferredSize(new Dimension(1050, 650));
        
        // Panel for the label
        JPanel labelPanel = new JPanel();
        JLabel projectsLabel = new JLabel("My Projects");
        projectsLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        projectsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        projectsLabel.setForeground(Color.white);
        labelPanel.setBackground(new java.awt.Color(0, 51, 204));
        labelPanel.add(projectsLabel);

        // Panel for the project panels
        JPanel projectsPanel = new JPanel(new GridLayout(0, 3, 30, 30));
        projectsPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        projectsPanel.setBackground(Color.white);
        Vector<Integer> idprojets = fetchProjectsForUser(iduser);
        for (int id : idprojets) {
            JPanel projectPanel = createProjectPanel(id);
            projectsPanel.add(projectPanel);
        }

        Contenu.add(labelPanel, BorderLayout.NORTH);
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
        Menu.setLayout(new java.awt.GridLayout(8, 0));

        Home1.setBackground(Color.white);
        Home1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Home1.setForeground(new java.awt.Color(153, 0, 204));
        Home1.setText("Home");
        Home1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Menu.add(Home1);

        Projects.setFont(new java.awt.Font("Segoe UI", 1, 14));
        Projects.setBackground(new java.awt.Color(153, 0, 204));
        Projects.setForeground(Color.white);
        Projects.setText("Projects");
        Projects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
        Projects.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
    private void UsernameMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    	Profile pf = new Profile(iduser, username);
    	pf.setVisible(true);
    	
    } 

    public static void main(String args[]) {
        Projects p = new Projects(0,"oubeza_idir");
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
    
    
    
    // End of variables declaration   
 
}
