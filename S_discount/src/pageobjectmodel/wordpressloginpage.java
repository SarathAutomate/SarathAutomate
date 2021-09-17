package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class wordpressloginpage {

public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("user_login"));
	}

public static WebElement password(WebDriver driver) {
	return driver.findElement(By.id("user_pass"));
}

public static WebElement loginbutton(WebDriver driver) {
	return driver.findElement(By.id("wp-submit"));
}
public static WebElement discountenter(WebDriver driver) throws InterruptedException {
	Actions action = new Actions(driver);
	WebElement element = driver.findElement(By.xpath("//*[@id=\"toplevel_page_woocommerce\"]/a/div[3]"));
	action.moveToElement(element).build().perform();
	Thread.sleep(2000);
	WebElement addproduct = driver.findElement(By.xpath("//*[@id=\"toplevel_page_woocommerce\"]/ul/li[4]/a"));
	addproduct.click();
	driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div/div/a[1]")).click();
	return addproduct;
}


	
}
