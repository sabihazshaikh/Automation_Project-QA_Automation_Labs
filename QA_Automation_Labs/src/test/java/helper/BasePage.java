package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	protected WebDriver wd;
	
	public BasePage(WebDriver wd) {
		this.wd=wd;
		PageFactory.initElements(wd, this);
	}
}
