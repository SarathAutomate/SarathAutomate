package discounttype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class choose_discount_type {
	WebDriver driver;
	
	
	
	public choose_discount_type(WebDriver d){
		
		this.driver=d;
		
		
	}
	
	
	@FindBy(name= "discount_type")
	public static WebElement discount;
	
	public static  void Enterword(String arg) {
		Select dropdown= new Select(discount);
		dropdown.selectByVisibleText(arg);
	}
	
	
	
	
	
	
	
	
	
//  
//	
	}
		

		
		
		
		
		
		
	
		
	
		
		
	
	
	
	
	
	
	


