package metier;

import java.awt.Dimension;

public class AboutUs extends javax.swing.JFrame {

    
    public AboutUs() {
        
        java.awt.GridBagConstraints gridBagConstraints;

        body = new javax.swing.JPanel();
        ourTeam = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aboutUsp = new javax.swing.JTextArea();
        aboutUs = new javax.swing.JLabel();
        pictures = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new java.awt.GridBagLayout());

        ourTeam.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ourTeam.setForeground(new java.awt.Color(153, 0, 0));
        ourTeam.setText("Our Team");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 140, 0, 0);
        body.add(ourTeam, gridBagConstraints);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        aboutUsp.setEditable(false);
        aboutUsp.setBackground(new java.awt.Color(255, 255, 255));
        aboutUsp.setColumns(20);
        aboutUsp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        aboutUsp.setLineWrap(true);
        aboutUsp.setRows(5);
        aboutUsp.setText("Welcome to our project management platform, designed to streamline collaboration, organization, and tracking of projects within your team. Our system enables you to create, modify, and track projects with an intuitive interface, efficiently organize tasks and resources to achieve your goals, and collaborate in real-time with colleagues through integrated communication features like instant messaging and real-time notifications. You can easily manage users and groups, assign roles and permissions to control access to various project sections, and monitor resource allocation to ensure every project has the necessary tools and personnel for success. Additionally, our integrated calendar helps you plan tasks and events, keeping you organized and on schedule. Gain valuable insights with our reporting and analytics tools to measure performance and identify areas for improvement. Designed to be flexible and adaptable, our platform suits both small projects and large-scale initiatives. Join us and discover how our project management system can transform your way of working.");
        aboutUsp.setWrapStyleWord(true);
        aboutUsp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        aboutUsp.setDisabledTextColor(new java.awt.Color(0, 0, 51));
        aboutUsp.setEnabled(false);
        jScrollPane1.setViewportView(aboutUsp);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 916;
        gridBagConstraints.ipady = 206;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 70, 0, 63);
        body.add(jScrollPane1, gridBagConstraints);

        aboutUs.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        aboutUs.setForeground(new java.awt.Color(153, 0, 0));
        aboutUs.setText("About us");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 150, 0, 0);
        body.add(aboutUs, gridBagConstraints);

        pictures.setIcon(new javax.swing.ImageIcon(getClass().getResource("assets/Design sans titre (2).png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = -170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 180, 0, 0);
        body.add(pictures, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("Arnaud Ulrich TOE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 40, 50, 0);
        body.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("ZEMAT Zakariae");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 210, 50, 0);
        body.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("OUBEZA Idir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 50, 0);
        body.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("SAWADOGO Abdel");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 50, 0);
        body.add(jLabel4, gridBagConstraints);

        getContentPane().add(body, java.awt.BorderLayout.CENTER);

        pack();
    }
    

    // Variables declaration - do not modify                     
    private javax.swing.JLabel aboutUs;
    private javax.swing.JTextArea aboutUsp;
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ourTeam;
    private javax.swing.JLabel pictures;
    // End of variables declaration                   
}
