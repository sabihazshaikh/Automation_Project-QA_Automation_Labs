package POM_Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.BasePage;

public class CartPage_POM extends BasePage{
	private Logger log=LogManager.getLogger(CartPage_POM.class);
	public CartPage_POM(WebDriver wd) 
	{
		super(wd);
	}
	
	//Locators Repository
	@FindBy(id = "/html/body/div[4]/div/div[2]/table/tbody/tr/td[5]/button")WebElement remove_btn;
	@FindBy(id = "checkoutBtn")WebElement checkout_btn;
	@FindBy(id = "/html/body/div[3]/div/div[2]/a")WebElement goback_btn;
	
	
	//Actions Repository
		public void click_on_remove_btn()
		{
			remove_btn.click();
			log.info("Product removed from cart");
		}
		public void click_on_checkout_btn()
		{
			checkout_btn.click();
			log.info("Navigate to checkout 2nd page");
		}
		public void click_on_goback_btn()
		{
			goback_btn.click();
			log.info("Navigate to Home Page");
		}

}
