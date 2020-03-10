package helperClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestHelper {
	
	public void mouseHover(WebDriver driver, By element ) {
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(element);
		action.moveToElement(we).build().perform();
	}
	
	public void selectlistByValue(WebDriver driver, By element, String string_value ) {
		Select drpDays = new Select(driver.findElement(element));
		drpDays.selectByValue(string_value);
	}
}
