package createworkflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Createworkflow {


		public static WebElement create_workflow(WebDriver driver) {
			return driver.findElement(By.xpath("//button[contains(text(),'Create Workflow')]"));

		}
		
		
	}
	
	
	
	

