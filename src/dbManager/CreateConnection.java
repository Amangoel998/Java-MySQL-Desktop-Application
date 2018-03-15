package dbManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection implements Runnable{
	private static Connection con=null;
	public CreateConnection(String user,String pass){
		try{con=DriverManager.getConnection("jdbc:mysql://localhost/electricitybilldb?user=root&amp;password=Am@n1998");}
		catch(SQLException e){System.out.println("SQLException");return;}
	}
	public void run(){
		
	}
	public static void main(String[] args){
		
	}
}
