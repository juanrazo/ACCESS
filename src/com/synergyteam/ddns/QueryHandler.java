package com.synergyteam.ddns;

public class QueryHandler {
	
	/*
	This method accepts a string array. The first element in query (query[0]) 
	array to contain a 0 or 1. A 0 indicates the query generated will be a 
	retrieval, and a 1 will indicate the query generated will be an insert 
	statement. The next element in query (query[1]) will contain a valid SQL 
	table name utilized by one of the databases in the ACCESS system. The 
	subsequent elements will contain required fields (retrieve statement && 
	insert statement. If the query is an insert statement, the values following 
	the field values will contain the values required by each field for an insert 
	statement to execute successfully.
	*/
	//@ Pre:  
	//@ query[0] contains 0 or a 1; if query[0] == 0 generate a 
	//@ retrieve statement. Else, generate an insert statement. 
	//@ query[1] contains a valid table name utilized in the ACCESS 
	//@ system.
	//@ query[2]…query[n] contain fields followed by values required to //@ successfully insert or retrieve information.

	//@ Post: 
	//@ensures \result (result[0] != NULL);
	//@ insert results: 
	//@ \result[0] == “Update successful” if insert was successful, 
	//@ “Unable to update” if insert was unsuccessful; 
	//@ retrieve information results:
	//@ \result[0]…result[n-1] == retrieved information from query; 
	//@ \result[n] == query used to retrieve information;
	
	public String[] generateQuery(String[] query){
		
		return null;
	}
	public QueryHandler(){
		//TODO fill in constructor initialization
	}
	
	/* Pre-defined database retrieval (SELECT) queries */
	private static String[] insertQueries;
	
	/* Pre-defined database insertion (INSERT) queries */
	private static String[] selectQueries;
}
