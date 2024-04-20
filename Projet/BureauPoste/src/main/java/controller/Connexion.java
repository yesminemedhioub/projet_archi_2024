package controller;
import java.sql.*;
public class Connexion {
	public static Connection connect() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://100.116.103.64:1524/tier2", "omar", "amrou2009@");
			System.out.println("connected");
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