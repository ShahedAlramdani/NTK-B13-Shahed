package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class Exe4 extends Hooks {
	public static void main(String[] args) throws InterruptedException {
		setUp("edge");
		driver.get("https://www.dummyticket.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement buyTicketField = driver.findElement(By.linkText("Buy Ticket"));
		buyTicketField.click();
		Thread.sleep(1000);

		String Title = driver.getTitle();
		String expectedTitle = "Dummy ticket for applying visa - Verifiable flight reservation for embassy";

		// Verify the title
		if (Title.equals(expectedTitle)) {
			System.out.println("Title verification PASSED!");
		} else {
			System.out.println("Title verification FAILED!");

		}

		WebElement selectHotel = driver.findElement(By.id("product_551"));
		selectHotel.click();
		Thread.sleep(1000);
		
		
		WebElement firstNameField = driver.findElement(By.name("travname"));
		firstNameField.sendKeys("Shahed");
		
		WebElement lastNameField = driver.findElement(By.name("travlastname"));
		lastNameField.sendKeys("Alramdani");
		
		
		

		tearDown();

	}
}
