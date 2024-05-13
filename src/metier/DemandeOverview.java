package metier;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
//import java.lang.*;

import javax.swing.*;
import javax.swing.border.Border;

public class DemandeOverview extends JFrame {
	int id;
	Connection conn = Utilitaire.getConnection();
	private Object[] fetchDemandesPopUp(){
    	
		
    	try {
    		
            PreparedStatement pstmt = conn.prepareStatement("SELECT nom_court_projet, description_projet, date_demande, projet_is_public, IdGroupe, IdProjet FROM DEMANDE WHERE IdDemande = ?");
            pstmt.setInt(1, this.id);
            ResultSet rs = pstmt.executeQuery();

            
            if (rs.next()) {
                Object[] demande = {
                	rs.getString(1),
                	rs.getString(2),
                    rs.getDate(3),
                    rs.getInt(4),
                    rs.getInt(5),
                    rs.getInt(6),
                };
                return demande;
                
            	
            }
        } catch (Exception e) {
                        System.out.println("Exception : "+ e);
        }
        
		return null;
    }
    
    public DemandeOverview(int id) {
    	this.id = id;
    	Object[] demande = fetchDemandesPopUp();
        GridBagConstraints gridBagConstraints;

        jPanel1 = new JPanel();
        //datedesc = new JLabel();
        projectName = new JLabel();
        projectEtat = new JLabel();
        rfuseButton = new JButton();
        acceptButton = new JButton();
        h1Description = new JLabel();
        date = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(jPanel1, BorderLayout.CENTER); 
        jPanel1.setBackground(new Color(250, 251, 255));
        
        jPanel1.setPreferredSize(new Dimension(499, 394));
        jPanel1.setLayout(new GridBagLayout());
        getContentPane().add(jPanel1, BorderLayout.CENTER);
        
        Date date_dm = (Date)demande[2];
        
        // Format the Date object as a string
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(date_dm);
        
        // Create a JLabel and set the formatted date string as its text
        JLabel dateLabel = new JLabel(formattedDate);
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 16)); // Set font if desired
        
        // Add the JLabel to the frame
        
        
        dateLabel.setFont(new Font("Segoe UI", 0, 14)); // NOI18N
        dateLabel.setHorizontalAlignment(SwingConstants.LEFT);
        dateLabel.setVerticalAlignment(SwingConstants.TOP);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 152;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(20, 10, 0, 0);
        jPanel1.add(dateLabel, gridBagConstraints);

        projectName.setFont(new Font("Segoe UI", 1, 15)); // NOI18N
        projectName.setForeground(new Color(51, 0, 204));
        projectName.setHorizontalAlignment(SwingConstants.LEFT);
        //projectName.setBackground(Color.RED);
        //projectName.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 0, 204)));
        String name = (String) demande[0];
        projectName.setText("Project name :  "+ name);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 233;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(40, 30, 0, 0);
        jPanel1.add(projectName, gridBagConstraints);
//nom_long_projet, description_projet, date_demande, projet_is_public, IdGroup, IdProjet
        projectEtat.setFont(new Font("Segoe UI", 1, 17)); // NOI18N
        projectEtat.setForeground(new Color(153, 204, 0));
        
        
        if((int)demande[3] == 1) {
        	projectEtat.setText("Public");
        }else {
        	projectEtat.setText("Private");
        }
        
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(40, 60, 0, 10);
        jPanel1.add(projectEtat, gridBagConstraints);

        rfuseButton.setBackground(new Color(255, 51, 51));
        rfuseButton.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
        rfuseButton.setForeground(new Color(255, 255, 255));
        rfuseButton.setText("Refuse");
        rfuseButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        /*rfuseButton.addActionListener(new event.ActionListener() {
            public void actionPerformed(event.ActionEvent evt) {
                rfuseButtonActionPerformed(evt);
            }
        });*/
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(20, 50, 14, 0);
        jPanel1.add(rfuseButton, gridBagConstraints);

        acceptButton.setBackground(new Color(102, 255, 102));
        acceptButton.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
        acceptButton.setForeground(new Color(255, 255, 255));
        acceptButton.setText("Accept");
        acceptButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        /*acceptButton.addActionListener(new event.ActionListener() {
            public void actionPerformed(event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });*/
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(20, 20, 14, 0);
        jPanel1.add(acceptButton, gridBagConstraints);

        h1Description.setFont(new Font("Segoe UI", 1, 15)); // NOI18N
        h1Description.setForeground(new Color(51, 0, 204));
        h1Description.setHorizontalAlignment(SwingConstants.LEFT);
        h1Description.setText("Description :");
        h1Description.setVerticalAlignment(SwingConstants.TOP);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(15, 30, 0, 0);
        jPanel1.add(h1Description, gridBagConstraints);

        date.setFont(new Font("Segoe UI", 1, 15)); // NOI18N
        date.setForeground(new Color(51, 0, 204));
        date.setHorizontalAlignment(SwingConstants.LEFT);
        
        date.setText("Date :");
        date.setVerticalAlignment(SwingConstants.TOP);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(15, 30, 0, 0);
        jPanel1.add(date, gridBagConstraints);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setFont(new Font("Segoe UI", 0, 14)); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new Color(248, 255, 255));
        jTextArea1.setFont(new Font("Segoe UI", 0, 13)); // NOI18N
        jTextArea1.setLineWrap(true);
        String descp = (String) demande[1];
        jTextArea1.setText(descp);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setDisabledTextColor(new Color(0, 0, 51));
        
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 416;
        gridBagConstraints.ipady = 146;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(10, 30, 0, 20);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        getContentPane().add(jPanel1);

        pack();
    }
    public static void main(String args[]) {
        new DemandeOverview(1).setVisible(true);  
    }

    // Variables declaration - do not modify                     
    private JButton acceptButton;
    private JLabel date;
    private JLabel datedesc;
    private JLabel h1Description;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;
    private JLabel projectEtat;
    private JLabel projectName;
    private JButton rfuseButton;
    // End of variables declaration                   
}
