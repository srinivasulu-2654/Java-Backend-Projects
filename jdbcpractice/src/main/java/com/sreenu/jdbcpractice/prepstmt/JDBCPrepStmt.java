package com.sreenu.jdbcpractice.prepstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPrepStmt {
	
	public void doJDBCOperation() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(DBDetails.url,DBDetails.username,DBDetails.password);
		
//		PreparedStatement prepStmt = con.prepareStatement(DBDetails.query1);
		
//		PreparedStatement prepStmt = con.prepareStatement(DBDetails.query_by_status);
		
		PreparedStatement prepStmt = con.prepareStatement(DBDetails.updateQuery);
		
//		prepStmt.setInt(1, 5);
		
//		prepStmt.setString(1, "Verified");
//		prepStmt.setString(2, "Pending");
		
//		prepStmt.setInt(1, 2);
//		prepStmt.setInt(2, 5);
		
		prepStmt.setString(1, "Pending");
		prepStmt.setInt(2, 3);
		
		int updatedQuery = prepStmt.executeUpdate();
		System.out.println("Updated rows are : " + updatedQuery);
		
//		ResultSet rs =  prepStmt.executeQuery();
//		
//		while(rs.next()) {
//			int id = rs.getInt(1);
//			String name = rs.getString(2);
//			String branch = rs.getString(3);
//			String status = rs.getString(4);
//			
//			System.out.println(" id: " + id + " name: " + name + " branch: " + branch + " status: " + status);
//		}
	}
}
