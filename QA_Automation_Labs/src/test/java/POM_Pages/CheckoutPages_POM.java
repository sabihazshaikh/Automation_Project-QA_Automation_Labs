package POM_Pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import helper.BasePage;

public class CheckoutPages_POM extends BasePage{
	public WebDriver wd;
	private Logger log=LogManager.getLogger(CheckoutPages_POM.class);
	public CheckoutPages_POM(WebDriver wd) 
	{
		super(wd);
	}
	
	//Locators Repository
	@FindBy(id = "firstname")WebElement txt_firstName;
	@FindBy(id = "middlename")WebElement txt_middleName;
	@FindBy(id = "lastname")WebElement txt_lastName;
	@FindBy(id = "email")WebElement txt_email;
	@FindBy(id = "phone")WebElement txt_mobile;
	@FindBy(id = "address")WebElement txt_address;
	@FindBy(id = "states")WebElement txt_state;
	@FindBy(id = "city")WebElement txt_city;
	@FindBy(id = "pincode")WebElement txt_pinCode;
	@FindBy(id = "continue")WebElement btn_continue;
	@FindBy(xpath = "/html/body/form/div/div/div[2]/div[1]/div/a")WebElement btn_placeorder;
	@FindBy(xpath = "/html/body/div[4]/form/div/div/div/a")WebElement btn_shopagain;
	
	
	//Actions Repository
	public void enterDetails(String fname, String mname, String lname, String email, String mobile, String add, String state,String city, String zip)
	{
		txt_firstName.sendKeys(fname);
		txt_middleName.sendKeys(mname);
		txt_lastName.sendKeys(lname);
		txt_email.sendKeys(email);
		txt_mobile.sendKeys(mobile);
		txt_address.sendKeys(add);
		txt_state.sendKeys(state);
		txt_city.sendKeys(city);
		txt_pinCode.sendKeys(zip);
		log.info("Shipping address details entered");
	}
	public void clickContinue()
	{
		btn_continue.click();
		log.info("Continue button Clicked");
		System.out.println("Continue");
	}
	public void clickPlaceOrder()
	{
		btn_placeorder.click();
		System.out.println("place order");
		log.info("Place Order button Clicked");
	}
	public void clickonShopAgain()
	{
		btn_shopagain.click();
		log.info("Navigated to home page");
	}
}
