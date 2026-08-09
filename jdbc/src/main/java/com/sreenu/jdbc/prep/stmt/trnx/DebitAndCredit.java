package com.sreenu.jdbc.prep.stmt.trnx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sreenu.jdbc.prep.stmt.DBDetails;

public class DebitAndCredit {
	
	public void doFundTransfer() throws ClassNotFoundException, SQLException {
		
		System.out.println("DebitAndCredit.doFundTransfer().....START");
		
		// load the driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con = DriverManager.getConnection(DBDetails.url,DBDetails.username,DBDetails.password);
		
		
		
		// CREDIT
		
		try {
			int moneyToTransfer = 1000;
			PreparedStatement p1 = con.prepareStatement(DBDetails.GET_BALANCE);
			p1.setInt(1, 12345);
			int senderBalance = 0;
			ResultSet rs1 = p1.executeQuery();
			while (rs1.next()) {
				System.out.println("Getting inside the loop...");
				senderBalance = rs1.getInt(1);
			}
			System.out.println("Sender Balance: " + senderBalance);
			
			// START - the Transaction
			con.setAutoCommit(false);
			
			PreparedStatement p2 = con.prepareStatement(DBDetails.UPDATE_BALANCE);
			senderBalance = senderBalance - moneyToTransfer;
			p2.setInt(1, senderBalance);
			p2.setInt(2, 12345);
			int updatedRecord = p2.executeUpdate();
			System.out.println("Updated Record: " + updatedRecord);
			PreparedStatement p3 = con.prepareStatement(DBDetails.GET_BALANCE);
			p3.setInt(1, 56789);
			int receiverBalance = 0;
			ResultSet rs2 = p3.executeQuery();
			while (rs2.next()) {
				System.out.println("Getting inside the credit loop....");
				receiverBalance = rs2.getInt(1);
			}
			System.out.println("Receiver current Balance is : " + receiverBalance);
			PreparedStatement p4 = con.prepareStatement(DBDetails.UPDATE_BALANCE);
			receiverBalance = receiverBalance + moneyToTransfer;
			p4.setInt(1, receiverBalance);
			p4.setInt(2, 56789);
			int updatedRecordsFinal = p4.executeUpdate();
			System.out.println("Final records: " + updatedRecordsFinal);
			
			con.commit(); // if everything fines it will commit or else will rollback() in exception
		} catch (Exception e) {
			con.rollback();
			e.printStackTrace();
		}
	}

}
