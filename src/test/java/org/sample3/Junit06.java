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

public class Junit06 extends BaseMethods {

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
		driver.get("http://www.adactin.com/HotelApp/");
		implicitwait();
		Junit06a s = new Junit06a();
		
		findAndSend(s.getTxtUserName(), readFromExcel(0, 1));
		findAndSend(s.getTxtPassword(), readFromExcel(1, 1));
		click(s.getClkLogin());
		sltByVisibleTxt(s.getSelectLocation(), readFromExcel(2, 1));
		sltByVisibleTxt(s.getSelectHotels(), readFromExcel(3, 1));
		sltByVisibleTxt(s.getSelectRoomType(), readFromExcel(4, 1));
		sltByVisibleTxt(s.getSelectRoomNos(), readFromExcel(5, 1));
		findAndSend(s.getCheckInDate(), readFromExcel(6, 1));
		findAndSend(s.getCheckOutDate(), readFromExcel(7, 1));
		sltByVisibleTxt(s.getSelectAdultRoom(), readFromExcel(8, 1));
		sltByVisibleTxt(s.getSelectChildRoom(), readFromExcel(9, 1));
		click(s.getClkSubmit());
		click(s.getClkRadioButton());
		click(s.getClkSubmit1());
		findAndSend(s.getTxtFirstName(), readFromExcel(10, 1));
		findAndSend(s.getTxtLastName(), readFromExcel(11, 1));
		findAndSend(s.getTxtAddress(), readFromExcel(12, 1));
		findAndSend(s.getTxtCcNum(), readFromExcel(13, 1));
		findAndSend(s.getTxtCcType(), readFromExcel(14, 1));
		sltByVisibleTxt(s.getTxtExpMonth(), readFromExcel(15, 1));
		sltByVisibleTxt(s.getTxtExpYear(), readFromExcel(16, 1));
		findAndSend(s.getTxtCvv(), readFromExcel(17, 1));
		click(s.getClickBookNow());
		preOfElementLocated("order_no", 10);

		WebElement orderNo = driver.findElement(By.id("order_no"));
		String t = gettingAttr(orderNo);
		scrollDown(s.getScrollDwn());
		screeShot("Hotel");

		String y = readFromExcel(18, 1);

		excelUpdate("C:\\Users\\acer\\eclipse-workspace\\Juint\\Junit Excel\\Junit Details.xlsx", "Task06", 18, 1, y, t);


	}

}
