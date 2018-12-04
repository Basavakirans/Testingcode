package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
/**
 * 
 * @author TEST - Basava kiran S
 * 
 *
 */
public class CreateAccountPage {
	WebDriver driver ;
	
	@FindBy(id="register_id")
    WebElement username;
	
	@FindBy(id="register_pw")
    WebElement password;
	
	@FindBy(id="register_vpw")
    WebElement confirmPassword;	
	
	@FindBy(id="language_selector")
	WebElement languageSelect;
	
	@FindBy(id="register")
	WebElement registerButton;
	
    public CreateAccountPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    
  //Entering username field
    public void setUserName(String strUserName){    	
    	username.sendKeys(strUserName);    
    }
    
  //Entering password field and confirm password field
    public void setPassword(String strPassword){    	
    	password.sendKeys(strPassword);
    	confirmPassword.sendKeys(strPassword);
    }
    
    //select language
    public void selectLanguage(){
    	Select select = new Select(languageSelect);
    	select.selectByIndex(1);
    }
    
    // click on create my account button
    public void clickOnRegister(){
    	registerButton.click();
    }
}
