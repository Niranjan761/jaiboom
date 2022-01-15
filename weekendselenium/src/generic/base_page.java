package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base_page {
	
	public WebDriver d;
	public base_page(WebDriver d){
		PageFactory.initElements(d, this);
	}

}
