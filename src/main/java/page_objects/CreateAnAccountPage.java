package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CreateAnAccountPage extends TestHelper{
	private WebDriver driver;

	public CreateAnAccountPage(WebDriver driver){

        this.driver = driver;

    }
	By radio_mrs = By.id("id_gender2");
	By first_name = By.id("customer_firstname");
	By last_name = By.id("customer_lastname");
	By password = By.id("passwd");
	By select_days = By.name("days");
	By select_month = By.name("months");
	By select_year = By.name("years");
	By chk_newsletter = By.name("newsletter");
	By offers_from_partners = By.id("optin");
	By company_name = By.id("company");
	By address1 = By.id("address1");
	By address2 = By.id("address2");
	By city_name = By.id("city");
	By select_state = By.name("id_state");
	By postal_code = By.id("postcode");
	By phone_mobile = By.id("phone_mobile");
	By btn_submit = By.id("submitAccount");
	

	
	
	public void fill_create_account_page() {
		driver.findElement(radio_mrs).click();
		driver.findElement(first_name).sendKeys("Rick");
		driver.findElement(last_name).sendKeys("Sanchez");
		driver.findElement(password).sendKeys("123456");
		selectlistByValue(driver,select_days,"3");
		selectlistByValue(driver,select_month,"3");
		selectlistByValue(driver,select_year,"2020");
		driver.findElement(chk_newsletter).click();
		driver.findElement(offers_from_partners).click();
		driver.findElement(address1).sendKeys("7634 South Hilldale Ave.");
		driver.findElement(address2).sendKeys("Apt 101");
		driver.findElement(city_name).sendKeys("colorado");
		selectlistByValue(driver,select_state,"1");
		driver.findElement(postal_code).sendKeys("12345");
		driver.findElement(phone_mobile).sendKeys("123456789");
		driver.findElement(btn_submit).click();

		
		

	}
}
