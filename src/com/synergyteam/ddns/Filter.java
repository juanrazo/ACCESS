/*Filter class provides Analysis the necessary IDs to execute an analysis */

public class Filter{	

//Filter fields
protected String[] classification = {"Freshman", "Sophomore", "Junior", "Senior", "Master", "Ph.D.", "All"};
protected String[] major_field = {"Stem", "Science", "Engineering", "Liberal Arts", "Health Science", "Business", "Pharmacy", "Nursing"};
protected String[] department = {"Civil Engineering", "Computer Science","Computer Engineering", "Mechanical Engineering"};
protected String[] category = {"Learning Communities, Development Workshops, Mentoring, Student Employment, Student Leadership,"
		+ "First Year Experience, Undergraduate Research & Createive Activity, Internshiop & Practicum, Study Abroad, "
		+ "Community Engagement & Service Learning, Capstone Experience"};



//Methods to find field ids	
protected int getCategoryId(String categoryTitle){return findId(categoryTitle, category);}
	
protected int getClassificationId(String classificationTitle){return findId(classificationTitle, classification);}
	
protected int getMajorId(String majorTitle){return findId(majorTitle , major_field);}
	
protected int getDepartmentId( String departmentTitle){return findId(departmentTitle, department);}

protected boolean getGraduateStatus(int studentId){ if(studentId < 4 ) return false;  else return true;}

protected int  findId(String x , String[] y){
	int id = -1;
	for(int i=0;  i< y.length; i++)	if(x.equals(y[i])) id = i;
	return id;
}

}
