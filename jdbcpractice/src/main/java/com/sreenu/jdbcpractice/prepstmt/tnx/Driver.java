package com.sreenu.jdbcpractice.prepstmt.tnx;

import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		CreditAndDebit obj = new CreditAndDebit();
		obj.doTransaction();
	}

}
