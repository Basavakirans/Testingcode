package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
// I'm writing a pseudo code as environment/website is not working properly
public class CreateAccountSuccessPage {

	
	WebDriver driver ;
	@FindBy(id="Success Message")
    WebElement successMessage;
	
    public CreateAccountSuccessPage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public void validateSuccessMessage(String expectedMSG){
    	String actualMSG = successMessage.getText();
    	Assert.assertEquals(actualMSG, expectedMSG);
    }
}
