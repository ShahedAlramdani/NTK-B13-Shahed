package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exe2 extends Hooks {
	public static void main(String[] args) throws InterruptedException {
		setUp("edge");
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		// Clicks on the link
		WebElement link = driver.findElement(By.linkText("REGISTER"));
		link.click();
		Thread.sleep(2000);

		// verify title
		String title = driver.getTitle();
		System.out.println("Page Title: " + title);
	

		WebElement firstNameField = driver.findElement(By.name("firstName"));
		firstNameField.sendKeys("Shahed");
		Thread.sleep(1000);

		WebElement lastNameField = driver.findElement(By.name("lastName"));
		lastNameField.sendKeys("Alramdani");
		Thread.sleep(1000);

		WebElement phoneField = driver.findElement(By.name("phone"));
		phoneField.sendKeys("813-987-0909");
		Thread.sleep(1000);

		WebElement emailField = driver.findElement(By.id("userName"));
		emailField.sendKeys("Seleniumiscool@java.com");
		Thread.sleep(1000);

		WebElement addressField = driver.findElement(By.name("address1"));
		addressField.sendKeys("1111 Give Me Money Dr ");
		Thread.sleep(1000);

		WebElement cityField = driver.findElement(By.name("city"));
		cityField.sendKeys("Rich");
		Thread.sleep(1000);

		WebElement stateField = driver.findElement(By.name("state"));
		stateField.sendKeys("Wealth");
		Thread.sleep(1000);

		WebElement zipCodeField = driver.findElement(By.name("postalCode"));
		zipCodeField.sendKeys("01010");
		Thread.sleep(1000);
		
		WebElement userNameField = driver.findElement(By.name("email"));
		userNameField.sendKeys("Chuchu");
		Thread.sleep(1000);
	
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("chuchu1");
		Thread.sleep(1000);
		
		WebElement confirmField = driver.findElement(By.name("confirmPassword"));
		confirmField.sendKeys("chuchu1");
		Thread.sleep(1000);
		
		WebElement submitbutton = driver.findElement(By.name("submit"));
		submitbutton.click();
		Thread.sleep(1000);
		
		
		WebElement confirmationMessage = driver.findElement(By.xpath("//*[contains(text(), 'Thank you for registering')]"));
		String messageText = confirmationMessage.getText();

		System.out.println(messageText);
		// Check if the message contains the expected phrase
		if (messageText.contains("Thank you for registering.")) {
		    System.out.println("TESTCASE PASSED");
		} else {
		    System.out.println("TESTCASE FAILED");
		}
		

		tearDown();

	}

}
