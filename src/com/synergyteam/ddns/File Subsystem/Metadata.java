public class Metadata {

String fileType;
String title;
String owner;
String category;
String startDate;
String endDate;
String description;
String []goals;
String []objectives;
String []envolvedStudents;
String []envolvedFaculty;
String []fileInformation;

Metadata(String name, String type){
	fileType = type;
	title = name;
}

//copies array a elements into array b.
public String[] copyArray(String []a){
	String[] b = new String [a.length];
	
	for(int i =0; i < a.length; i++) b[i] = a[i];
	
	return b;
}

//getters
String getStartDate(){return startDate;}

String getEndDate(){return endDate;}

String getDescription(){return description;}

String[] getGoals(){return goals;}

String[] getObjectives(){return objectives;}

//setters
void setOwner(String o){this.owner = o;}
void setStartDate(String s){this.startDate = s;}

void setEndDate(String e){this.endDate = e;}

void setDescription(String d){this.description = d;}

void setGoals(String []g){ this.goals = copyArray(g);}

void setObjectives(String[]o){this.objectives = copyArray(o);}


}