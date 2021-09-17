package filter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class filterby{
WebDriver driver;

public  filterby(WebDriver d){
	
	this.driver=d;
	

	
	
}
@FindBy(className ="wdr-product-filter-type")
public static WebElement Filtertype;

public static  void Enter_filter_type(String arg) {
	Select dropdown1= new Select(Filtertype);
	dropdown1.selectByValue(arg);

		
}
@FindBy(name ="filters[1][method]")
public static WebElement filterliss;

public static  void list_notlist(String arg) {
	Select dropdown= new Select(filterliss);
	dropdown.selectByValue(arg);
}

public static WebElement Enter_product_name(WebDriver driver) {
	return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[6]/div[2]/div[1]/div[1]/div/form/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div/div[2]/div[2]/span/span[1]/span/ul/li/input"));


}
public static WebElement d(WebDriver driver) {
	return driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[6]/div[2]/div[1]/div[1]/div/form/div[2]/div[1]/div[2]/div/div/div/div/div[2]/button"));


}
}






