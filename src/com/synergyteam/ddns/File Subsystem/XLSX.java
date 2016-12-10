import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class XLSX extends FileType {
	

	
protected void createXLSX(){}
//Create Blank workbook
XSSFWorkbook workbook = new XSSFWorkbook(); 
//Create a blank spreadsheet
XSSFSheet spreadsheet = workbook.createSheet("Sheet Name");
}

public XLSX createXLSX_File( Analysis[] fileInformation);
public XLSX readXLSX_File(String fileName);
public XLSX editXLSX_File(String fileName);
public XLSX deleteXLSX_File(String );