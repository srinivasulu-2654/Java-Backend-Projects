package com.sreenu.jdbc.prep.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPrepStmt {

	public void doJDBCOperation() throws ClassNotFoundException, SQLException {
		
		// register jdbc driver
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Create connection Object
		
		Connection connection = DriverManager.getConnection(DBDetails.url, DBDetails.username,DBDetails.password);
		
		// preparedStatement Object
		
		PreparedStatement preparedStmt =  connection.prepareStatement(DBDetails.query_by_status);
		
//		preparedStmt.setInt(1, 2); // (which placeholder, placeholder value) select * from bankverification where id=?  -> select * from bankverification where id=2
		
		preparedStmt.setString(1, "Verified");
		preparedStmt.setString(2, "Pending");
		
		ResultSet rs = preparedStmt.executeQuery();
		
		System.out.println("Printing the details: ");
		
		while(rs.next())
		{
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String branch = rs.getString(3);
			String status = rs.getString(4);
			
			System.out.println(" id: " + id + " name: " + name + " branch: " + branch + " status: " + status);
		}
		
	}
}
