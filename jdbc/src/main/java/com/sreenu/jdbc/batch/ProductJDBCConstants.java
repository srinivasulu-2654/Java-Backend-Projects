package com.sreenu.jdbc.batch;

public class ProductJDBCConstants {
	
	public static String INSERT_QUERY = "insert into products(product_name,price,status) values(?,?,?)";
	public static int BATCH_SIZE = 5000;
	
}
