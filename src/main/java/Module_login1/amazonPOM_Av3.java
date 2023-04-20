package Module_login1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class amazonPOM_Av3 {
	
	@FindBy(xpath="//span[text()='Hello, aniket']")WebElement name;
	@FindBy(xpath="//span[text()='Sign Out']") WebElement logout;
	@FindBy(xpath="(//span[text()='All'])[2]")  WebElement Abtn;
	@FindBy(xpath="//div[@class='nav-sprite hmenu-close-icon']")WebElement cross;
	
	public amazonPOM_Av3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
   public String verifyId(String ActualId)
   {
	String Actual=name.getText();
	String Ar[]=Actual.split(" ");
	ActualId=Ar[1];
	return ActualId;
   }
   
   public void allButton()
   {
	 boolean Result=Abtn.isEnabled();
	 
	 if(Result==true)
	 {
		 Abtn.click();
		 cross.click();
		 
	 }
	 else
	 {
		 Reporter.log("Button is Disable",true);
	 }
	 
   }
   public void logOut(WebDriver driver)
   {
	   WebElement hover=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions Ac=new Actions(driver);
		Ac.moveToElement(hover).build().perform();
		logout.click();
		
   }
   
	
}
