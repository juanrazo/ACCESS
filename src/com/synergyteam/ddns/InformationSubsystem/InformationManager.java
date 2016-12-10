package com.synergyteam.ddns.InformationManagerSubsystem;

import java.util.ArrayList;

public class informationManager{
	
	public informationManager(){
	}
		
	protected String[] getPersonalInfo(String infoType, int[] ID){
		return new Personal();
	}
	
	
	protected String[] getFacultyInfo(String infoType, int[] ID){
		return new Faculty();
	}
	
	
	protected String[] getStudentInfo(String infoType, int[] ID){
		return new Student();
	}
	

}

//public String[] getInformation(String infoType, int[] ID);