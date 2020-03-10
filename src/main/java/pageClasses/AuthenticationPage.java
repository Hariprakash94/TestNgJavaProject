package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {
	private WebDriver driver;

	public AuthenticationPage(WebDriver driver){

        this.driver = driver;
    }
 
	    By email_address = By.id("email_create");
	    By create_an_account = By.id("SubmitCreate");
	    
	    public void enterEmailAndCreateAccount() {
	    	driver.findElement(email_address).sendKeys("johndoe+test10@gmail.com",Keys.TAB);
	    	driver.findElement(create_an_account).click();
	    }
}
