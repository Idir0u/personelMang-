package metier;

import java.sql.*;
import java.util.Vector;

public class Utilisateur {
	int idUser;
	String username;
	String passwd;
	String email;
	String name;
	String prenom;
	public Utilisateur(int idUser, String username, String passwd, String email, String name, String prenom) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.passwd = passwd;
		this.email = email;
		this.name = name;
		this.prenom = prenom;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void affiche() {
		System.out.println(idUser +" \t "+ username +" \t " + " \t " + email + " \t " + name + " \t " + prenom);
	}
        Connection conn = Utilitaire.getConnection();
        public Vector<Utilisateur> displayUsers() {
            Vector<Utilisateur> vetu = new Vector<Utilisateur>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM USERS");
			while (rs.next()) {
				//(int idUser, String username, String passwd, String email, String name, String prenom)
                            vetu.add(new Utilisateur(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
			} 
		} catch (Exception e) {
			System.out.println("Exception : "+ e);
		}
		return vetu;
	}

}
