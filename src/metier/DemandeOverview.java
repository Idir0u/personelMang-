package metier;

import java.awt.*;
import java.awt.event.*;
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
	String type;
	boolean withButtons;
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
	
    
    public DemandeOverview(int id, String type, boolean withButtons) {
    	this.withButtons= withButtons;
    	this.id = id;
    	this.type = type;
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
        /*
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                dispose(); // Dispose of the frame when it's closed
            }
        });
        */

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
///////////////////////////////////////////////////////////
        if(type.equalsIgnoreCase("closure") && projectEtat.getText().equalsIgnoreCase("Private")) {
        	//rfuseButton.setBackground( Color.GRAY );
        	rfuseButton.setEnabled(false);//disable the button

        }
        rfuseButton.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
        rfuseButton.setForeground(new Color(255, 255, 255));
        rfuseButton.setText("Refuse");
        rfuseButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        rfuseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                rfuseButtonActionPerformed(evt);
            }
        });
        
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
        acceptButton.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });
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
        if(!this.withButtons){
        	acceptButton.setEnabled(false);
        	rfuseButton.setEnabled(false);
        	acceptButton.setVisible(false);
        }

        pack();
    }
    private void rfuseButtonActionPerformed(ActionEvent evt) {
    	//update the state(etat) of the demande from pending into Refused
    	//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! don't forget to add the conditioning on if the type is closure or creation
    	// if it's creation then you directly refuse the demande
    	// if it's closure -> private can't refuse
    	// if it's closure -> public can refuse, but destroy the list of members and admins and the 2groups in the table groupe and user_group
    	if(!projectEtat.getText().equalsIgnoreCase("Private") || !type.equalsIgnoreCase("closure")) {//admin can't refuse the closure of a private project
        	try {
        		
                PreparedStatement pstmt = conn.prepareStatement("UPDATE DEMANDE SET etat = ? WHERE IdDemande = ?");
                pstmt.setObject(1,"Refused");
                pstmt.setInt(2, this.id);
                int et = pstmt.executeUpdate();                
                if (et >= 1) {
                    System.out.println("the update has been done succesfuly");              	
                }else {
                	System.out.println(et +"lines affected!");
                }
            } catch (Exception e) {
                            System.out.println("Exception : "+ e);
            }
        	if(projectEtat.getText().equalsIgnoreCase("Public")) {
        		//destroy the relationships of admins and members with there groups, then also the group (line ine db) itself, but not the project
        		//void closePublicProjectRefuse(idProjet);
        	}
    	}
    }
    private void acceptButtonActionPerformed(ActionEvent evt) {
    	//update the state(etat) of the demande from pending into Accepted
    	//create the project with information provided by the user(demander) 
    		//idprojet (auto_inc), etc du columns
    	//create 2 groups (admins, and members) and the userid that demanded as the first admin for the group/project that means adding the relationship between this iduser and the idgroup(admin)
    	//ps: idadmin = idmember +(-) 1;
    	//if it's closure -> public destroy everything the project line, 2 groupe lines(grpadmin, grpmember), all the realtionships lines in group_utilisateur(DELETE * FROM UTIL_GRP WHERE IDGROUP= idgrp_admin and (+-1)idgrp_membre
    	//if it's creation -> public and private (no condition) the only diff is in the insert line (etat: private ou public)
    	try {
            PreparedStatement pstmt = conn.prepareStatement("UPDATE DEMANDE SET etat = ? WHERE IdDemande = ?");
            pstmt.setObject(1,"Accepted");
            pstmt.setInt(2, this.id);
            int et = pstmt.executeUpdate();                
            if (et >= 1) {
                System.out.println("the update has been done succesfuly");              	
            }else {
            	System.out.println(et +"lines affected!");
            }
        } catch (Exception e) {
                        System.out.println("Exception : "+ e);
        }
    	if(type.equalsIgnoreCase("closure")) {
        	//if it's closure -> public destroy everything the project line, 2 groupe lines(grpadmin, grpmember),
    		//all the realtionships lines in group_utilisateur(DELETE * FROM UTIL_GRP WHERE IDGROUP= idgrp_admin and (+-1)idgrp_membre;
    		//and all the ressource related to idprojet
    		//void closePublicProjectAccept(idProjet);
    	}else if(type.equalsIgnoreCase("creation")) {
    		//void createProject(info);
    	}
    	
    }
    public static void main(String args[]) {
        new DemandeOverview(1,"",true).setVisible(true);
    }

    public JButton getAcceptButton() {
		return acceptButton;
	}


	public void setAcceptButton(JButton acceptButton) {
		this.acceptButton = acceptButton;
	}
	public void setAcceptVisible(boolean etat) {
		this.acceptButton.setVisible(etat);
	}
	public void setRefuseVisible(boolean etat) {
		this.rfuseButton.setVisible(etat);
	}

	public JButton getRfuseButton() {
		return rfuseButton;
	}


	public void setRfuseButton(JButton rfuseButton) {
		this.rfuseButton = rfuseButton;
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
