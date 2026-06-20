package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import POM_Pages.CartPage_POM;
import POM_Pages.CheckoutPages_POM;
import POM_Pages.HomePage_POM;
import POM_Pages.LoginPage_POM;
import POM_Pages.ProductPage_POM;
import helper.BaseTest;
import utility_Files.Excel_Utility;

public class QA_Automation_Labs_all_TestCases extends BaseTest{
	 
	@Test(priority=0)
	  public void login_testcase() throws IOException, InterruptedException 
	  {
		 // 1. Login using Excel Data
		  String user=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Login", 1, 0);
		  String pass=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Login", 1, 1);
		  LoginPage_POM l=new LoginPage_POM(wd);
		 // HomePage_POM h=new HomePage_POM(wd);
		  
		  l.login(user, pass);
		  Thread.sleep(2000);
		  l.logout_process();
		  log.info("Login and Logout Successful");
	   }
	  
	  
	 
	@Test(priority=1)
	  public void add_to_cart_testcase() throws IOException, InterruptedException
	  {
		// 2. Add product to the cart
		  String user=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Login", 1, 0);
		  String pass=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Login", 1, 1);
		  LoginPage_POM l=new LoginPage_POM(wd);
		  HomePage_POM h=new HomePage_POM(wd);
		  ProductPage_POM p=new ProductPage_POM(wd);
		  
		  
		  l.login(user, pass);
		  log.info("Login Successfully");
		  Thread.sleep(2000);
		  
		  h.click_on_section();
		  Thread.sleep(2000);

		  p.click_on_add_to_cart_button();
		  Thread.sleep(2000);
		  p.click_on_cart_icon();
		  log.info("Product added and cart opened");
		  
		  l.logout_process();
		  log.info("User logged out");
	  }
	
	
	
	  @Test(priority=2)
	  public void checkout_n_address_testcase() throws IOException, InterruptedException 
	  {
		  // 3. Checkout and Address
		  String user=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Billing", 1, 0);
		  String pass=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Billing", 1, 1); 
		  String fname=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Billing", 1, 2);
		  String mname=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Billing", 1, 3);
		  String lname=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Billing", 1, 4);
		  String email=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Billing", 1, 5);
		  String mobile=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Billing", 1, 6);
		  String add=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Billing", 1, 7);
		  String state=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Billing", 1, 8);
		  String city=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Billing", 1, 9);
		  String zip=Excel_Utility.getCellData(System.getProperty("user.dir")+"\\src\\test\\resources\\QALabsTestData.xlsx", "Billing", 1, 10);
		  
		  LoginPage_POM l=new LoginPage_POM(wd);
		  HomePage_POM h=new HomePage_POM(wd);
		  ProductPage_POM p=new ProductPage_POM(wd);
		  CartPage_POM ct=new CartPage_POM(wd);
		  CheckoutPages_POM ch=new CheckoutPages_POM(wd);
		  
		  l.login(user, pass);
		  log.info("Login Successfully");
		  Thread.sleep(2000);
		  
		  h.click_on_section();
		  log.info("Clicked on Section");
		  Thread.sleep(2000);
		  
	      p.click_on_add_to_cart_button();
	      log.info("Product added to cart");
		  Thread.sleep(2000);
		  
		  p.click_on_cart_icon();
		  log.info("Product added and cart opened");
		  Thread.sleep(2000);
		  
		  ct.click_on_checkout_btn();
		  log.info("Navigates to checkout page for adding address details");
		  Thread.sleep(2000);
		  
		  ch.enterDetails(fname, mname, lname, email, mobile, add, state, city, zip);
		  log.info("Address details entered");
		  Thread.sleep(2000);
		  
		  ch.clickContinue();
		  log.info("Continue button Clicked");
		  Thread.sleep(2000);
		  
		  ch.clickPlaceOrder();
	 	  log.info("Order placed successfully");
		  Thread.sleep(2000);
	 	  
	 	  ch.clickonShopAgain();
	 	  log.info("Navigated to home page");
		  Thread.sleep(2000);

	 	  
//	 	  ch.click_on_back_home();
//		  String successMsg=wd.findElement(By.xpath("/html/body/div[4]/form/div/div/div/h1")).getText();
//		  Assert.assertEquals(successMsg, "🎉 Thank You for Your Order!");
//	 	  log.info("Navigate to home page or product page");
//	 	 Thread.sleep(2000);
	 	 
	 	 l.logout_process();
	 	 log.info("User logged out");
		  Thread.sleep(2000);
	  }
}
