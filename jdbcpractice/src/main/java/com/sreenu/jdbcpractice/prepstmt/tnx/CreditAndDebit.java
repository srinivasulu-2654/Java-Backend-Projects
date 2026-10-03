package com.sreenu.jdbcpractice.prepstmt.tnx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sreenu.jdbcpractice.prepstmt.DBDetails;

public class CreditAndDebit {
	
	public void doTransaction() throws SQLException {
		
		Connection con = DriverManager.getConnection(DBDetails.url,DBDetails.username,DBDetails.password);
		
		try {
		
		PreparedStatement p1 = con.prepareStatement(DBDetails.executeQuery);
		
		int moneyToTransfer = 2000;
		int senderBalance = 0;
		p1.setInt(1, 12345);
		ResultSet rs1 = p1.executeQuery();
		while(rs1.next()) {
			System.out.println("getting inside the loop....");
			senderBalance = rs1.getInt(1);
		}
		
		System.out.println("Sender balance is : " + senderBalance);
		
		
		con.setAutoCommit(false);
		
		PreparedStatement p2 = con.prepareStatement(DBDetails.UPDATE_BALANCE);
		int updatedBalance = senderBalance - moneyToTransfer;
		p2.setInt(1, updatedBalance);
		p2.setInt(2, 12345);
		
		int rowsUpdated = p2.executeUpdate();
		System.out.println("Updatedrows are: " + rowsUpdated);
		
		PreparedStatement p3 = con.prepareStatement(DBDetails.executeQuery);
		int receiverMoney = 0;
		p3.setInt(1, 56789);
		ResultSet rs2 = p3.executeQuery();
		while(rs2.next()) {
			System.out.println("Getting into the loop....");
			receiverMoney = rs2.getInt(1);
		}
		
		System.out.println("Receiver money is: " + receiverMoney);
		
		PreparedStatement p4 = con.prepareStatement(DBDetails.UPDATE_BALANCE);
		
		int updatedReceiverBalance = receiverMoney + moneyToTransfer;
		
		p4.setInt(1, updatedReceiverBalance);
		p4.setInt(2, 9999);
		
		int updatedRows = p4.executeUpdate();
		System.out.println("UpdatedBalance is: " + updatedRows);
		
		if(updatedRows != 1) {
			throw new SQLException("Receiver account not found");
		}
		
		con.commit();
		
		} catch (Exception e) {
			con.rollback();
			e.printStackTrace();
		}
	}
}
