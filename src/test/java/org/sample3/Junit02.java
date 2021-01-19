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
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Junit02 extends BaseMethods {

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

		driver.get("https://www.redbus.in/");
		WebElement cursorMvmnt = driver.findElement(By.xpath("//div[@id='signin-block']"));
		cursorMovement(cursorMvmnt);
		click(cursorMvmnt);
		WebElement clkSingin = driver.findElement(By.xpath("//li[@id='signInLink']"));
		click(clkSingin);
		Thread.sleep(3000);

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		WebElement txtMobile = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		txtMobile.sendKeys(readFromExcel(0, 0));
		Assert.assertEquals("Check the Phone Number", "9600176552", readFromExcel(0, 0));

	}

}
