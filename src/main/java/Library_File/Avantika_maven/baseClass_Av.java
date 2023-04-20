package Library_File.Avantika_maven;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class baseClass_Av {
	
	public WebDriver driver;
	
	public void openBroswer()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\eclipse-workspace\\Avantika_maven\\Browser\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");

		
		driver=new ChromeDriver(op);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

}
