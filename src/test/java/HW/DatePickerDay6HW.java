package HW;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Hooks;

public class DatePickerDay6HW extends Hooks {
	public static void main(String[] args) throws InterruptedException {
		datepicker("January", "1", "2022");
		datepicker("February", "2", "2023");
		datepicker("March", "3", "2024");
		datepicker("April", "4", "2025");
		datepicker("May", "5", "2026");
		datepicker("June", "11", "2027");
		datepicker("July", "12", "2028");
		datepicker("August", "22", "2029");
		datepicker("September", "29", "2030");
		datepicker("October", "30", "2031");

	}

	public static void datepicker(String month, String day, String year) throws InterruptedException {

		setUp("edge");
		driver.get("https://jqueryui.com/datepicker/#dropdown-month-year");

		Thread.sleep(1000);
		driver.switchTo().frame(0);
		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();
		Thread.sleep(2000);

		WebElement monthDrop = driver.findElement(By.cssSelector(".ui-datepicker-month"));
		Select monthObj = new Select(monthDrop);

		List<WebElement> monthList = monthObj.getOptions();
		for (WebElement m : monthList) {

			if (m.getText().equals(month)) {
				monthObj.selectByVisibleText(month);
				break;
			}

		}
		Thread.sleep(1000);

		WebElement yearDrop = driver.findElement(By.cssSelector(".ui-datepicker-year"));
		Select yearObj = new Select(yearDrop);

		List<WebElement> yearList = yearObj.getOptions();
		for (WebElement y : yearList) {

			if (y.getText().equals(year)) {
				yearObj.selectByVisibleText(year);
				break;
			}
		}

		driver.findElement(By.xpath("//a[text()='" + day + "']")).click();
		Thread.sleep(2000);
		tearDown();

	}
}
