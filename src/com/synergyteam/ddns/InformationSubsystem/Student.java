package com.synergyteam.ddns.InformationManagerSubsystem;

public class Student extends Personal {
}

	 /*
 This method accepts a student ID and returns all the personal   
 information belonging to the specified studentID
 //@ Pre:
 //@ requires studentID exists in Banner Database
 //@ Post:
 //@ ensures \result is student’s gender, a valid date of    birth 
 //@ student’s citizenship, student’s race, student’s major,  
 //@ student’s classification, valid student enrollment date, valid   
 //@ student graduation date, valid student drop out date, student’s 
 //@  cumulative GPA, student’s major GPA, student’scompleted courses.
  */
public String[] getStudentInformationByID(int studentID){
	return DatabaseHandlerManager.retrievDMInformation();
}
   
 /*
 This method accepts a student ID and returns demographic information 
 Belonging to the specified studentID.
 //@ Pre:
 //@ requires studentID exists in Banner Database
 //@ Post: 
 //@ ensures \result is student’s gender, a valid date of birth,  
 //@ student’s citizenship, student’s race 
 */
public String[] getStudentDemographicsByID(int studentID){
	return DatabaseHandlerManager.retrievDMInformation();
}
 
 /*
 This method accepts a student ID and returns academic information
 Belonging to the specified studentID.
 //@ Pre:
 //@ requires studentIDs exists in Banner Database
 //@ Post:
 //@ ensures \result is student’s major, student’s classification, valid 
 //@ student enrollment date, valid student graduation date, valid  
 //@ student drop out date, student’s cumulative GPA, student’s major 
 //@ GPA, student’s complete courses.
 */
public String[] getStudentAcademicsByID(int studentID){
	return DatabaseHandlerManager.retrievDMInformation();
}
 
 
 /*
 This method accepts a student ID and returns all the personal    
 information belonging to the specified studentID.
 //@ Pre:
 //@ requires studentIDs exists in Banner Database
 //@ Post:
 //@ ensures \result is, for each student, his/her gender, valid date of  
 //@ birth, citizenship, race, major, classification, valid student  
 //@ enrollment date, valid graduation date, valid drop out date
 //@ cumulative GPA, major GPA, completed courses.
 */
public String[] getStudentsInformation(int[] studentIDs){
	return DatabaseHandlerManager.retrievDMInformation();
}
 
 /*
 This method accepts multiple student ID and returns demographic   
 information belonging to the specified studentIDs
 //@ Pre:
 //@ requires studentIDs exists in Banner Database
 //@ Post:
 //@ ensures \result is for each student, his/her gender, valid date of birth, citizenship, race
 */
public String[] getStudentsDemographics(int[] studentIDs){
	return DatabaseHandlerManager.retrievDMInformation();
}
  
 /*
 This method accepts multiple student IDs and returns academic  
 information belonging 
 to the specified studentIDs
 //@ Pre:
 //@ requires studentIDs exists in Banner Database
 //@ Post:
 //@ ensures \result is, for each student, his/her major, classification,  
 //@ valid enrollment date, valid graduation dates, valid drop out dates,  
 //@ cumulative GPA, major GPA, completed courses.
 */
public String[] getStudentsAcademics(int[] studentIDs){
	return DatabaseHandlerManager.retrievDMInformation();
}

}
