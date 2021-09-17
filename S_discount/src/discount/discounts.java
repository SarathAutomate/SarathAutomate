package discount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class discounts {
WebDriver driver;
	
	
	
	public discounts(WebDriver m){
		
		this.driver=m;
	}
	
	@FindBy(name= "product_adjustments[type]")
	public static WebElement discount1;
	
	public static  void discounttype(String arg) {
		Select dropdown= new Select(discount1);
		dropdown.selectByVisibleText(arg);
	}
	
	
	
	
}
