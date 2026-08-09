package com.sreenu.jdbc.logging;

import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		DebitAndCredit makePayment = new DebitAndCredit();
		makePayment.doFundTransfer();
	}

}
