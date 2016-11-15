package com.synergyteam.ddns.DatabaseHandlerSubsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class DatabaseHandler {

	/* 
	This method accepts a String array which contains a valid SQL Select statement for the ACCESS database 
	system at index 0 of the array. A valid table name that exists within the ACCESS system is located at 
	index 1 of the array. Subsequent indices contain valid information required by the PreparedStatement 
	(in sequential order) to successfully SELECT the tuple from the ACCESS system databases. The method 
	\result String array contains at least one non null element from the resultSet and the query used to 
	retrieve the information, if no resultSet found \result[0] == “No results found && \result[1] == query[0]”. 
	*/
	//@ Pre:  
	//@ requires(query[0] == valid ACCESS system database SQL 
	//@ SELECT statement) && (query[1] == valid table name in 
	//@ ACCESS database system);

	//@ Post: 
	//@ ensures \result (!SQLException) && (resultSet[0] != NULL) ? 
	//@ (\result[0] == resultSet[0], ..., \result[n] == 
	//@ resultSet[n-1] && \result[n] == query[0]) : \result[0] == “No //@ results found” && \result[1] == query[0];
	abstract protected String[] retrieveDatavaseInfo(String[] query);
	
	/* Method used to initialize connection */
	abstract protected Connection intializeConnection() throws ClassNotFoundException, SQLException;
	
	/* Method used to create SQL prepared statements */
	abstract protected PreparedStatement prepStmt(String[] query) throws SQLException ;
	
	protected String ip;
	protected String user;
	protected String pass;
	
	protected int port;
	protected Connection conn;
	protected PreparedStatement stmt;
	
	
}
