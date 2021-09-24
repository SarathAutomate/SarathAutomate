package sanbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class livesite {
	WebDriver driver;

	@Test
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"/home/cartrabbit/Downloads/geckodriver-v0.29.1-linux64/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://retain-live.sandbox.flycart.net/shop/");
		
	
	}
	@Test
	public void shoppage() throws InterruptedException {
		WebElement product1 = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/main/ul/li[1]/a[1]/img"));
		product1.click();
		WebElement clickproduct = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/main/div[2]/div[2]/form/button"));

		clickproduct.click();
		
		
		
		driver.get("https://retain-live.sandbox.flycart.net/shop/");
		WebElement product2 = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/main/ul/li[10]/a[1]/img"));
		product2.click();
		WebDriverWait wait= new WebDriverWait(driver,10);
		WebElement clickproduct2 = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/main/div[2]/div[2]/form/button"));

		clickproduct2.click();
		driver.get("https://retain-live.sandbox.flycart.net/shop/");
		WebElement product3 = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/main/ul/li[11]/a[1]/img"));
		product3.click();
		WebElement clickproduct3 = driver
				.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/main/div[2]/div[2]/form/button"));

		clickproduct3.click();
		WebElement cartpage = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/nav/div[1]/ul/li[2]/a"));
	
		cartpage.click();
		Thread.sleep(2000);
		
		driver.get("https://retain-live.sandbox.flycart.net/checkout/");
		
		
		WebElement firstname = driver.findElement(By.id("billing_first_name"));
		firstname.sendKeys("Model");
		WebElement lastname = driver.findElement(By.id("billing_last_name"));
		lastname.sendKeys("Test");
		
		WebElement address = driver.findElement(By.id("billing_address_1"));
		address.sendKeys("Model");
		WebElement address2 = driver.findElement(By.id("billing_address_2"));
		address2.sendKeys("Model");
		WebElement addresscity = driver.findElement(By.id("billing_city"));
		addresscity.sendKeys("Model");
		WebElement addresspin = driver.findElement(By.id("billing_postcode"));
		addresspin.sendKeys("612503");
		WebElement phonenumber = driver.findElement(By.id("billing_phone"));
		phonenumber.sendKeys("9874563210");
		WebElement email = driver.findElement(By.id("billing_email"));
	email.sendKeys("Model@mailinator.com");
	
	
	
	
	
	
	
	
	WebElement element = driver.findElement(By.id("place_order"));
	element.submit();
//	element.click();
	
	
	
	//driver.execute_script("arguments[0].click();", element)
//	WebElement plcaeorder = driver.findElement(By.xpath("//*[@id=\"place_order\"]"));
//	email.click();
//		
		
//		billing_postcodebilling_emailplace_order
	}
	
	
	
	
	
	
	
	
}
