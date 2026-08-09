package com.sreenu.jdbc.logging;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sreenu.jdbc.prep.stmt.DBDetails;

/* 
 -> so here the main purpose of "logging" is we can print the lines in logs wise instead of printing in console
 -> so if we write some unnecessary system.out.println lines -> for example -> if these are running 10k transaction/min
 -> then it will be waste of time to run those unnecessary lines right
 -> thus here we are using -> logging
 */

public class DebitAndCredit {
	
	private static final Logger LOGGER = LogManager.getLogger(DebitAndCredit.class);
	
	public void doFundTransfer() throws ClassNotFoundException, SQLException {
		
//		System.out.println("DebitAndCredit.doFundTransfer().....START");
	
		LOGGER.trace("doFundTransfer().....START");
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
				LOGGER.debug("inside the loop");
				senderBalance = rs1.getInt(1);
			}
			LOGGER.info("Sender Balance: " + senderBalance);
			
			// START - the Transaction
			con.setAutoCommit(false);
			
			PreparedStatement p2 = con.prepareStatement(DBDetails.UPDATE_BALANCE);
			senderBalance = senderBalance - moneyToTransfer;
			p2.setInt(1, senderBalance);
			p2.setInt(2, 12345);
			int updatedRecord = p2.executeUpdate();
			LOGGER.info("Updated Record: " + updatedRecord);
			PreparedStatement p3 = con.prepareStatement(DBDetails.GET_BALANCE);
			p3.setInt(1, 56789);
			int receiverBalance = 0;
			ResultSet rs2 = p3.executeQuery();
			while (rs2.next()) {
				LOGGER.debug("Getting inside the credit loop....");
				receiverBalance = rs2.getInt(1);
			}
			LOGGER.info("Receiver current Balance is : " + receiverBalance);
			PreparedStatement p4 = con.prepareStatement(DBDetails.UPDATE_BALANCE);
			receiverBalance = receiverBalance + moneyToTransfer;
			p4.setInt(1, receiverBalance);
			p4.setInt(4, 56789);
			int updatedRecordsFinal = p4.executeUpdate();
			LOGGER.info("Final records: " + updatedRecordsFinal);
			
			con.commit(); // if everything fines it will commit or else will rollback() in exception
		} catch (Exception e) {
			con.rollback();
			e.printStackTrace();
			LOGGER.error(" doing rollback()...", e);
		}
		
		LOGGER.trace("doFundTransfer() ... END");
	}

}
