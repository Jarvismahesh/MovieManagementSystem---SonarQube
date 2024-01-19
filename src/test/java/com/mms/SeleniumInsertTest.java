package com.mms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumInsertTest {

	@Test
	void insertOperationTest() {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://localhost:4200/");

		driver.findElement(By.className("left")).click();

		driver.findElement(By.name("fid")).sendKeys("6");

		driver.findElements(By.tagName("input")).get(1).click();

		driver.findElement(By.name("fname")).sendKeys("Vivegam");

		driver.findElement(By.name("fgenres")).sendKeys("Action");

		driver.findElement(By.name("flanguage")).sendKeys("Tamil");

		driver.findElement(By.name("fduration")).sendKeys("2.28");

		// driver.findElement(By.tagName("td")).click();
		driver.findElement(By.name("insertbtn")).click();

	}

	public static void main(String[] args) {
		SeleniumInsertTest test = new SeleniumInsertTest();

		test.insertOperationTest();

	}
}
