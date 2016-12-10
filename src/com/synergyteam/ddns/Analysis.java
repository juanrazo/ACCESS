//performs analysis calculation 

public class Analysis {

private String type;
private String[] fCheckList;
private String[] rCheckList;

//Different ways to call Analysis
Analysis(String t){
	this.type = t;
}

Analysis(String t, String[] f, String[] r){
	this.type = t;
	this.fCheckList = f;
	this.rCheckList = r;
}


//ACTIVITY HELPER METHODS 

//requests a XLSX file to be created
public String createXLSX_File(Analysis []calculations){
	String filename;

	return filename;
}

//Number of activities related to initiative
boolean containsActivities(String[] activityList){
	if(activityList.length < 0) return false;
	return true;
}

//copies array a elements into array b.
public String[] copyArray(String []a){
	String[] b = new String [a.length];
	
	for(int i =0; i < a.length; i++) b[i] = a[i];
	
	return b;
}

//GATHERING ACTIVITES METHODS 

//returns a list of activities associated under initiative category
public String[] getAssociatedActivities(){
	String[] activityList, foundActivities;
	
	//gets list of Activities from Resource Subsystem
	if(containsActivities( viewActivities(iniativeName) ) ) activityList = copyArray(foundActivities);
	
	return activityList;
}

//returns a list of activities associated under initiative category , and filtered items 
public String[] getAssociatedFilteredActivities(){
	//gets list of Activities from Resource Subsystem
		if(containsActivities( viewActivities(fCheckList ) ) ) activityList = copyArray(foundActivities);
		
		return activityList;
}

//returns a list of activities associated under initiative category
public String[] getAssociatedRestrictionActivities(){
	if(containsActivities( viewActivities(rCheckList ) ) ) activityList = copyArray(foundActivities);
	
	return activityList;
}

//returns a list of activities associated under initiative category
public String[] getAssociatedF&RActivities(){
	if(containsActivities( viewActivities(fCheckList, rCheckList ) ) ) activityList = copyArray(foundActivities);
	return activityList;
}

returns a list of activities associated under initiative category
private String[] list(String []queryResults);
private int[] compare(String[] queryResults, int r1, int r2);
int[] percentage(String[] queryResults);
}