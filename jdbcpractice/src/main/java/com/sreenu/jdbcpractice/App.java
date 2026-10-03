package com.sreenu.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
       // 1. load the driver class
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	// 2. Create the connection
    	
    	String url = "jdbc:mysql://localhost:3306/5th_jan_2026_batch";
    	String username = "root";
    	String password = "Root@123";
    	
    	Connection con = DriverManager.getConnection(url,username,password);
    	
    	// 3. create the statement object
    	
    	Statement stmt = con.createStatement();
    	
    	//4 . execute query
    	
    	ResultSet rs =  stmt.executeQuery("select * from bankverification");
    	
    	while(rs.next()) {
    		
    		int id = rs.getInt(1);
    		String name = rs.getString(2);
    		String branch = rs.getString(3);
    		String status = rs.getString(4);
    		
    		System.out.println(" id: " + id + " name: " + name + " branch: " + branch + " status: " + status);
    	}
    }
}
