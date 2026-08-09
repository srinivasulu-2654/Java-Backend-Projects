package com.sreenu.jdbc.prep.stmt.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPreparedStmt {
	
	public void doOpearions() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(DBDetails.url,DBDetails.username,DBDetails.password);
		
	  PreparedStatement preStmt = con.prepareStatement(DBDetails.query);
	  
	  preStmt.setInt(1, 103);
	  
	  ResultSet rs = preStmt.executeQuery();
	  
	  while(rs.next()) {
		  int track_id = rs.getInt(1);
		  int ride_id = rs.getInt(2);
		  String driver_name = rs.getString(3);
		  String current_location = rs.getString(4);
		  int estimation_time = rs.getInt(5);
		  
		  System.out.println("track_id: " + track_id + " ride_id: " + ride_id + " driver_name: " + 
				  driver_name + " current_location: " + current_location + " estimation_time: " + estimation_time);
	  }
	  
	}
}
