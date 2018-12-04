package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedInPage {

WebDriver driver ;
	
	@FindBy(id="loggedUserNname")
    WebElement loggedUserNname;
	
	@FindBy(id="Serach")
    WebElement searchField;
	
    public LoggedInPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    //below steps need to write code but environment is not working hence listing steps
    //need to write method to verify success login
    //need to write method to enter serach and verify searched outputs
}
