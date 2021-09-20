package discount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class discounts {
WebDriver driver;
	
	
	
	public discounts(WebDriver m){
		
		this.driver=m;
	}
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[1]/div[6]/div[2]/div[1]/div[1]/div/form/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[1]/div[1]/select")
	public static WebElement discount1;
	
	public static  void discounttype(String arg) {
		Select dropdown= new Select(discount1);
		dropdown.selectByValue(arg);
	}
	
	
//	public static WebElement tittle(WebDriver driver) {
//		return driver.findElement(By.name(""));
//	
//	
//	
//	
}
