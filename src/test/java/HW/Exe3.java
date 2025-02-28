package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exe3 extends Hooks {
	public static void main(String[] args) throws InterruptedException {
		
	
	setUp("edge");
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	WebElement registerlink = driver.findElement(By.linkText("Register"));
	registerlink.click();
	Thread.sleep(1000);

	
	tearDown();
	
	
	}
}
