package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	
	
	public static Connection connect() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://100.116.103.64:1524/tier2", "omar", "amrou2009@");
			System.out.println("Connection successful");
		}
		catch (SQLException e) {
			System.out.println(e);
		}
		
		return con;
	}


}
