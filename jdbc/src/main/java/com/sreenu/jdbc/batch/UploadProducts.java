package com.sreenu.jdbc.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sreenu.jdbc.prep.stmt.DBDetails;

public class UploadProducts {
	
	public void products() throws ClassNotFoundException, SQLException {
		
		// load the dirvers
		
		Class.forName("com.mysql.cj.jdbc.Driver");	
		
		Connection con = DriverManager.getConnection(DBDetails.url,DBDetails.username,DBDetails.password);
		
		PreparedStatement preStmt = con.prepareStatement(ProductJDBCConstants.INSERT_QUERY);
		
		long start = System.currentTimeMillis();
		for(int i=0;i<10500;i++) {
			
			preStmt.setString(1, "iphone" + i);
			preStmt.setInt(2, 120000 + i);
			preStmt.setString(3, "Available");
			System.out.println("UploadProducts.upload()...executing " + i + " times");
			preStmt.addBatch();
			
			if(i % ProductJDBCConstants.BATCH_SIZE == 0) {
				System.out.println("Executing batch of 1000 products...");
				preStmt.executeBatch();
			}
		}
		
		// remaining will execute here
		preStmt.executeBatch();
		long end = System.currentTimeMillis();
				
		System.out.println(" Total time taken " + (end - start + " ms "));
		
	}
}
