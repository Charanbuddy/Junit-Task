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

public class Junit04 extends BaseMethods {

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
		driver.get("https://www.flipkart.com/account/login");
		Junit04a s = new Junit04a();

		findAndSend(s.getTxtUserName(), readFromExcel(0, 0));
		findAndSend(s.getTxtPassword(), readFromExcel(1,0));
		Assert.assertEquals("check the password", "Ch@r@n2304", readFromExcel(1, 0));
		click(s.getClkSubmit());

	}

}
