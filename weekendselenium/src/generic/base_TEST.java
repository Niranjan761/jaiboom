package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_TEST implements Framework_constants {
	public WebDriver d;
	@BeforeMethod 
	public void openapp()
	{
		System.setProperty(gecko_key, gecko_value);
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.get(base_url);
		}
	@AfterMethod
	public void closeapp()
	{
		d.quit();
	}

}
