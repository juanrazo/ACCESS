/*Contain the necessary information to create a file */
public class FileType {

	
protected File createFile(String[] fileInformation, String FileFormatType);

public XLSX createXLSX_File( Analysis[] fileInformation);
public XLSX readXLSX_File(String fileName);
public XLSX editXLSX_File(String fileName);
public XLSX deleteXLSX_File(String );
public PDF createPDF_File();
public PDF readPDF_File();
public PDF editPDF_File();
public PDF deletePDF_File();
}
