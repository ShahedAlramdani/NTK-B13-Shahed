package HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exe6 extends Hooks {
	public static void main(String[] args) throws InterruptedException {
		setUp("edge");
		driver.get("https://demo.automationtesting.in/Alerts.html\r\n");
		Thread.sleep(1000);
		driver.getTitle();
		System.out.println(driver.getTitle());

		WebElement textBox = driver.findElement(By.xpath("// a[@href='#Textbox']"));
		textBox.click();
		Thread.sleep(1000);

		WebElement clickBtn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		clickBtn.click();
		Thread.sleep(1000);

		Alert enterYName = driver.switchTo().alert();
		enterYName.sendKeys("Shahed Alramdani");
		enterYName.accept();

		Thread.sleep(3000);

		WebElement message = driver.findElement(By.id("demo1"));
		String displayedText = message.getText();

		if (displayedText.contains("How are you today")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		driver.navigate().refresh();
		Thread.sleep(1000);

		WebElement okCancel = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		okCancel.click();
		Thread.sleep(1000);

		WebElement confirmBox = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		confirmBox.click();
		Thread.sleep(1000);

		Alert alertBtn = driver.switchTo().alert();
		alertBtn.getText();

		if (alertBtn.getText().contains("Press a Button !")) {
			alertBtn.dismiss();

		} else {
			alertBtn.accept();

		}

		WebElement finalText = driver.findElement(By.id("demo"));
		finalText.getText();
		if (finalText.getText().contains("You Pressed")) {
			System.out.println("verified");
		} else {
			System.out.println("Test Failed");
		}

		tearDown();

	}

}
