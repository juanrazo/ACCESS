package com.synergyteam.ddns.InformationManagerSubsystem;

public class Faculty extends Personal {

/* 
This method accepts a faculty ID and returns all the personal information pertaining to the specified faculty member 
//@ Pre:
//@ requires facultyID exists in Digital Measures Database 
//@ Post:
//@ ensures \result is a list containing Faculty information such as a valid Faculty email address, the Department to which the faculty 
//@ member belongs to, the Administrative Assignment to which the faculty member is entitled to.
*/
protected String[] getFacultybyID(int facultyID){
	return DatabaseHandlerManager.retrieveDMInformation();
}
 
 /* 
This method accepts a faculty ID a returns the email address belonging to the specified faculty member 
 //@ Pre:
//@ requires facultyID exists in Digital Measures Database 
//@ Post:
//@ ensures \result is a valid Faculty email address.
*/
protected String[] getFacultyEmail(int facultyID){
	return DatabaseHandlerManager.retrieveDMInformation.email();
}
 
/* 
This method accepts a faculty ID a returns the name of the Department to which the faculty member belongs to
//@ Pre:
//@ requires facultyID exists in Digital Measures Database
//@ Post: 
//@ ensures \result is a valid department name to which the faculty member belongs to
*/
protected String[] getFacultyDepartment(int facultyID){
	return DatabaseHandlerManager.retrieveDMInformation.FacultyDepartment();
}
 
/* 
This method accepts a faculty ID a returns the Administrative Assignment of the specified faculty member 
//@ Pre:
//@ requires facultyID exists in Digital Measures Database 
//@ Post:
//@ ensures \result is a valid Administrative Assignment which the faculty member is entitled to.
*/
protected String[] getFacultyAdminAssignment(int facultyID){
	return DatabaseHandlerManager.retrieveDMInformation.AdmiAssignement();
}
	
}
