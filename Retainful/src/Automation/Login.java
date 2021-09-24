package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Options.Listoption;
import createworkflow.Createworkflow;

public class Login {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"/home/cartrabbit/Downloads/geckodriver-v0.29.1-linux64/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://beta.retainful.com");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.xpath(
				"//*[@id=\"auth0-lock-container-1\"]/div/div[2]/form/div/div/div[3]/span/div/div/div/div/div/div/div/div/div[4]/div[1]/div/input"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.name("submit"));
		username.sendKeys("ram96@j2store.org ");
		password.sendKeys("Wish609!");
		login.click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement store = driver.findElement(By.cssSelector(".css-bg1rzq-control"));
		store.click();

		driver.findElement(By.id("react-select-2-option-1")).click();
		Thread.sleep(1000);
		driver.findElement(By.tagName("button")).click();
	}
	
	@Test
	private void Environement() throws InterruptedException {

		PageFactory.initElements(driver, Listoption.class);
		PageFactory.initElements(driver, Createworkflow.class);
		driver.get("");
		
		
		
		
	}

		
		
		
		
		
		
		
		
		
		
	
}
