package main;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.image.TileObserver;
import java.sql.PseudoColumnUsage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import discount.discounts;
import discounttype.choose_discount_type;
import filter.filterby;

import list.filterlist;
import pageobjectmodel.wordpressloginpage;
import robot.robot;
import title.title;

public class main_testing {
	WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"/home/cartrabbit/Downloads/geckodriver-v0.29.1-linux64/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://localhost/wordpress/wp-login.php");
	}

	@Test
	public void login() throws InterruptedException, AWTException {

		choose_discount_type Choosediscounttype = PageFactory.initElements(driver, choose_discount_type.class);

		wordpressloginpage.username(driver).sendKeys("user@example.com");
		wordpressloginpage.password(driver).sendKeys("W");
		wordpressloginpage.loginbutton(driver).click();
		wordpressloginpage.discountenter(driver);
		title.tittle(driver).sendKeys("Product Adjustment");

		Thread.sleep(1000);
		Choosediscounttype.Enterword("Product Adjustment");
		Thread.sleep(1000);

		PageFactory.initElements(driver, filterby.class);
		filterby.Enter_filter_type("products");
		filterby.list_notlist("in_list");
		filterby.Enter_product_name(driver).sendKeys("Toys");
		robot.robot(null);

		PageFactory.initElements(driver, discounts.class);
		discounts.discounttype("fixed_price");
		
		
		



	}

}
