package Module_login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPOM_Av1 {
	
	@FindBy (xpath="//input[@id='ap_email']") private WebElement UI;
	@FindBy (xpath="//input[@id='continue']") private WebElement ctn;
	
	public amazonPOM_Av1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SignIn(String UN)
	{
		UI.sendKeys(UN);
	}
	
	public void ctnbtn()
	{
		ctn.click();
	}
	                               
	                               

}
