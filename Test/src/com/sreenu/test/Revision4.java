package com.sreenu.test;


class DBConnection {
	
	String dbName,user,password;
	
	public DBConnection() {
		this("mysql","root","root@123");
	}
	
	public DBConnection(String dbName,String user, String passWord) {
		this.dbName = dbName;
		this.user = user;
		this.password = passWord;
		connect();
	}
	
	public void connect() {
		System.out.println("Connecting to DB: " + dbName + " as " + user);
	}
}

public class Revision4 {
	
	public static void main(String[] args) {
		
		DBConnection db1 = new DBConnection();
		DBConnection db2 = new DBConnection("testdb","admin","admin@123");
		
		System.out.println(db1);
		System.out.println(db2);
	}
}
