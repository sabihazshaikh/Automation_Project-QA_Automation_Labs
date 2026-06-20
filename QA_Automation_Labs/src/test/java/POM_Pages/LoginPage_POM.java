package POM_Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.BasePage;

public class LoginPage_POM extends BasePage
{
	private Logger log=LogManager.getLogger(LoginPage_POM.class);
	public LoginPage_POM(WebDriver driver) {
		super(driver);
	}

	//Locators Repository
	@FindBy(id = "email")
	private WebElement emailInput;
	
	@FindBy(id = "password")
	private WebElement passwordInput;
	
	@FindBy(id="loginBtn")
	private WebElement loginButton;
	@FindBy(id = "logoutBtn")WebElement lgout;
	
	
	//Action Repository 
	public void enteremail(String email) {
		//usernameInput.clear();
		emailInput.sendKeys(email);
		log.info("Entered Email: {}", email);
	}
	
	public void enterPassword(String pass) {
		//passwordInput.clear();
		passwordInput.sendKeys(pass);
		log.info("Entered Password");
	}
	
	public void clickLogin() {
		loginButton.click();
		log.info("Clicked Login Button");
	}
	
	public void login(String email, String pass) {
		enteremail(email);
		enterPassword(pass);
		clickLogin();
	}
	public void click_on_logout()
	{
		lgout.click();
		log.info("Navigated to login page");
	}
	public void logout_process() throws InterruptedException
	{
		Thread.sleep(2000);
		click_on_logout();
		log.info("User Sucessfully Logged Out");
	}
}
