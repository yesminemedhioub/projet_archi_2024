package controller;
import java.sql.*;
public class Connexion {
	public static Connection connect() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:1524/tier2", "root", "amrou2009");
		}
		catch (SQLException e) {
			System.out.println(e);
		}
		
		return con;
	}


	public static void main(String[] args) {
		Connexion con = new Connexion();
		Connection connect = con.connect();
		
		
	}
	
}