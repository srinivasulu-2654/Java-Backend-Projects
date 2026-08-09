package com.sreenu.jdbc.prep.stmt;

public class DBDetails {
	
	public static final String url = "jdbc:mysql://localhost:3306/5th_jan_2026_batch";
	public static final String username = "root";
	public static final String password = "Root@123";
	public static final String query = "select * from bankverification where id=?";
	public static final String query_by_status = "select * from bankverification where status in (?,?)";
	
	public static final String GET_BALANCE = "select balance from amount where user_id=?";
	public static final String UPDATE_BALANCE = "update amount set balance=? where user_id=?";
}
