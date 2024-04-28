package metier;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;




public class SignUp extends JFrame { 
    Connection conn = Utilitaire.getConnection();
    public SignUp() {
        java.awt.GridBagConstraints gridBagConstraints;

        JPanel Right = new JPanel();
        JLabel jLabel1 = new JLabel();
        JLabel Fullname = new JLabel();
        JTextField UsernameField = new JTextField();
        JLabel Username = new JLabel();
        JTextField FullnameField = new JTextField();
        JLabel Email = new JLabel();
        JTextField EmailField = new JTextField();
        JLabel Password = new JLabel();
        JPasswordField ConfirmPasswordField = new JPasswordField();
        JLabel ConfirmPassword = new JLabel();
        JPasswordField PasswordField = new JPasswordField();
        JButton SignInButton = new JButton();
        JLabel jLabel2 = new JLabel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();
        JPanel Left = new JPanel();
        JLabel Image = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        Right.setBackground(new java.awt.Color(153, 0, 204));
        Right.setForeground(new java.awt.Color(255, 255, 255));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));
        Right.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); 
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Sign Up");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 43, 0, 0);
        Right.add(jLabel1, gridBagConstraints);

        Fullname.setFont(new java.awt.Font("Roboto Light", 1, 14)); 
        Fullname.setForeground(new java.awt.Color(255, 255, 255));
        Fullname.setText("Full name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 30, 0, 0);
        Right.add(Fullname, gridBagConstraints);

        UsernameField.setBackground(new java.awt.Color(153, 0, 204));
        UsernameField.setForeground(new java.awt.Color(255, 255, 255));
        UsernameField.setBorder(null);
        UsernameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 216;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        Right.add(UsernameField, gridBagConstraints);

        Username.setFont(new java.awt.Font("Roboto Light", 1, 14)); 
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        Right.add(Username, gridBagConstraints);

        FullnameField.setBackground(new java.awt.Color(153, 0, 204));
        FullnameField.setForeground(new java.awt.Color(255, 255, 255));
        FullnameField.setBorder(null);
        FullnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullnameFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 216;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 30, 0, 0);
        Right.add(FullnameField, gridBagConstraints);
        
        Email.setFont(new java.awt.Font("Roboto Light", 1, 14)); 
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        Right.add(Email, gridBagConstraints);

        EmailField.setBackground(new java.awt.Color(153, 0, 204));
        EmailField.setForeground(new java.awt.Color(255, 255, 255));
        EmailField.setBorder(null);
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFIeldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 216;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 30, 0, 0);
        Right.add(EmailField, gridBagConstraints);

        Password.setFont(new java.awt.Font("Roboto Light", 1, 14)); 
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 0, 0);
        Right.add(Password, gridBagConstraints);

        ConfirmPasswordField.setBackground(new java.awt.Color(153, 0, 204));
        ConfirmPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        ConfirmPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPasswordField.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 216;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 30, 0, 0);
        Right.add(ConfirmPasswordField, gridBagConstraints);

        ConfirmPassword.setFont(new java.awt.Font("Roboto Light", 1, 14)); 
        ConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPassword.setText("Confirm Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 0, 0);
        Right.add(ConfirmPassword, gridBagConstraints);
//PasswordFieLd
        PasswordField.setBackground(new java.awt.Color(153, 0, 204));
        PasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); 
        PasswordField.setForeground(new java.awt.Color(255, 255, 255));
        PasswordField.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 216;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 30, 0, 0);
        Right.add(PasswordField, gridBagConstraints);

        SignInButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); 
        SignInButton.setForeground(new java.awt.Color(153, 0, 204));
        SignInButton.setText("SIGN UP");
        SignInButton.setPreferredSize(new java.awt.Dimension(300, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 218;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 50, 20, 40);
        Right.add(SignInButton, gridBagConstraints);
        //----------------------
        
        SignInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the text from jTextField3
                //UsernameField FullnameField Email UsernameFIeld PasswordField ConfirmPasswordField
                String fullname = FullnameField.getText();
                String username = UsernameField.getText();
                String email = EmailField.getText();
                char[] passwordChars = PasswordField.getPassword();
                String password = new String(passwordChars);
                char[] passwordcfChars = ConfirmPasswordField.getPassword();
                String confirmPassword = new String(passwordcfChars);
                
                
                if(username.equals("") || password.equals("") || confirmPassword.equals("") || fullname.equals("") || email.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter all of your information !!", "Missing Information", JOptionPane.ERROR_MESSAGE);
                }else{
                    if(!password.equals(confirmPassword)){
                        JOptionPane.showMessageDialog(null, "Please enter the same password !!", "Invalid Information", JOptionPane.ERROR_MESSAGE);
                    }else{
                        SigningUp(username, password, email, fullname);
                    } 
                }
                popUpHomePage();
            }
        });
        
        //----------------------

        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 12)); 
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("_______________________________________________________");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 30, 0, 0);
        Right.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe Script", 0, 12)); 
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("_______________________________________________________");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 30, 0, 0);
        Right.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe Script", 0, 12)); 
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("_______________________________________________________");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 30, 0, 0);
        Right.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe Script", 0, 12)); 
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("_______________________________________________________");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 0, 0);
        Right.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe Script", 0, 12)); 
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("_______________________________________________________");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 30, 0, 0);
        Right.add(jLabel6, gridBagConstraints);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setLayout(new java.awt.GridBagLayout());

        Image.setIcon(new ImageIcon(getClass().getResource("assets/6333204 (1).jpg"))); 
        Image.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -39;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 36, 160, 42);
        Left.add(Image, gridBagConstraints);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Right, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Left, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(Right, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE)
            .addComponent(Left, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }                       

    private void SigningUp(String username, String passwd, String email, String fullname){
        // signing up after collecting information
        ajouterUser(username,passwd,email,fullname);
    }
    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void FullnameFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void UsernameFIeldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }  
    public void popUpHomePage(){
                HomePage su = new HomePage();
                this.setVisible(false);
                su.setVisible(true);
                su.setLocationRelativeTo(null);
    }
    public void ajouterUser(String username, String passwd, String email, String fullname) {
	    try {
	        PreparedStatement ps = conn.prepareStatement("INSERT INTO USERS (username, passwd, email, name) VALUES (?, ?, ?, ?)");
	        ps.setString(1, username);
	        ps.setString(2, passwd);
	        ps.setString(3, email);
	        ps.setString(4, fullname);
	        
	        
	        ps.executeUpdate();
	        System.out.println("User added successfully!");
	        
	    } catch (Exception e) {
	        System.out.println("Exception : " + e);
	    }
    }
                 
}
