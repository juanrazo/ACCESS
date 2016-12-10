package com.synergyteam.ddns.InformationManagerSubsystem;

public abstract class Personal{
	
	/* 
This method accepts a valid IDs (student ID and/or faculty IDs) and returns personal information pertaining to the specified individuals 
//@ Pre:
//@ requires IDs exists in Digital Measures Database or Banner Database
//@ Post: 
//@ ensures \result is first name and last name for each individual.
*/
public String[] getPersonalInformation(int[] IDs);

/* 
This method accepts a valid ID (student DI and/or faculty ID) and returns personal information pertaining to the specified individual 
//@ Pre:
//@ requires ID exists in Digital Measures Database or Banner Database 
//@ Post:
//@ ensures \result is first name and last name for the individual.
*/
public String[] getPersonalInformationbyID(int ID);




}