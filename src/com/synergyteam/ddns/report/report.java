package reports;

public class report {
	
	boolean generateProjectReport(int fileFormat){
	    boolean retVal = true;
		if(fileFormat<0 || fileFormat>1)
	    	retVal = false; 
	    if (permissionToAccessTofileHandler_createFile()==true){
	    	
	    }
		return retVal; 
	  }
	
	
	boolean generateProjectReport(int startDate, int endDate, int fileFormat){
		boolean retVal = true;
		if(fileFormat < 0 || fileFormat > 1)
			retVal = false;
		if (startDate > endDate)
			retVal = false;
		if (permissionToAccessTofileHandler_createFile() == true)
			if(fileFormat ==0)
				retVal = true; // createPDF_File();
			else 
				retVal = true; // createXLSX_File(); 
			
		return retVal;
	}

	  boolean generateInitiativeReport(int fileFormat){
		 boolean retVal = true;
		 int initiativeID = 0; 
		 if(fileFormat < 0  || fileFormat > 1)
			 return false; 
		 if(permissionToAccessTofileHandler_createFile() == true){ 
			 if (validateResourceRequest(initiativeID) == true){
				if(fileFormat ==0)
					retVal = true; // createPDF_File();
				else 
					retVal = true; // createXLSX_File(); 
			 }
		 }
		 return retVal; 
	  }

	  boolean generateInitiativeReport(int startDate, int endDate, int fileFormat){
		  boolean retVal = true;
			 int initiativeID = 0; 
			 if(fileFormat < 0  || fileFormat > 1)
				 retVal= false; 
			 if (startDate > endDate)
				 retVal = false; 
			 if(permissionToAccessTofileHandler_createFile() == true){ 
				 if (validateResourceRequest(initiativeID) == true){
					if(fileFormat ==0)
						retVal = true; // createPDF_File();
					else 
						retVal = true; // createXLSX_File(); 
				 }
			 }
			 return retVal; 
	  }


	  boolean generateActivityReport(int fileFormat){
		 boolean retVal = true;
		 int initiativeID = 0; 
		 if(fileFormat < 0  || fileFormat > 1)
			 return false; 
		 if(permissionToAccessTofileHandler_createFile() == true){ 
			 if (validateResourceRequest(initiativeID) == true){
				if(fileFormat ==0)
					retVal = true; // createPDF_File();
				else 
					retVal = true; // createXLSX_File(); 
			 }
		 }
		 return retVal; 
	  }

	  boolean generateActivityReport(int startDate, int endDate, int fileFormat){
		  return false;
	  }
	  
	  
	  /*driver and stubs start after this section of the 
	  	the code 
	  */
	  boolean permissionToAccessTofileHandler_createFile(){ //this method should verify the user permitions 
			return true;
	  }
	  
	 boolean validateResourceRequest(int resourceId){ // resource id requested by the user 
		 if (resourceId>1 && resourceId< 2147483647)
			 return true;
		 else 
			 return false; 
	 }
	  
	  
}
