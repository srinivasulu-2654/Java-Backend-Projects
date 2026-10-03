package com.sreenu.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1.load class driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Create the connection object
		
		String url = "jdbc:mysql://localhost:3306/5th_jan_2026_batch";
		String username = "root";
		String password = "Root@123";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		// 3. create statement object
		
		Statement stmt = con.createStatement();
		
		String query = "update bankverification set status='Pending' where id=5";
		
		int recordUpdated = stmt.executeUpdate(query);
		
		System.out.println("Updated records are : " + recordUpdated);
	}
}