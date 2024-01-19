package com.mms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumUpdate {

	@Test
	void updateOperationTest() {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://localhost:4200/");

		driver.findElement(By.className("left")).click();

		driver.findElement(By.name("fid")).sendKeys("6");

		driver.findElements(By.tagName("input")).get(1).click();

		driver.findElement(By.name("fname")).sendKeys("Legend");

		driver.findElement(By.name("fgenres")).sendKeys("Scifi");

		driver.findElement(By.name("flanguage")).sendKeys("Tamil");

		driver.findElement(By.name("fduration")).sendKeys("2.30");

		driver.findElement(By.name("updatebtn")).click();

	}

	public static void main(String[] args) {
		SeleniumUpdate test = new SeleniumUpdate();
		test.updateOperationTest();

	}

}
