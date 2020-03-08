package page_objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class AutomationPracticeTests {

	String driverPath = "C:\\java_libs\\chromedriver.exe";

	WebDriver driver;

	AutomationpracticeHomePage objHomePage;



	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://automationpractice.com/index.php");

	}

	
	@Test(priority = 0)	
	public void create_an_account() {
		objHomePage = new AutomationpracticeHomePage(driver);
		objHomePage.click_on_sign_in();
		
		AuthenticationPage objAuthPage = new AuthenticationPage(driver);
		objAuthPage.enterEmailAndCreateAccount();
		
		CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver);
		createAnAccountPage.fill_create_account_page();
	}
}
