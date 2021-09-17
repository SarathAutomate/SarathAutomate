package list;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class filterlist {
	WebDriver driver;

	public  filterlist(WebDriver d){
		
		this.driver=d;
		
}
	@FindBy(name ="filters[1][method]")
	public static WebElement filterliss;

	public static  void list(String arg) {
		Select dropdown= new Select(filterliss);
		dropdown.selectByValue(arg);
	}}