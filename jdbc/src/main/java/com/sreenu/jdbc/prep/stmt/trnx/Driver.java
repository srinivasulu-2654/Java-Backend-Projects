package com.sreenu.jdbc.prep.stmt.trnx;

import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DebitAndCredit makePayment = new DebitAndCredit();
		makePayment.doFundTransfer();
	}

}
