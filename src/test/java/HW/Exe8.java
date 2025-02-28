package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exe8 extends Hooks {
	public static void main(String[] args) throws InterruptedException {

		setUp("edge");
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.findElement(By.id("singleframe"));

		driver.switchTo().frame(0);
		Thread.sleep(2000);

		// 3. Enter Accessing Iframe in the text field.
		WebElement iFrame = driver.findElement(By.xpath("//input[@type='text']"));
		iFrame.sendKeys("Accessing Iframe");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		// 5. Click Iframe with in an Iframe

		WebElement inIframe = driver.findElement(By.linkText("Iframe with in an Iframe"));
		inIframe.click();

		WebElement nestediFrame = driver
				.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px'] "));
		driver.switchTo().frame(nestediFrame);

		WebElement iframeDemo = driver
				.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px'] "));
		driver.switchTo().frame(iframeDemo);

		// 6. Enter Iframe is easy in the text field

		WebElement nestedFrame = driver.findElement(By.xpath("//input[@type='text']"));
		nestedFrame.sendKeys(" Iframe is easy ");
		Thread.sleep(1000);
		driver.switchTo().defaultContent();

		WebElement Home = driver.findElement(By.linkText("Home"));
		Home.click();

		if (driver.getTitle().equals("Index")) {
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
		tearDown();

	}

}
