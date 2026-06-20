package POM_Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.BasePage;

public class HomePage_POM extends BasePage
{
	private Logger log=LogManager.getLogger(HomePage_POM.class);
	public HomePage_POM(WebDriver wd) 
	{
		super(wd);
	}
	
	//Locators Repository
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/a")WebElement section;

	
	//Actions Repository
	public void click_on_section()
	{
		section.click();
		log.info("Clicked on Section");
	}
}
