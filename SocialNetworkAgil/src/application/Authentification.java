package application;
import java.sql.*;
public class Authentification {
	
	private String userName;
	private String userPass;
	
	public Authentification(String name,String pass) {
		userName = name;
		userPass = pass;
		connecte();
	}
	
	private void connecte() {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8080/basechat", "root", "root");
			System.out.println(connection.getAutoCommit());		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
