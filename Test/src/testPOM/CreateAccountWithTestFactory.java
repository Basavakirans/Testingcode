package testPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageFactory.CreateAccountPage;
import pageFactory.CreateAccountSuccessPage;
import pageFactory.LoginPage;

public class CreateAccountWithTestFactory {
	 WebDriver driver;
	 CreateAccountPage createAccountPage;
	 CreateAccountSuccessPage createAccountSuccessPage;
	 @BeforeTest
	    public void setup(){
		 	System.setProperty("webdriver.chrome.driver","C:\\Users\\TEST\\Downloads\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.get("https://app.openmailbox.org/login");

	    }
	 @Test(priority = 0)
	 	public void register() throws InterruptedException{
		 //selectinng create account option
		 driver.findElement(By.xpath("//button[@data-go='register']")).click();;
		 createAccountPage = new CreateAccountPage(driver);
		 
		//Enter username, password and confirm password
		 Thread.sleep(10000);
		 createAccountPage.setUserName("TestAutomation");
		 createAccountPage.setPassword("TestAutomation");
		 
		 //Select language
		 createAccountPage.selectLanguage();
		 
		 // clicking on Create My account button
		 createAccountPage.clickOnRegister();
		 
		 // This test failed to create account as e have challenge here
		 //This website has captcha validation/not robot validation
		 //since the intention behind this feature is to block automation or robot actions
		 //And we have opened browser in automation tool hence it is failing if we does manually selecting the images
		 //its keep asking new images and to select but worked fine if open a browser manually
		 
		 //Here is the code to validate sucecss message
		 	createAccountSuccessPage = new CreateAccountSuccessPage(driver);
		 //verifying for success page
		 	createAccountSuccessPage.validateSuccessMessage("Scuccessfully created");
		
	 }
	 @Test(priority = 1)
	 public void loginAndVerify(){
		 LoginPage loginPage = new LoginPage(driver);
		 loginPage.setUserName("TestAutomation");
		 loginPage.setPassword("TestAutomation");
		 loginPage.clickOnLogin();
		 
		 //code has not been written as environment is not working and hence mentionng steps
		 //using class LoggedInPage validate search outputs
	 }


}
