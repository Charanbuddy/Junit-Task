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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Junit06a extends BaseMethods {

	public Junit06a() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//input[@name='username'])")
	private WebElement txtUserName;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement txtPassword;

	@FindBy(xpath = "//input[@name='login']")
	private WebElement clkLogin;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement selectLocation;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement SelectHotels;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement selectRoomType;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement selectRoomNos;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkInDate;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkOutDate;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement selectAdultRoom;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement selectChildRoom;

	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement clkSubmit;

	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement clkRadioButton;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement clkSubmit1;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement txtFirstName;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement txtLastName;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement txtAddress;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement txtCcNum;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement txtCcType;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement txtExpMonth;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement txtExpYear;

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement txtCvv;

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement clickBookNow;
	
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement ScrollDwn;
	

	public WebElement getScrollDwn() {
		return ScrollDwn;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getClkLogin() {
		return clkLogin;
	}

	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getSelectHotels() {
		return SelectHotels;
	}

	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	public WebElement getSelectRoomNos() {
		return selectRoomNos;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getSelectAdultRoom() {
		return selectAdultRoom;
	}

	public WebElement getSelectChildRoom() {
		return selectChildRoom;
	}

	public WebElement getClkSubmit() {
		return clkSubmit;
	}

	public WebElement getClkRadioButton() {
		return clkRadioButton;
	}

	public WebElement getClkSubmit1() {
		return clkSubmit1;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCcNum() {
		return txtCcNum;
	}

	public WebElement getTxtCcType() {
		return txtCcType;
	}

	public WebElement getTxtExpMonth() {
		return txtExpMonth;
	}

	public WebElement getTxtExpYear() {
		return txtExpYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getClickBookNow() {
		return clickBookNow;
	}

}
