package metier;

import java.sql.*;

public class Utilitaire {
	private static Connection conn;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3307/projectmanagement";
			conn = DriverManager.getConnection(url, "IDIR", "");
			System.out.println("vous avez bien connécté avec la base de donnée Demo!!");
			}catch(Exception e) {
			System.out.println("Erreur lors du charggement de Driver:" + e);
		}
	}
	public static Connection getConnection()
	{
		return conn;
	}
}

