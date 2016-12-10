
public class ArchiveManager {


/*Need to be owner of a project or initiative
*in order to perform any CRUD operations 
* on the  file of that type*/
private boolean isOwner(String fileName, String fileType, String userName){
	//Searches for files data
	Metadata data = new Metadata(fileName, fileType);
	if(userName.equals(data.owner)) return true;
	return false;
}

/*If user has permissions to access metadata*/
public boolean permissionToGetFileMetaData (String fileName,String filetype, String userName){
	if(isOwner(fileName, filetype, userName)) return true;
	return false;
}

/*If user has permission to access metadata*/
public boolean permissionToGetArchiveResource(String fileName, String fileType, String userName){
	if(isOwner(fileName, fileType, userName)) return true;
	return false;
}



}
