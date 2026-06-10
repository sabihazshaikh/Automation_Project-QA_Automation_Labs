package POM_Pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helper.BasePage;

public class LoginPage_POM extends BasePage{
	private Logger log=LogManager.getLogger(LoginPage_POM.class);
	public LoginPage_POM(WebDriver driver) {
		super(driver);
	}

	//Locators Repository
	@FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")
	private WebElement usernameInput;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")
	private WebElement passwordInput;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	//Action Repository 
	public void enterUsername(String user) {
		//usernameInput.clear();
		usernameInput.sendKeys(user);
		log.info("Entered Username: {}", user);
	}
	
	public void enterPassword(String pass) {
		passwordInput.clear();
		passwordInput.sendKeys(pass);
		log.info("Entered Password");
	}
	
	public void clickLogin() {
		loginButton.click();
		log.info("Clicked Login Button");
	}
	
	public void login(String user, String pass) {
		enterUsername(user);
		enterPassword(pass);
		clickLogin();
	}
}
