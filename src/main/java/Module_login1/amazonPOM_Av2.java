package Module_login1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonPOM_Av2 {
	
	 @FindBy(xpath="//input[@id='ap_password']") WebElement pass;
	 @FindBy(xpath="//input[@type='submit']") WebElement btn;
	 
	 public amazonPOM_Av2(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	
	public void Passw(String PSW)
	{
		pass.sendKeys(PSW);
	}
	
	public void SPas()
	{
		btn.click();
	}

}
