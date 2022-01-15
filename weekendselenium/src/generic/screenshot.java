package generic;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class screenshot {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		String photos="./photos";
		Date d1=new Date();
		String date=d.toString();
		String replace=date.replaceAll(":", "-");
		TakesScreenshot tss=(TakesScreenshot) d;
		FileScreenshot fss=getScreenshotAs(OutputType.FILE);
		File dst=new File(photos+replace+".jpeg");
		
		
	}

}
