package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver ;
	
	@FindBy(id="register_id")
    WebElement username;
	
	@FindBy(id="register_pw")
    WebElement password;
	
	@FindBy(id="login")
    WebElement loginButton	;
	
    public LoginPage(WebDriver driver){
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
    }
    
    public void clickOnLogin(){
    	loginButton.click();
    }

}
