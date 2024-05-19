package metier;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.*;

 
public class RessourcesPage extends javax.swing.JFrame {
			private int iduser ;
			private String username;
			private String NomCourt;
   
    public RessourcesPage(int iduser, String proj_name , String username , String date , String Descript, String NomCourt) {
    	
            java.awt.GridBagConstraints gridBagConstraints;
            project_name = proj_name ;
            username_var = username ;
            this.date = date ;
            this.Description = Descript ;
            this.iduser = iduser;
            this.username = username;
            this.NomCourt = NomCourt;

            Messages4 = new javax.swing.JButton();
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
            membres = new javax.swing.JButton();
            Agenda = new javax.swing.JButton();
            ressources = new javax.swing.JButton();
            about = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            Ressources_Projet = new javax.swing.JTree();
            adhesion = new javax.swing.JButton();

            Messages4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
            Messages4.setForeground(new java.awt.Color(153, 0, 204));
            Messages4.setText("Invitation");
            Messages4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 204)));
            Messages4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            Messages4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Messages4ActionPerformed(evt);
                }
            });

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
            menu.setText("Home");
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
            agenda.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    agendaActionPerformed(evt);
                }
            });
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
                    invitationsActionPerformed(evt);
                }
            });
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 5;
            gridBagConstraints.ipadx = 82;
            gridBagConstraints.ipady = 48;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            gridBagConstraints.insets = new java.awt.Insets(0, 0, 46, 0);
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
            Username.setIcon(new javax.swing.ImageIcon(getClass().getResource("icons8-user-30.png"))); // NOI18N
            Username.setText(username);
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipadx = 80;
            gridBagConstraints.ipady = -2;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            gridBagConstraints.insets = new java.awt.Insets(10, 556, 0, 22);
            header.add(Username, gridBagConstraints);

            body.add(header, java.awt.BorderLayout.PAGE_START);

            contenu.setBackground(new java.awt.Color(255, 255, 255));
            contenu.setLayout(new java.awt.GridBagLayout());

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

            Agenda.setBackground(new java.awt.Color(153, 0, 204));
            Agenda.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
            Agenda.setForeground(new java.awt.Color(255, 255, 255));
            Agenda.setText("Agend");
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
            gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
            contenu.add(Agenda, gridBagConstraints);

            ressources.setBackground(new java.awt.Color(153, 0, 204));
            ressources.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
            ressources.setForeground(new java.awt.Color(255, 255, 255));
            ressources.setText("Ressources");
            ressources.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ressourcesActionPerformed(evt);
                }
            });
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
            gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
            contenu.add(about, gridBagConstraints);

            
            // Création du nœud racine
			DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Ressources du projet");
			// Création des nœuds pour src et web
			DefaultMutableTreeNode srcNode = new DefaultMutableTreeNode("src");
			DefaultMutableTreeNode webNode = new DefaultMutableTreeNode("web");
			//request
			String sqlProjId = "SELECT IdProjet FROM projet WHERE nom_long = ?";
			String sqlSrc = "SELECT titre , extension from document WHERE Document_type = 'src' AND IdProjet = ?";
			String sqlWeb = "SELECT titre , extension from document WHERE Document_type = 'web' AND IdProjet = ?";
			
            try
            {
			PreparedStatement stmtProjId = con.prepareStatement(sqlProjId);
			stmtProjId.setString(1, project_name);
			ResultSet rsprojId = stmtProjId.executeQuery();
			rsprojId.next();
			proj_id = rsprojId.getInt(1);
            }
            catch(Exception e)
            {
			   System.out.println(e);
            }
			
				
			
				
			
			// Ajout des fichiers src
			try 
			{
				PreparedStatement statementSrc = con.prepareStatement(sqlSrc);
				statementSrc.setInt(1, proj_id);
			    ResultSet resultSetSrc = statementSrc.executeQuery();
			        while (resultSetSrc.next()) {
			            String fileName = resultSetSrc.getString("titre");
			            String exten = resultSetSrc.getString("extension");
			            srcNode.add(new DefaultMutableTreeNode(fileName+"."+exten));
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			    
			

			// Ajout des fichiers web
			try 
			{
				PreparedStatement statementWeb = con.prepareStatement(sqlWeb);
				statementWeb.setInt(1, proj_id);
			    ResultSet resultSetWeb = statementWeb.executeQuery();
			        while (resultSetWeb.next()) {
			            String fileName = resultSetWeb.getString("titre");
			            String exten = resultSetWeb.getString("extension");
			            webNode.add(new DefaultMutableTreeNode(fileName+"."+exten));
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

			// Ajout des nœuds src et web au nœud racine
			rootNode.add(srcNode);
			rootNode.add(webNode);

			// Création du modèle d'arbre et mise à jour de l'UI
			Ressources_Projet.setModel(new javax.swing.tree.DefaultTreeModel(rootNode));
            jScrollPane1.setViewportView(Ressources_Projet);
        

            Ressources_Projet.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    if (SwingUtilities.isRightMouseButton(e)) {
                        int row = Ressources_Projet.getClosestRowForLocation(e.getX(), e.getY());
                        Ressources_Projet.setSelectionRow(row);
                        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) Ressources_Projet.getLastSelectedPathComponent();
                        if (selectedNode != null) {
                            JPopupMenu popupMenu = new JPopupMenu();
                            
                            // Vérifiez si le nœud sélectionné est "src" ou "web"
                            if (selectedNode.toString().equals("src") || selectedNode.toString().equals("web")) {
                                JMenuItem addItem = new JMenuItem("Ajouter un nouveau fichier");
                                addItem.addActionListener(actionEvent -> {
                                    new DocumentAddPage(project_name, proj_id, selectedNode.toString()).setVisible(true);
                                });
                                popupMenu.add(addItem);
                            } else if (!selectedNode.isRoot() && (selectedNode.getParent().toString().equals("src") || selectedNode.getParent().toString().equals("web"))) {
                                // Les options "Supprimer" et "Ouvrir" sont disponibles pour les sous-fichiers de "src" ou "web"
                                JMenuItem deleteItem = new JMenuItem("Supprimer");
                                deleteItem.addActionListener(actionEvent -> {
                                    // Appeler la fonction qui supprime le fichier dans la base de données
                                    deleteFileFromDatabase(selectedNode.toString());
                                });
                                popupMenu.add(deleteItem);
                                
                                JMenuItem openItem = new JMenuItem("Ouvrir");
                                openItem.addActionListener(actionEvent -> {
                                    // Appeler la fonction qui ouvre le fichier
                                    openFile(selectedNode.toString());
                                });
                                popupMenu.add(openItem);
                                
                                JMenuItem downloadItem = new JMenuItem("Télécharger");
                                downloadItem.addActionListener(actionEvent -> {
                                    // Call the function that handles file download
                                    downloadFile(selectedNode.toString());
                                });
                                popupMenu.add(downloadItem);
                            }
                            
                            popupMenu.show(Ressources_Projet, e.getX(), e.getY());
                        }
                    }
                }

                
                
             // Function to open the file
                private void openFile(String fileName) {
                    try {
                        // Retrieve the file from the database
                        File fileToOpen = getFileFromDatabase(fileName);
                        if (fileToOpen != null) {
                            Desktop.getDesktop().open(fileToOpen);
                        } else {
                            // Handle the case where the file is not found or cannot be retrieved
                            JOptionPane.showMessageDialog(null, "Le fichier n'a pas pu être récupéré de la base de données.");
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

                // Function to download the file
                private void downloadFile(String fileName) {
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setDialogTitle("Choisissez un emplacement pour enregistrer le fichier");
                    int userSelection = fileChooser.showSaveDialog(null);
                    if (userSelection == JFileChooser.APPROVE_OPTION) {
                        File fileToSave = fileChooser.getSelectedFile();
                        // Retrieve the file from the database
                        File fileToDownload = getFileFromDatabase(fileName);
                        if (fileToDownload != null) {
                            // Implement the logic to save the file to the chosen location
                            try {
                                Files.copy(fileToDownload.toPath(), fileToSave.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                JOptionPane.showMessageDialog(null, "Le fichier a été téléchargé avec succès.");
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        } else {
                            // Handle the case where the file is not found or cannot be retrieved
                            JOptionPane.showMessageDialog(null, "Le fichier n'a pas pu être récupéré de la base de données.");
                        }
                    }
                }

                private File getFileFromDatabase(String fileName) {
                    File file = null;
                    PreparedStatement pstmt = null;
                    ResultSet rs = null;
                    InputStream input = null;
                    FileOutputStream output = null;

                    try {
                        String sql = "SELECT contenu FROM document WHERE titre = ? AND IdProjet = ?";
                        pstmt = con.prepareStatement(sql);
                        pstmt.setString(1, fileName.substring(0, fileName.lastIndexOf(".")));
                        pstmt.setInt(2, proj_id);
                        rs = pstmt.executeQuery();

                        if (rs.next()) {
                            Blob blob = rs.getBlob("contenu");
                            input = blob.getBinaryStream();
                            
                            // Create a temporary file to store the blob content
                            file = File.createTempFile("downloaded_", fileName);
                            output = new FileOutputStream(file);

                            byte[] buffer = new byte[4096];
                            int bytesRead = -1;
                            while ((bytesRead = input.read(buffer)) != -1) {
                                output.write(buffer, 0, bytesRead);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        // Close resources
                        try {
                            if (output != null) output.close();
                            if (input != null) input.close();
                            if (rs != null) rs.close();
                            if (pstmt != null) pstmt.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    return file;
                }

				private void deleteFileFromDatabase(String title) {
					
					try 
					{
						PreparedStatement ps = con.prepareStatement("DELETE FROM document WHERE titre = ? and IdProjet = ?");
						ps.setString(1, title.substring(0, title.lastIndexOf(".")));
						ps.setInt(2,proj_id);
						ps.executeUpdate();
						
					}catch (Exception e)
					{
						System.out.println(e);
					}
					JOptionPane.showMessageDialog(null, "Document has been deleted ", "Notif", JOptionPane.ERROR_MESSAGE);
                   
				}
            });
            
            

            
            gridBagConstraints = new java.awt.GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridwidth = 6;
            gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
            gridBagConstraints.ipadx = 814;
            gridBagConstraints.ipady = 344;
            gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new java.awt.Insets(20, 20, 18, 0);
            contenu.add(jScrollPane1, gridBagConstraints);

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
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
            );

            pack();
    }

    
   
    private void menuActionPerformed(ActionEvent evt) {                                      
        HomePageUser nwusp = new HomePageUser(iduser, username_var);
        nwusp.setVisible(true);
        Window win = SwingUtilities.getWindowAncestor(menu);
        win.dispose();
    }                                     
    private void home1ActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
    	HomePageUser pf = new HomePageUser(iduser, username);
    	pf.setVisible(true);
    	pf.setLocationRelativeTo(null);
    	pf.setSize(1050, 650);
    	this.setVisible(false);
		
	}

	private void agendaActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		UserAgendaPage pf = new UserAgendaPage(iduser, username);
    	pf.setVisible(true);
    	pf.setLocationRelativeTo(null);
    	pf.setSize(1050, 650);
    	this.setVisible(false);
		
	}

	private void messagesActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		UserMessagePage pf = new UserMessagePage(iduser, username);
    	pf.setVisible(true);
    	pf.setLocationRelativeTo(null);
    	pf.setSize(1050, 650);
    	this.setVisible(false);
		
	}

	private void requestsActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		UserRequests pf = new UserRequests(iduser, username);
    	pf.setVisible(true);
    	pf.setLocationRelativeTo(null);
    	pf.setSize(1050, 650);
    	this.setVisible(false);
		
	}

	private void invitationsActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		Invitation_demande inv = new Invitation_demande(iduser, username);
    	inv.setVisible(true);
    	inv.setLocationRelativeTo(null);
    	inv.setSize(1050, 650);
    	this.setVisible(false);
		
	}
    
    private void projectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectsActionPerformed
    	System.out.println("in homepageuser "+ iduser +" "+ username);
    	Projects prs = new Projects(iduser, username);
    	prs.setSize(1050, 650);
    	prs.setLocationRelativeTo(null);
    	prs.setVisible(true);
    	this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_projectsActionPerformed
    private void UsernameMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    	System.out.println("in homepageuser "+ iduser +" "+ username);
    	Profile pf = new Profile(iduser, username);
    	pf.setVisible(true);
    	pf.setLocationRelativeTo(null);
    	pf.setSize(1050, 650);
    }
    
  


    
    private void membresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membresActionPerformed
        new MembersPage(iduser, username, NomCourt).setVisible(true);
    }//GEN-LAST:event_membresActionPerformed

    private void ressourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ressourcesActionPerformed
         new RessourcesPage(iduser, project_name ,username_var,date,Description, NomCourt).setVisible(true);
    }

   

   /* private void aboutActionPerformed(java.awt.event.ActionEvent evt) {
    	 new AboutPage(project_name,Description username_var);
    	
    }*/

  

    private void adhesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adhesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adhesionActionPerformed

   

    private void Messages4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Messages4ActionPerformed
        
    }//GEN-LAST:event_Messages4ActionPerformed

   /* private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        new AboutPage(username_var).setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed*/

    private void AgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaActionPerformed
        AgendaPage agp = new AgendaPage(iduser, username, NomCourt);
        agp.RemplirTable(proj_id);
        agp.setVisible(true);
    }//GEN-LAST:event_AgendaActionPerformed

    
    private javax.swing.JButton Agenda;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton Messages4;
    private javax.swing.JLabel P4P;
    private javax.swing.JTree Ressources_Projet;
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
    protected static String project_name ;
    protected static String username_var ;
    protected String date ;
    protected String Description ;
    protected int proj_id ;
    public static Connection con = Utilitaire.getConnection();
   
}