package metier;

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

}
