package Library_File.Avantika_maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Module_login1.amazonPOM_Av;
import Module_login1.amazonPOM_Av1;
import Module_login1.amazonPOM_Av2;
import Module_login1.amazonPOM_Av3;

public class TestClass_Av extends baseClass_Av{
	
	amazonPOM_Av  Login1;
	amazonPOM_Av1  Login2;
	amazonPOM_Av2  Login3;
	amazonPOM_Av3 Verify;
	int ScNum;
	@BeforeClass
	public void openAmazon() throws InterruptedException 
	{
		
		openBroswer();
		

		Login1=new amazonPOM_Av (driver);
		
		Login2=new amazonPOM_Av1(driver);
		Login3=new amazonPOM_Av2(driver);
		Verify=new amazonPOM_Av3(driver);
		
		Thread.sleep(3000);
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		Login1.Click();
		Login2.SignIn(utilityClass_Av.getdatafromPF("UN"));
		Login2.ctnbtn();
		Login3.Passw(utilityClass_Av.getdatafromPF("PSW"));
		Login3.SPas();
		Thread.sleep(3000);
	}
	
	@Test
	public void verifyUserName() throws IOException, InterruptedException

	{
		ScNum=2;
		Thread.sleep(3000);
		String ActId=Verify.verifyId("ActualID" );
		String ExpectedId=utilityClass_Av.UserId(0,2);
		Assert.assertEquals(ActId, ExpectedId);
		
		Thread.sleep(3000);
	}
	
	@Test
	public void Button() throws InterruptedException
	{
		Thread.sleep(3000);
		ScNum=3;
		Verify.allButton();
		Thread.sleep(3000);

	}
	
	@AfterMethod
	public void LogOut(ITestResult Result) throws IOException
	{
		
		
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			utilityClass_Av.ScreenShot(driver,ScNum);
		}
	    Verify.logOut(driver);
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
	

}
