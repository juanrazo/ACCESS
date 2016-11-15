package com.synergyteam.ddns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

public class AccessHandler extends DatabaseHandler {
	/* 
	This method accepts a String array which contains a valid SQL insert statement at index 0 of the 
	array.  The table name is located at index 1 of the array. Subsequent indices contain valid 
	information required by the PreparedStatement (in sequential order) to successfully insert the 
	tuple into the ACCESS Database. The method \result 1 \iff SQLException is caught && execute update 
	indicates a successful insertion, or 0 otherwise. 
	*/
	//@ Pre:  
	//@ requires (insertStmt[0] == valid ACCESS database SQL 
	//@ INSERT statement) && (insertStmt[1] == valid table name 
	//@ in ACCESS database);
	 
	//@ Post: 
	//@ensures \result (!SQLException && executeUpdate== 1)? 1 : 0);
	 

	protected int insertIntoAccessDB(String[] insertQuery){
		// TODO Auto-generated method stub
		return 0;
		
	}
	
	@Override
	protected String[] retrieveDatavaseInfo(String[] query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Connection intializeConnection() throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected PreparedStatement prepStmt(String[] query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public AccessHandler(){
		
	}
	static private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static private final String DB_NAME = "/pestrada2";
	
	static private final String USER = "ACCESSTest"; 	// USERNAME: ACCESSTest
	static private final String PASS = "accesstest123"; // Password: accesstest123
	static private final String PORT = "3306"; 			//PORT: 
	
	private Calendar calendar;
	private Connection conn;
	private PreparedStatement p_stmt;
	private ResultSet rs;
	private Statement stmt;
	private String[] result;
	
	static private final String IP_ADDR = "jdbc:mysql://synergyteam.ddns.net:" + PORT + DB_NAME +  "?autoReconnect=true&useSSL=false";

}
