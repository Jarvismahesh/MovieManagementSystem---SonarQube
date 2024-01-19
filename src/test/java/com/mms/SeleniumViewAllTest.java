package com.mms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumViewAllTest {

	@Test
	void viewAllOperation() {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://localhost:4200/");

		driver.findElement(By.className("ri8")).click();
		driver.findElement(By.tagName("table")).click();
	}

	public static void main(String[] args) {

		SeleniumViewAllTest test = new SeleniumViewAllTest();
		test.viewAllOperation();

	}

}
