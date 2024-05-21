package metier;

public class Info {
	private int iduser;
	private String nom_long;
	private String description;
	private String date;
	private int idprojetAboutPage;
	private String nom_court;
	private String username;
	private String mode_navigation;
	private boolean isPublic;
	public Info(int iduser, String nom_long, String description, String date, int idprojetAboutPage, String nom_court,String username, String mode, boolean isPublic) {
		super();
		this.iduser = iduser;
		this.nom_long = nom_long;
		this.description = description;
		this.date = date;
		this.idprojetAboutPage = idprojetAboutPage;
		this.nom_court = nom_court;
		this.username = username;
		this.mode_navigation = mode;
		this.isPublic = isPublic;
	}
	
	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public String getMode_navigation() {
		return mode_navigation;
	}
	public void setMode_navigation(String mode_navigation) {
		this.mode_navigation = mode_navigation;
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getNom_long() {
		return nom_long;
	}
	public void setNom_long(String nom_long) {
		this.nom_long = nom_long;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getIdprojetAboutPage() {
		return idprojetAboutPage;
	}
	public void setIdprojetAboutPage(int idprojetAboutPage) {
		this.idprojetAboutPage = idprojetAboutPage;
	}
	public String getNom_court() {
		return nom_court;
	}
	public void setNom_court(String nom_court) {
		this.nom_court = nom_court;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	

}
