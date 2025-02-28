package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exe1 extends Hooks {
	public static void main(String[] args) throws InterruptedException {
		setUp("edge");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		 Thread.sleep(1000);
		 
		// user name
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("Admin");
        Thread.sleep(2000);

		// password Field
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement loginButton = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
		Thread.sleep(2000);

		// Retrieve the header text
		WebElement headerText = driver.findElement(By.tagName("h6"));
		String text = headerText.getText();
		System.out.println("Header Text:  " + text);
		
		if (text.equals("Dashboard")) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}

		tearDown();
	}

}
