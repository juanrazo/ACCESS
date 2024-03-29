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
	 * PRE:
	 *  @requires query != NULL && query valid SQL query for ACCESS database
	 * POST:
	 *  @ensures \result == (result.exist() && !SQLException)? { int 'PID', tinyint 'fundedProject' == 0 | 1, 'Title',
	 *  'Description', 'startDate'. 'endDate', 'Goal' } : { "Result not found", "-1" };
	 */
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

	/*
     * PRE:
     *  @requires query != NULL && query valid SQL query for ACCESS database
     * POST:
     *  @ensures \result[1...n] == (result.exist() && !SQLException)? { int 'PID', tinyint 'fundedProject' == 0 | 1, 'Title',
     *  'Description', 'startDate'. 'endDate', 'Goal' } : { "Result not found", "-1" };
     */
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

		return getStrings(topList, i);
	}















	protected String[][] retrieveMultProjectMembershipInfo(String query) {

		ArrayList<String> results = new ArrayList<String>();
		ArrayList<String[]> topList = new ArrayList<String[]>();
		int i = 0;
		try {

			this.conn = initializeConnection();
			System.out.println("Started Connection");
			this.stmt = this.conn.createStatement();
			this.rs = stmt.executeQuery(query);
			while (this.rs.next()) {

				processProjectMembershipResultSet(results);
				topList.add(results.toArray(new String[results.size()]));
				results.clear();

				i++;

			}

			closeSqlVariables();

		} catch (SQLException | ClassNotFoundException e) {

			e.printStackTrace();
		}

		return getStrings(topList, i);
	}

	private String[][] getStrings(ArrayList<String[]> topList, int i) {
		if(!topList.isEmpty()){
			String[][] returnResults = topList.toArray(new String[i][7]);
			return returnResults;
		} else {
			String[][] returnResults = {{"No Results Found", "-1"}};
			return returnResults;
		}
	}








	private void processProjectMembershipResultSet(ArrayList<String> results) throws SQLException {
		System.out.println(this.rs);
		results.add("" + rs.getInt("PID"));
		results.add("" + rs.getInt("UID"));
		results.add("" + rs.getString("Role"));
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
