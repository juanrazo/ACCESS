package com.synergyteam.ddns.DatabaseHandlerSubsystem;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.ArrayList;

public class AccessHandler extends DatabaseHandler {

    /*
    * Method used to insert NonFundedProjects into the ACCESS database.
    * PRE:
    * @requires a valid ACCESS SQL Insert Statment that is not NULL.
    * @ensures \result (!SQLException && execute == 1) 1: 0;
    */
	protected int insertIntoAccessDB(String query){

		try {

			this.conn = initializeConnection();
			this.stmt = this.conn.createStatement();
			this.stmt.execute(query);

		} catch (ClassNotFoundException | SQLException e ) {

			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;

		} finally {

			try{

				this.p_stmt = null;
				if(this.conn != null) this.conn.close();
				System.out.println("Closed connection");


			}catch(SQLException se1){

				se1.printStackTrace();
				return 0;
			}
		}

		return 1;

	}
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

	protected String[] retrieveSingleNonFundedProjectInfo(String query) {


		ArrayList<String> results = new ArrayList<String>();
		try {
			this.conn = initializeConnection();
			System.out.println("Started Connection");
			this.stmt = this.conn.createStatement();
			this.rs = stmt.executeQuery(query);
			while (this.rs.next()) {
				processResultSet(results);

			}
			for (String i : results) {
				System.out.println(i);
			}
			closeSqlVariables();

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();

		}
		if (results.isEmpty()) {
			String[] noResult = {"No results found", "-1"};
			return noResult;
		} else
			return results.toArray(new String[results.size()]);
	}

	protected String[][] retrieveMultNonFundedProjectInfo(String query) {

		ArrayList<String> results = new ArrayList<String>();
		ArrayList<String[]> topList = new ArrayList<String[]>();
		int i = 0;
		try {

			this.conn = initializeConnection();
			System.out.println("Started Connection");
			this.stmt = this.conn.createStatement();
			this.rs = stmt.executeQuery(query);
			while (this.rs.next()) {

				processResultSet(results);
				topList.add(results.toArray(new String[results.size()]));
				results.clear();

				i++;

			}

			closeSqlVariables();

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}

		if(!topList.isEmpty()){
			String[][] returnResults = topList.toArray(new String[i][7]);
			return returnResults;
		} else {
			String[][] returnResults = {{"No Results Found", "-1"}};
			return returnResults;
		}
	}

	private void processResultSet(ArrayList<String> results) throws SQLException {
		System.out.println(this.rs);
		results.add("" + rs.getInt("PID"));
		results.add("" + rs.getInt("FundedProject"));
		results.add("" + rs.getString("Title"));
		results.add("" + rs.getString("Description"));
		results.add("" + rs.getDate("StartDate").toString());
		results.add("" + rs.getDate("EndDate").toString());
		results.add("" + rs.getString("Goal"));
	}




	@Override
	protected String[] retrieveDatabaseInfo(String[] query) {
		try{
			this.conn = initializeConnection();
			System.out.println("Started Connection");

			this.p_stmt = prepStmt(query, this.conn);

			this.rs = this.p_stmt.executeQuery();
			while(rs.next()){
				System.out.println(rs);
			}
			this.p_stmt.close();
			this.conn.close();
			System.out.println("Closed Connection");


		} catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	public AccessHandler(){ // constructor variable declaration
		this.conn = null;
		this.ip = IP_ADDR + PORT + DB_NAME + SETTINGS;
		this.user = USER;
		this.pass = PASS;
		this.stmt = null;
		this.rs = null;
		this.p_stmt = null;
		this.calendar = null;
	}

	private Calendar calendar;

	static private final String DB_NAME = "/ACCESS";
	static private final String IP_ADDR = "jdbc:mysql://synergyteam.ddns.net:" ;
	static private final String PASS = "accesstest123"; // Password: accesstest123
	static private final String PORT = "3306"; 			//PORT:
	static private final String SETTINGS = "?autoReconnect=true&useSSL=false";
	static private final String USER = "ACCESSTest"; 	// USERNAME: ACCESSTest

}
