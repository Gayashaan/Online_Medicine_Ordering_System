package projectpackage1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	
	private static String url = "jdbc:mysql://localhost:3306/javaproj2y1s";
	private static String user = "root";
	private static String pass = "1230";
	
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, pass);
				
		}catch(Exception e) {
			System.out.println("Database connection fault");
		}
		
		return con;
	}
	
}

