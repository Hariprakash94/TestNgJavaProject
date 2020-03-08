package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AutomationpracticeHomePage extends TestHelper{

    WebDriver driver;

    By women = By.xpath("//*[contains(text(),'Women')]");

    By evening_dress = By.xpath("//*[contains(text(),'Evening Dresses')]");

    By sign_in =By.xpath("//*[contains(text(),'Sign in')]");


    public AutomationpracticeHomePage(WebDriver driver){

        this.driver = driver;

    }


    public void hover_women(){
    	mouseHover(driver, women);
        driver.findElement(evening_dress).click();
    }

    public void click_on_sign_in() {
    	 driver.findElement(sign_in).click();
    }






}