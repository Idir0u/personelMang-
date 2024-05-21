package metier;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.*;

 





public class RessourcesPage extends JFrame {
			
			private Info info;
   
    public RessourcesPage(Info info) {
    	
            GridBagConstraints gridBagConstraints;
            this.info = info;
            /*
            project_name = proj_name ;
            username_var = username ;
            this.date = date ;
            this.Description = Descript ;
            this.iduser = iduser;
            this.username = username;
            this.NomCourt = NomCourt;*/

            body = new JPanel();
            header = new JPanel();
            P4P = new JLabel();
            Username = new JLabel();
            contenu = new JPanel();
            membres = new JButton();
            Agenda = new JButton();
            ressources = new JButton();
            about = new JButton();
            jScrollPane1 = new JScrollPane();
            Ressources_Projet = new JTree();
            adhesion = new JButton();

           

            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

            body.setBackground(new Color(255, 255, 255));
            body.setLayout(new BorderLayout());

            


            header.setBackground(new Color(153, 0, 204));
            header.setLayout(new GridBagLayout());

            P4P.setBackground(new Color(255, 255, 255));
            P4P.setFont(new Font("Segoe UI", 3, 24)); // NOI18N
            P4P.setForeground(new Color(255, 255, 255));
            P4P.setText("P4P");
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.gridheight = 2;
            gridBagConstraints.ipady = 18;
            gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
            gridBagConstraints.insets = new Insets(0, 90, 0, 0);
            header.add(P4P, gridBagConstraints);

            Username.setBackground(new Color(255, 255, 255));
            Username.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
            Username.setForeground(new Color(255, 255, 255));
            Username.setIcon(new ImageIcon(getClass().getResource("assets/icons8-user-30.png"))); // NOI18N
            Username.setText(info.getUsername() + "--" + info.getMode_navigation());
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipadx = 80;
            gridBagConstraints.ipady = -2;
            gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
            gridBagConstraints.insets = new Insets(10, 556, 0, 22);
            header.add(Username, gridBagConstraints);

            body.add(header, BorderLayout.PAGE_START);

            contenu.setBackground(new Color(255, 255, 255));
            contenu.setLayout(new GridBagLayout());

            membres.setBackground(new Color(153, 0, 204));
            membres.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
            membres.setForeground(new Color(255, 255, 255));
            membres.setText("Membres");
            membres.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    membresActionPerformed(evt);
                }
            });
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 3;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipadx = 24;
            gridBagConstraints.ipady = 32;
            gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
            gridBagConstraints.insets = new Insets(10, 20, 0, 0);
            contenu.add(membres, gridBagConstraints);

            Agenda.setBackground(new Color(153, 0, 204));
            Agenda.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
            Agenda.setForeground(new Color(255, 255, 255));
            Agenda.setText("Agenda");
            Agenda.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    AgendaActionPerformed(evt);
                }
            });
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 2;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipadx = 13;
            gridBagConstraints.ipady = 32;
            gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
            gridBagConstraints.insets = new Insets(10, 20, 0, 0);
            contenu.add(Agenda, gridBagConstraints);

            ressources.setBackground(new Color(153, 0, 204));
            ressources.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
            ressources.setForeground(new Color(255, 255, 255));
            ressources.setText("Ressources");
            ressources.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    ressourcesActionPerformed(evt);
                }
            });
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipadx = 8;
            gridBagConstraints.ipady = 32;
            gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
            gridBagConstraints.insets = new Insets(10, 20, 0, 0);
            contenu.add(ressources, gridBagConstraints);

            about.setBackground(new Color(153, 0, 204));
            about.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
            about.setForeground(new Color(255, 255, 255));
            about.setText("About");
            about.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    aboutActionPerformed(evt);
                }
            });
            
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipadx = 30;
            gridBagConstraints.ipady = 32;
            gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
            gridBagConstraints.insets = new Insets(10, 10, 0, 0);
            contenu.add(about, gridBagConstraints);

            
            // Création du nœud racine
			DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("Ressources du projet");
			// Création des nœuds pour src et web
			DefaultMutableTreeNode srcNode = new DefaultMutableTreeNode("src");
			DefaultMutableTreeNode webNode = new DefaultMutableTreeNode("web");
			//request
			//String sqlProjId = "SELECT IdProjet FROM projet WHERE nom_long = ?";
			String sqlSrc = "SELECT titre , extension from document WHERE Document_type = 'src' AND IdProjet = ?";
			String sqlWeb = "SELECT titre , extension from document WHERE Document_type = 'web' AND IdProjet = ?";
			
            
			
				
			
				
			
			// Ajout des fichiers src
			try 
			{	if(info.isPublic() || info.getMode_navigation().equalsIgnoreCase("admin") || info.getMode_navigation().equalsIgnoreCase("membre")){
					PreparedStatement statementSrc = con.prepareStatement(sqlSrc);
					statementSrc.setInt(1, info.getIdprojetAboutPage());
				    ResultSet resultSetSrc = statementSrc.executeQuery();
			        while (resultSetSrc.next()) {
			            String fileName = resultSetSrc.getString("titre");
			            String exten = resultSetSrc.getString("extension");
			            srcNode.add(new DefaultMutableTreeNode(fileName+"."+exten));
			        }
				}else {
					srcNode.add(new DefaultMutableTreeNode("private files"));
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			    
			

			// Ajout des fichiers web(affichage s'ils existent a la DB
			try 
			{	//dépot web est accessible pour tous le monde (remarque :  mais n'est pas modifiable par des non membre/admin )
					PreparedStatement statementWeb = con.prepareStatement(sqlWeb);
					statementWeb.setInt(1, info.getIdprojetAboutPage());
				    ResultSet resultSetWeb = statementWeb.executeQuery();
				        while (resultSetWeb.next()) {
				            String fileName = resultSetWeb.getString("titre");
				            String exten = resultSetWeb.getString("extension");
				            webNode.add(new DefaultMutableTreeNode(fileName+exten));
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
                            if ( ( selectedNode.toString().equals("src") || selectedNode.toString().equals("web") )  &&  ( info.getMode_navigation().equalsIgnoreCase("admin") || info.getMode_navigation().equalsIgnoreCase("membre") )  ) {
                                JMenuItem addItem = new JMenuItem("Ajouter un nouveau fichier");
                                addItem.addActionListener(actionEvent -> {
                                    new DocumentAddPage(info.getNom_long(), info.getIdprojetAboutPage(), selectedNode.toString()).setVisible(true);
                                });
                                popupMenu.add(addItem);
                            } else if (!selectedNode.isRoot() && (selectedNode.getParent().toString().equals("src") || selectedNode.getParent().toString().equals("web"))) {
                                if (info.getMode_navigation().equalsIgnoreCase("admin") || info.getMode_navigation().equalsIgnoreCase("membre")  ) {
									// Les options "Supprimer" et "Ouvrir" sont disponibles pour les sous-fichiers de "src" ou "web"
									JMenuItem deleteItem = new JMenuItem("Supprimer");
									deleteItem.addActionListener(actionEvent -> {
										// Appeler la fonction qui supprime le fichier dans la base de données
										deleteFileFromDatabase(selectedNode.toString());
									});
									popupMenu.add(deleteItem);
                                }									
								
								///////////////////////////////////////////////////////////////////
                                
                                if ( info.isPublic() || info.getMode_navigation().equalsIgnoreCase("admin") || info.getMode_navigation().equalsIgnoreCase("membre") || selectedNode.getParent().toString().equals("web")) {
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
                        pstmt.setInt(2, info.getIdprojetAboutPage());
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
						ps.setInt(2,info.getIdprojetAboutPage());
						ps.executeUpdate();
						
					}catch (Exception e)
					{
						System.out.println(e);
					}
					JOptionPane.showMessageDialog(null, "Document has been deleted ", "Notif", JOptionPane.ERROR_MESSAGE);
                   
				}
            });
            
            

            
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            gridBagConstraints.gridwidth = 6;
            gridBagConstraints.fill = GridBagConstraints.BOTH;
            gridBagConstraints.ipadx = 814;
            gridBagConstraints.ipady = 344;
            gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
            gridBagConstraints.weightx = 1.0;
            gridBagConstraints.weighty = 1.0;
            gridBagConstraints.insets = new Insets(20, 20, 18, 0);
            contenu.add(jScrollPane1, gridBagConstraints);

            adhesion.setBackground(new Color(153, 0, 204));
            adhesion.setFont(new Font("Segoe UI", 1, 24)); // NOI18N
            adhesion.setForeground(new Color(255, 255, 255));
            adhesion.setText("Adhésion");
            adhesion.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    adhesionActionPerformed(evt);
                }
            });
            gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 4;
            gridBagConstraints.gridy = 0;
            gridBagConstraints.ipadx = 24;
            gridBagConstraints.ipady = 32;
            gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
            gridBagConstraints.insets = new Insets(10, 20, 0, 0);
            contenu.add(adhesion, gridBagConstraints);

            body.add(contenu, BorderLayout.CENTER);

            GroupLayout layout = new GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(body, GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(body, GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
            );

            pack();
    }

 
    private void membresActionPerformed(ActionEvent evt) {//GEN-FIRST:event_membresActionPerformed
        MembersPage mp = new MembersPage(info);
        mp.RemplirTable(info.getNom_court());
        mp.setVisible(true);
        mp.setSize(1900, 1000);
        mp.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_membresActionPerformed

    private void ressourcesActionPerformed(ActionEvent evt) {//GEN-FIRST:event_ressourcesActionPerformed
    	RessourcesPage rsp = new RessourcesPage(info);
        rsp.setVisible(true);
        rsp.setLocationRelativeTo(null);
        rsp.setSize(950, 550);
        this.setVisible(false);
    }//GEN-LAST:event_ressourcesActionPerformed

   

    private void aboutActionPerformed(ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
    	AboutPage rsp = new AboutPage(info);
        rsp.setVisible(true);
        rsp.setLocationRelativeTo(null);
        rsp.setSize(950, 550);
        this.setVisible(false);
    }//GEN-LAST:event_aboutActionPerformed

    

    private void adhesionActionPerformed(ActionEvent evt) {//GEN-FIRST:event_adhesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adhesionActionPerformed

    private void AgendaActionPerformed(ActionEvent evt) {//GEN-FIRST:event_AgendaActionPerformed
        AgendaPage ag = new AgendaPage(info);
        if(info.isPublic() || info.getMode_navigation().equalsIgnoreCase("admin") || info.getMode_navigation().equalsIgnoreCase("membre") ) {
            ag.RemplirTable(info.getIdprojetAboutPage());
            }
        ag.setLocationRelativeTo(null);
        ag.setVisible(true);
        ag.setSize(950, 550);
        this.setVisible(false);
    }//GEN-LAST:event_AgendaActionPerformed

    
    private JButton Agenda;
    private JLabel P4P;
    private JTree Ressources_Projet;
    private JLabel Username;
    private JButton about;
    private JButton adhesion;
    private JPanel body;
    private JPanel contenu;
    private JPanel header;
    private JScrollPane jScrollPane1;
    private JButton membres;
    private JButton ressources;
    /*protected static String project_name ;
    protected static String username_var ;
    protected String date ;
    protected String Description ;
    protected int proj_id ;*/
    public static Connection con = Utilitaire.getConnection();
   
}

