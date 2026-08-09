package com.sreenu.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        // 1. Loading the JDBC driver -- Optional
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	
    	// 2. create Connection Object
    	
    	String url = "jdbc:mysql://localhost:3306/5th_jan_2026_batch";
    	String username = "root";
    	String password = "Root@123";
    	
    	Connection con = DriverManager.getConnection(url,username,password);
    	
    	// 3. Create statement object
    	
    	Statement stmt = con.createStatement();
    	
    	// 4. Execute Query
    	
    	ResultSet rs = stmt.executeQuery("select * from bankverification"); // fetch data from the bankverification
    	
    	while(rs.next()) {
    		int id = rs.getInt(1);
    		String name = rs.getString(2);
    		String branch = rs.getString(3);
    		String status = rs.getString(4);
    		
    		System.out.println(" id: " + id + " " + " name: " + name +  " " + " branch: " + branch + " status: " + status);
    	}
    }
}
