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

public class Junit04a extends BaseMethods {

	public Junit04a() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement txtUserName;

	@FindBy(xpath="(//input[@type='password'])")
	private WebElement txtPassword;
	
	@FindBy(xpath="//div[@class='_1D1L_j']")
	private WebElement clkSubmit;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getClkSubmit() {
		return clkSubmit;
	}
	}