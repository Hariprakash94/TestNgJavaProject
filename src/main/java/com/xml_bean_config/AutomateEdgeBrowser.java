package com.xml_bean_config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AutomateEdgeBrowser {
	
@Test
    public void TestEdgeBrowser() {
    	System.setProperty("webdriver.ie.driver", "C:\\Windows\\System32\\Dism\\DismHost.exe");
    	WebDriver driver = new EdgeDriver();
        driver.get("www.google.com");
        driver.findElement(By.name("q")).sendKeys("Nadal");
        driver.findElement(By.name("btnK")).click();
        driver.close();
       
    }
}
