package com.synergyteam.ddns;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

public class BannerHandler extends DatabaseHandler {

	@Override
	protected String[] retrieveDatavaseInfo(String[] query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Connection intializeConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected PreparedStatement prepStmt(String[] query) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	public BannerHandler(){
		//TODO fill in variable initialization
	}
	static private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static private final String DB_NAME = "/pestrada2";
	
	static private final String USER = ""; 				// USERNAME:
	static private final String PASS = ""; 				// Password: 
	static private final String PORT = ""; 				//PORT: 
	
	private Calendar calendar;
	private Connection conn;
	private PreparedStatement p_stmt;
	private ResultSet rs;
	private Statement stmt;
	private String[] result;
	
	static private final String IP_ADDR = "jdbc:mysql://synergyteam.ddns.net:" + PORT + DB_NAME +  "?autoReconnect=true&useSSL=false";
}
