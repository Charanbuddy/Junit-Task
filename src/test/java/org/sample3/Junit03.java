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

public class Junit03 extends BaseMethods {

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
		driver.get("https://demoqa.com/automation-practice-form");
		Junit03a s = new Junit03a();

		findAndSend(s.getTxtFirstName(), readFromExcel(0, 0));
		findAndSend(s.getTxtLastName(), readFromExcel(0, 1));
		findAndSend(s.getTxtEmailId(), readFromExcel(1, 0));
		Assert.assertEquals("Check the given Email", "charanbuddy@gmail.com", readFromExcel(1, 0));
		click(s.getClkGenderRadioBtn());
		findAndSend(s.getTxtMobileNum(), readFromExcel(2, 0));
		jsSendKeys(readFromExcel(4, 0), s.getTxtSubjects());
		String ta = gettingAttr(s.getTxtAttributeValue());
		System.out.println(ta);
		click(s.getClkCheckSports());
		click(s.getClkCheckReading());
		click(s.getClkCheckMusic());
		findAndSend(s.getTxtAddress(), readFromExcel(5, 0));
		click(s.getClkSubmit());

	}

}
