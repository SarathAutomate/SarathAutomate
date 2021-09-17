package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class robot {
	public static WebElement robot(WebDriver driver) throws InterruptedException, AWTException {
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		return null;
		
	}
}
