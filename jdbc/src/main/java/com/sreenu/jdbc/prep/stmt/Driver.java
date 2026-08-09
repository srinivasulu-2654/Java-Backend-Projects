package com.sreenu.jdbc.prep.stmt;

import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		JDBCPrepStmt res = new JDBCPrepStmt();
		res.doJDBCOperation();

	}

}
