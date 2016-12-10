package com.synergyteam.ddns.DatabaseHandlerSubsystem;

public class DatabaseHandlerManager {

	/*
	TBD
	*/

	//@ Pre:  
	//@ query[0] contains a valid SQL query; The method will determine //@ if it needs to INSERT or SELECT based off of which substring is 
	//@ contained within query[0].
	//@ query[1] contains a valid table name utilized in the ACCESS 
	//@ system.
	//@ query[2]…query[n] contain fields followed by values required to //@ successfully insert or retrieve information.

	//@ Post: 
	//@ensures \result (result[0] != NULL);
	//@ insert results: 
	//@ \result[0] == “Update successful” if insert was successful, 
	//@ “Unable to update” if insert was unsuccessful; 
	//@ retrieve information results:
	//@ 
	//@ \result[0]…result[n-1] == retrieved information from query; 
	//@ \result[n] == query used to retrieve information;


	public DatabaseHandlerManager() {

	}

	protected String[] retrieveSingleNonFundedProjectInfo(String query){
		return new AccessHandler().retrieveSingleNonFundedProjectInfo(query);
	}









	protected String[][] retrieveMultNonFundedProjectInfo(String query){
		return new AccessHandler().retrieveMultNonFundedProjectInfo(query);
	}





































	protected int insertAccessDB(String query){
		return new AccessHandler().insertIntoAccessDB(query);
	}

	protected String[][] retrieveMultProjectMembershipInfo(String query){
		return new AccessHandler().retrieveMultProjectMembershipInfo( query);
	}


}

