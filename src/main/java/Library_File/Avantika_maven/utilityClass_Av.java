package Library_File.Avantika_maven;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class utilityClass_Av {
	//fetch data from Property file/exel file
	//Iframe code
	//Screenshot cod
	
	
	@Test
	public static String getdatafromPF(String key) throws IOException
	{
	FileInputStream file= new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\Avantika_maven\\PropertyFiles.properties");	
	
	Properties prop=new Properties();
	prop.load(file);
	 String V1=prop.getProperty(key);
	return V1;
	
	}
	
	@Test
	public static String UserId(int rowIndex, int clmIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream File=new FileInputStream("C:\\Users\\Hp\\eclipse-workspace\\Avantika_maven\\Testdata\\With_DDF_av.xlsx");
		Sheet sh=WorkbookFactory.create(File).getSheet("Sheet1");
		String index=sh.getRow(rowIndex).getCell(clmIndex).getStringCellValue();
		return index;
		
		
		
	}
	@Test
	public static void ScreenShot(WebDriver driver,int ScNum) throws IOException
	{
		File Sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File S1=new File("C:\\Users\\Hp\\eclipse-workspace\\Avantika_maven\\Screenshot\\"+ScNum+".jpg");
		FileHandler.copy(Sc, S1);
	}
	                                 
	                                 

}
