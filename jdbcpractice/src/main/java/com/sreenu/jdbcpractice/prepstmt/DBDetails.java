package com.sreenu.jdbcpractice.prepstmt;

public class DBDetails {
	
	public static final String url = "jdbc:mysql://localhost:3306/5th_jan_2026_batch";
	public static final String username = "root";
	public static final String password = "Root@123";
	
	public static final String query = "select * from bankverification where id=?";
	public static final String query1 = "select * from bankverification where id in (?,?)";
	public static final String query_by_status = "select * from bankverification where status in (?,?)";
	
	public static final String updateQuery = "update bankverification set status=? where id=?";
	
	public static final String executeQuery = "select balance from amount where user_id=?";
	public static final String UPDATE_BALANCE = "update amount set balance=? where user_id=?";
}
