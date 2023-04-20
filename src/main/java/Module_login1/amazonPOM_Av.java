package Module_login1;






import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class amazonPOM_Av {
	
	 @FindBy(xpath="//div[@class='nav-line-1-container']")   private WebElement Account;
     
     public amazonPOM_Av(WebDriver driver)
     {
  	   PageFactory.initElements(driver, this);
     }
     
     public void Click()
     {
    	try
    	{
    		Account.click();
    	}
    	catch(Throwable e) 
    	{
    		e.printStackTrace();	
    	}
    	/*catch(NoSuchElementException exception)
    	{
    		System.out.println("page is not available");;
    	}*/
    	 
    		 
    	 
   
    	 
    	 
    		
   
     }

}
