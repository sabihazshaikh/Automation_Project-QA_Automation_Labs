package POM_Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.BasePage;

public class ProductPage_POM extends BasePage
{
	private Logger log=LogManager.getLogger(HomePage_POM.class);
	public ProductPage_POM(WebDriver wd) 
	{
		super(wd);
	}
	
	//Locators Repository
	@FindBy(xpath = "//*[@id=\"product-list\"]/div[1]/div/div[2]/button")WebElement addcart;
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/a/i")WebElement cart;
	
	
	//Actions Repository
	public void click_on_add_to_cart_button()
	{
		addcart.click();
		log.info("Product added to cart");
	}
	public void click_on_cart_icon()
	{
		cart.click();
		log.info("Navigating to cart page");
	}
}
