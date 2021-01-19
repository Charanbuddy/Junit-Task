package org.sample3;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Junit01 extends BaseMethods {

	@BeforeClass

	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		maxwindow();

	}

	@Before
	public void startTime() {
		Date date = new Date();
		System.out.println(date);
	}

	@After
	public void endTime() {
		Date date = new Date();
		System.out.println(date);
	}
	
	@Test
	public void tc1() throws InterruptedException, IOException {

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(readFromExcel(0, 0));
		driver.findElement(By.id("pass")).sendKeys(readFromExcel(0, 1));
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}

	@Test
	public void tc3() throws InterruptedException, IOException {

		driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(readFromExcel(2, 0));
		String a3 = txtEmail.getAttribute("value");
		Assert.assertEquals("Verify please", a3, "Singaram");
		driver.findElement(By.id("pass")).sendKeys(readFromExcel(2, 1));
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}
	
	@Test
	public void tc2() throws InterruptedException, IOException {

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(readFromExcel(1, 0));
		driver.findElement(By.id("pass")).sendKeys(readFromExcel(1, 1));
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	
}
