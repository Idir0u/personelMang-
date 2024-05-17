package metier;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.*;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class UserRequestPage extends JFrame {

        public UserRequestPage() {
        	 java.awt.GridBagConstraints gridBagConstraints;

             body = new JPanel();
             Header = new JPanel();
             LOGO = new JLabel();
             userIcon = new JLabel();
             jLabel1 = new JLabel();
             Menu = new JPanel();
             Home1 = new JButton();
             Messages = new JButton();
             Projects = new JButton();
             Requests = new JButton();
             Agenda = new JButton();
             Invitation = new JButton();
             deconnexion = new JButton();
             DashBord = new JPanel();
             jLabel3 = new JLabel();
             jScrollPane1 = new JScrollPane();
             message_table = new JTable();

             setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

             body.setBackground(new Color(255, 255, 255));
             body.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, new Color(153,0,204)));
             body.setLayout(new BorderLayout());

             Header.setBackground(new Color(153, 0, 204));
             Header.setPreferredSize(new Dimension(963, 50));

             LOGO.setFont(new Font("Montserrat Black", 3, 24)); // NOI18N
             LOGO.setForeground(new Color(255, 255, 255));
             LOGO.setText("P4P");

             userIcon.setHorizontalAlignment(SwingConstants.CENTER);
             userIcon.setHorizontalTextPosition(SwingConstants.CENTER);

             jLabel1.setFont(new Font("Segoe UI Black", 3, 14)); // NOI18N
             jLabel1.setForeground(new Color(255, 255, 255));
             jLabel1.setIcon(new ImageIcon(getClass().getResource("assets/icons8-user-30.png"))); // NOI18N
             jLabel1.setText("Username");

             GroupLayout HeaderLayout = new GroupLayout(Header);
             Header.setLayout(HeaderLayout);
             HeaderLayout.setHorizontalGroup(
                 HeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                 .addGroup(HeaderLayout.createSequentialGroup()
                     .addGap(67, 67, 67)
                     .addComponent(LOGO, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                     .addGap(608, 608, 608)
                     .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                     .addGap(26, 26, 26)
                     .addComponent(userIcon, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                     .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
             );
             HeaderLayout.setVerticalGroup(
                 HeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                 .addGroup(HeaderLayout.createSequentialGroup()
                     .addGroup(HeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addGroup(HeaderLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                             .addComponent(userIcon, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                             .addComponent(LOGO, GroupLayout.Alignment.TRAILING))
                         .addGroup(HeaderLayout.createSequentialGroup()
                             .addContainerGap()
                             .addComponent(jLabel1)))
                     .addContainerGap())
             );

             body.add(Header, BorderLayout.NORTH);

             Menu.setBackground(new Color(255, 255, 255));
             Menu.setBorder(BorderFactory.createLineBorder(new Color(153, 0, 204)));
             Menu.setPreferredSize(new Dimension(180, 427));
             Menu.setLayout(new GridLayout(9, 0));

             Home1.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
             Home1.setForeground(new Color(153, 0, 204));
             Home1.setText("Home");
             Home1.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
             Home1.setCursor(new Cursor(Cursor.HAND_CURSOR));
             Home1.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent evt) {
                     Home1ActionPerformed(evt);
                 }
             });
             Menu.add(Home1);

             Messages.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
             Messages.setForeground(new Color(153, 0, 204));
             Messages.setText("Messages");
             Messages.setBorder(BorderFactory.createLineBorder(new Color(153, 0, 204)));
             Messages.setCursor(new Cursor(Cursor.HAND_CURSOR));
             Messages.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent evt) {
                     MessagesActionPerformed(evt);
                 }
             });
             Menu.add(Messages);

             Projects.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
             Projects.setForeground(new Color(153, 0, 204));
             Projects.setText("Projects");
             Projects.setBorder(BorderFactory.createLineBorder(new Color(153, 0, 204)));
             Projects.setCursor(new Cursor(Cursor.HAND_CURSOR));
             Projects.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent evt) {
                     ProjectsActionPerformed(evt);
                 }
             });
             Menu.add(Projects);

             Requests.setBackground(new Color(153, 0, 204));
             Requests.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
             Requests.setForeground(new Color(255, 255, 255));
             Requests.setText("Requests");
             Requests.setBorder(BorderFactory.createLineBorder(new Color(153, 0, 204)));
             Requests.setCursor(new Cursor(Cursor.HAND_CURSOR));
             Requests.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent evt) {
                     RequestsActionPerformed(evt);
                 }
             });
             Menu.add(Requests);

             Agenda.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
             Agenda.setForeground(new Color(153, 0, 204));
             Agenda.setText("Agenda");
             Agenda.setBorder(BorderFactory.createLineBorder(new Color(153, 0, 204)));
             Agenda.setCursor(new Cursor(Cursor.HAND_CURSOR));
             Agenda.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent evt) {
                     AgendaActionPerformed(evt);
                 }
             });
             Menu.add(Agenda);

             Invitation.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
             Invitation.setForeground(new Color(153, 0, 204));
             Invitation.setText("Invitation");
             Invitation.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153, 0, 204)));
             Menu.add(Invitation);

             deconnexion.setFont(new Font("Segoe UI", 1, 14)); // NOI18N
             deconnexion.setForeground(new Color(153, 0, 204));
             deconnexion.setText("Se_deconnecter");
             deconnexion.setBorder(BorderFactory.createLineBorder(new Color(153, 0, 204)));
             deconnexion.setCursor(new Cursor(Cursor.HAND_CURSOR));
             deconnexion.addActionListener(new ActionListener() {
                 public void actionPerformed(ActionEvent evt) {
                     deconnexionActionPerformed(evt);
                 }
             });
             Menu.add(deconnexion);

             body.add(Menu, BorderLayout.WEST);

             DashBord.setBackground(new Color(255, 255, 255));

             jLabel3.setFont(new Font("Segoe UI Black", 3, 18)); // NOI18N
             jLabel3.setForeground(new Color(153, 0, 204));
             jLabel3.setIcon(new ImageIcon(getClass().getResource("assets/request.png"))); // NOI18N
             jLabel3.setText("REQUEST TABLE");

             jScrollPane1.setBackground(new Color(255, 255, 255));

             message_table.setModel(new DefaultTableModel(
                 new Object [][] {
                     {"Site Builder", "closure", "refused"},
                     {"Online Rent Car", "closure", "accepted"},
                     {"E-com plateforme", "creation", "refused"},
                     {"localolisation app", "creation", "accepted"},
                     {"machine learning app", "creation", "accepted"},
                     
                 },
                 new String [] {
                     "Project name", "Type", "State"
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
             message_table.setColumnSelectionAllowed(true);
             message_table.addMouseListener(new MouseAdapter() {
                 public void mouseClicked(MouseEvent evt) {
                     message_tableMouseClicked(evt);
                 }
                 public void mouseEntered(MouseEvent evt) {
                     message_tableMouseEntered(evt);
                 }
             });
             jScrollPane1.setViewportView(message_table);
             message_table.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

             GroupLayout DashBordLayout = new GroupLayout(DashBord);
             DashBord.setLayout(DashBordLayout);
             DashBordLayout.setHorizontalGroup(
                 DashBordLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                 .addGroup(DashBordLayout.createSequentialGroup()
                     .addGroup(DashBordLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                         .addGroup(DashBordLayout.createSequentialGroup()
                             .addGap(157, 157, 157)
                             .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 389, GroupLayout.PREFERRED_SIZE))
                         .addGroup(DashBordLayout.createSequentialGroup()
                             .addGap(41, 41, 41)
                             .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 658, GroupLayout.PREFERRED_SIZE)))
                     .addContainerGap(72, Short.MAX_VALUE))
             );
             DashBordLayout.setVerticalGroup(
                 DashBordLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                 .addGroup(DashBordLayout.createSequentialGroup()
                     .addGap(31, 31, 31)
                     .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                     .addGap(53, 53, 53)
                     .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
                     .addContainerGap(222, Short.MAX_VALUE))
             );

             body.add(DashBord, BorderLayout.CENTER);

             getContentPane().add(body, BorderLayout.CENTER);

           pack();
    }
                         
    

    private void Home1ActionPerformed(ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void MessagesActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void deconnexionActionPerformed(ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void ProjectsActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void RequestsActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void AgendaActionPerformed(ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void message_tableMouseClicked(MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void message_tableMouseEntered(MouseEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    

                     
    private JButton Agenda;
    private JPanel DashBord;
    private JPanel Header;
    private JButton Home1;
    private JLabel LOGO;
    private JPanel Menu;
    private JButton Messages;
    private JButton Projects;
    private JButton Requests;
    private JPanel body;
    private JButton deconnexion;
    private JButton Invitation;
    private JLabel jLabel1;
    private JLabel jLabel3;
    private JScrollPane jScrollPane1;
    private JTable message_table;
    private JLabel userIcon;
    
    
    public static void main(String args[])
    {
    	UserRequestPage usrreq = new UserRequestPage();
    	usrreq.setVisible(true);
    }
                     
}

