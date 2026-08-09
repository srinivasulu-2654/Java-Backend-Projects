package com.sreenu.jdbc.batch;

import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		UploadProducts uploadProducts = new UploadProducts();
		uploadProducts.products();
	}

}
