
public class ArchiveManager {
	private String filename;
	private String fileType;
	private String userName; 

/**/
public boolean permissionToGetFileMetaData (String filename, String fileType){
//if you are the owner of the file and file exists
	return true;
}

/**/
public boolean permissionToGetArchivePResource(String filename){
	return true;
}

/**/
public boolean permissionToGetArchiveIResource(String  filename){
	return true;
}
/**/
public boolean permissionToGetArchiveAResource(String filename){
	return true;
}

/*Is the requested file in the system*/
boolean fileExists(){
	return true;
}

/*Need to be owner of a project or initiative
 *  to perform any CRUD operations 
 * on the  file of that type*/
boolean isOwner(){
	return true;
}
}
