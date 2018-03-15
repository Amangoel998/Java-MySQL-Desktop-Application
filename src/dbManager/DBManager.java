package dbManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	public static Connection getDBConnection() throws SQLException,ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:5556/electricitybilldb","root","Am@n1998");
		return con;
	}
	public static void main(String args[]){
		Connection con=null;
		try {
			con=DBManager.getDBConnection();
		} catch (ClassNotFoundException | SQLException e) {
			
		}
		if(con!=null)System.out.println("Hello");
	}
}
