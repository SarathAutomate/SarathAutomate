package Options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Listoption {
	WebDriver driver;
	
	public static WebElement Automation1(WebDriver driver) {
		return driver.findElement(By.linkText("Automation"));
	}
	
	

}
