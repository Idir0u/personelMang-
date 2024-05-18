package metier;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

public class UsersPage extends JFrame {
	Connection conn = Utilitaire.getConnection();
	private String username;
	
	DefaultTableModel model;
    public UsersPage(String username) {
    	this.username = username;
        GridBagConstraints gridBagConstraints;

        body = new JPanel();
        Header = new JPanel();
        LOGO = new JLabel();
        Username = new JLabel();
        jLabel1 = new JLabel();
        Menu = new JPanel();
        Home1 = new JButton();
        Messages = new JButton();
        Users = new JButton();
        Projects = new JButton();
        Requests = new JButton();
        Agenda = new JButton();
        Contenu = new JPanel();
        barContenu = new JPanel();
        h1Bar = new JLabel();
        recherche = new JTextField();
        rechercheButton = new JButton();
        jScrollPane1 = new JScrollPane();
        UserTable = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jScrollPane1.setForeground(new Color(102,0,204));
        body.setBackground(new Color(255, 255, 255));
        body.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, new Color(153,0,204)));
        body.setLayout(new BorderLayout());

        Header.setBackground(new Color(153, 0, 204));
        Header.setLayout(new GridBagLayout());

        LOGO.setFont(new Font("Montserrat Black", 3, 24));
        LOGO.setForeground(new Color(255, 255, 255));
        LOGO.setText("P4P");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(0, 65, 0, 0);
        Header.add(LOGO, gridBagConstraints);

        Username.setFont(new Font("Segoe UI", 1, 14)); 
        Username.setForeground(new Color(255, 255, 255));
        Username.setHorizontalAlignment(SwingConstants.CENTER);
        Username.setText(username + "-adm");
        Username.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Username.setHorizontalTextPosition(SwingConstants.CENTER);
        Username.setIconTextGap(1);
        Username.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                UsernameMouseClicked(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(0, 6, 0, 51);
        Header.add(Username, gridBagConstraints);

        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setIcon(new ImageIcon(getClass().getResource("assets/icons8-user-30.png"))); 
        jLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(0, 625, 0, 0);
        Header.add(jLabel1, gridBagConstraints);

        body.add(Header, BorderLayout.NORTH);

        Menu.setBackground(new Color(255, 255, 255));
        Menu.setBorder(BorderFactory.createLineBorder(new Color(153, 0, 204)));
        Menu.setPreferredSize(new Dimension(180, 427));
        Menu.setLayout(new GridLayout(9, 0));

        Home1.setBackground(new Color(153, 0, 204));
        Home1.setFont(new Font("Segoe UI", 1, 14));
        Home1.setForeground(new Color(255, 255, 255));
        Home1.setText("Home");
        Home1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
        Home1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Home1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Home1ActionPerformed(evt);
            }
        });
        Menu.add(Home1);

        Users.setFont(new Font("Segoe UI", 1, 14)); 
        Users.setForeground(new Color(153, 0, 204));
        Users.setText("Users");
        Users.setBackground(Color.white);
        Users.setBorder(BorderFactory.createLineBorder(new Color(153, 0, 204)));
        Users.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Users.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UsersActionPerformed(evt);
            }
        });
        Menu.add(Users);

        Projects.setFont(new Font("Segoe UI", 1, 14)); 
        Projects.setForeground(new Color(153, 0, 204));
        Projects.setText("Projects");
        Projects.setBackground(Color.white);
        Projects.setBorder(BorderFactory.createLineBorder(new Color(153, 0, 204)));
        Projects.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Projects.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ProjectsActionPerformed(evt);
            }
        });
        Menu.add(Projects);

        Requests.setFont(new Font("Segoe UI", 1, 14));
        Requests.setForeground(new Color(153, 0, 204));
        Requests.setText("Requests");
        Requests.setBackground(Color.white);
        Requests.setBorder(BorderFactory.createLineBorder(new Color(153, 0, 204)));
        Requests.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Requests.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                RequestsActionPerformed(evt);
            }
        });
        Menu.add(Requests);

        Agenda.setFont(new Font("Segoe UI", 1, 14));
        Agenda.setForeground(new Color(153, 0, 204));
        Agenda.setText("Agenda");
        Agenda.setBackground(Color.white);
        Agenda.setBorder(BorderFactory.createLineBorder(new Color(153, 0, 204)));
        Agenda.setCursor(new Cursor(Cursor.HAND_CURSOR));
        /*Agenda.addActionListener(new event.ActionListener() {
            public void actionPerformed(event.ActionEvent evt) {
                AgendaActionPerformed(evt);
            }
        });*/
        Menu.add(Agenda);

        body.add(Menu, BorderLayout.WEST);

        Contenu.setBackground(new Color(255, 255, 255));
        
        Contenu.setLayout(new GridBagLayout());

        barContenu.setBackground(new Color(102, 0, 204));
        barContenu.setLayout(new GridBagLayout());

        h1Bar.setFont(new Font("Segoe UI", 1, 24)); 
        h1Bar.setForeground(new Color(255, 255, 255));
        h1Bar.setText("Users list");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(20, 30, 30, 0);
        barContenu.add(h1Bar, gridBagConstraints);

        recherche.setHorizontalAlignment(JTextField.LEFT);
        recherche.setBorder(null);
        
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 136;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(30, 337, 30, 0);
        barContenu.add(recherche, gridBagConstraints);

        rechercheButton.setBackground(new Color(153, 204, 0));
        rechercheButton.setFont(new Font("Segoe UI", 1, 12)); 
        rechercheButton.setForeground(new Color(255, 255, 255));
        rechercheButton.setText("Rechrecher");
        rechercheButton.setBorder(null);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(30, 0, 30, 20);
        barContenu.add(rechercheButton, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -10;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 50, 0, 10);
        Contenu.add(barContenu, gridBagConstraints);

        UserTable.setAutoCreateRowSorter(true);
        UserTable.setFont(new Font("Segoe UI", 1, 12));

        
        String[] columnNames = {"Username", "Email", "Full name" , "Last Login date"};

        Object[][] data = {
            {"abdel_sawadogo","abdel@example.com", "abdel sawadogo", "2024-05-22 02:30:38"}
        };
        ArrayList<Object[]> users = getUsers();
        
        
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
        	public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for(Object[] o : users) {
        	model.addRow(o);
        }
        
        rechercheButton.addActionListener(e -> updateTableWithSearch());

        Home1.addActionListener(e -> refreshUserTable());
        
        UserTable.setModel(model);
        UserTable.setGridColor(Color.LIGHT_GRAY);
        UserTable.setRowHeight(40);
        UserTable.setSelectionBackground(new Color(153, 204, 0));
        UserTable.setSelectionForeground(new Color(255, 255, 255));
        UserTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(UserTable);
        UserTable.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 734;
        gridBagConstraints.ipady = 320;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new Insets(20, 20, 0, 15);
        Contenu.add(jScrollPane1, gridBagConstraints);

        body.add(Contenu, BorderLayout.CENTER);

        getContentPane().add(body, BorderLayout.CENTER);

        pack();
    
}
    private void UsernameMouseClicked(MouseEvent evt) {
    	Profile pl= new Profile(username);
    	pl.setSize(1050, 650);
    	pl.setVisible(true);
    	this.setVisible(false);
        
    }

    private void Home1ActionPerformed(ActionEvent evt) {
    	HomePageAdmin pl= new HomePageAdmin(username);
    	pl.setSize(1050, 650);
    	pl.setVisible(true);
    	this.setVisible(false);
        
    }


    private void UsersActionPerformed(ActionEvent evt) {
    	UsersPage usp= new UsersPage(username);
    	usp.setSize(1050, 650);
    	usp.setVisible(true);
    	this.setVisible(false);
    }

    private void ProjectsActionPerformed(ActionEvent evt) {
    	
    	ProjectsList pl= new ProjectsList(username);
    	pl.setSize(1050, 650);
    	pl.setVisible(true);
    	this.setVisible(false);
    }

    private void RequestsActionPerformed(ActionEvent evt) {
        
    	
    	Requests rq= new Requests(username);
    	rq.setSize(1000, 600);
    	rq.setVisible(true);
    	this.setVisible(false);
    }

    private void AgendaActionPerformed(ActionEvent evt) {
        
    }
    public ArrayList<Object[]> getUsers() {
    	String query = "SELECT username,email,nom,prenom,derniere_date_connexion FROM utilisateur";
    	ArrayList<Object[]> users = new ArrayList<>();
    	try {
    		Statement s = conn.createStatement();
    		ResultSet rs = s.executeQuery(query);
    		while(rs.next()) {
    			Object[] row = {rs.getString("username"),rs.getString("email"),rs.getString("nom")+" "+rs.getString("prenom"),rs.getString("derniere_date_connexion")};
    			users.add(row);
    		}
    		return users;
    	}catch(SQLException s) {
    		System.out.println(s.getMessage());
    	}
    	return null;
    }
    
    
    private void updateTableWithSearch() {
        String searchQuery = recherche.getText().trim();
        ArrayList<Object[]> users = getUsers(searchQuery);
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.setRowCount(0);
        for (Object[] user : users) {
            model.addRow(user);
        }
        recherche.setText("");
    }

    private void refreshUserTable() {
        ArrayList<Object[]> users = getUsers(""); 
        DefaultTableModel model = (DefaultTableModel) UserTable.getModel();
        model.setRowCount(0);
        for (Object[] user : users) {
            model.addRow(user);
        }
    }


    public ArrayList<Object[]> getUsers(String usernameSearch) {
        String query = "SELECT username, email, nom, prenom, derniere_date_connexion FROM utilisateur WHERE username LIKE ?";
        ArrayList<Object[]> users = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, "%" + usernameSearch + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] row = {
                    rs.getString("username"),
                    rs.getString("email"),
                    rs.getString("nom") + " " + rs.getString("prenom"),
                    rs.getString("derniere_date_connexion")
                };
                users.add(row);
            }
            return users;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error accessing database: " + e.getMessage(),
                                          "Database Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    
    public static void main(String args[]) {
		UsersPage Usrpg = new UsersPage("oubeza_idir-adm");
        Usrpg.setVisible(true);
        Usrpg.setSize(1050, 650);
    }
    

                      
    private JButton Agenda;
    private JPanel Contenu;
    private JPanel Header;
    private JButton Home1;
    private JLabel LOGO;
    private JPanel Menu;
    private JButton Messages;
    private JButton Projects;
    private JButton Requests;
    private JTable UserTable;
    private JLabel Username;
    private JButton Users;
    private JPanel barContenu;
    private JPanel body;
    private JLabel h1Bar;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JTextField recherche;
    private JButton rechercheButton;
                     

}

