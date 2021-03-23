package com.burning.glass.selenium.pages.demotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.burning.glass.selenium.pages.AbstractPage;
import com.burning.glass.selenium.util.EnterTextUtils;
import com.burning.glass.selenium.util.RenewableWebElement;

public class Twitter extends AbstractPage {
	private static final By TWITTER_PHONE_EMAIL_OR_USERNAME_FINDER = By.xpath(".//input[contains(@name,'username_or_email')]");
	private static final By TWITTER_PASSWORD_FINDER = By.xpath(".//input[contains(@name,'password')]");

	private static final By LOG_IN_FINDER = By.xpath(".//input[text()='Log in']");

	public Twitter(AbstractPage parentPage) throws Exception {
		super(parentPage);
		// TODO Auto-generated constructor stub
	}

	public Twitter(WebDriver driver) throws Exception {
     super(driver);
	}

	public void enterUsernameOrEmailOrPhone(String nameOrEMailoRPhone) {
		EnterTextUtils.enterInput(nameOrEMailoRPhone,
				"Given User name and  entered username are different",
				"UserName Entered", TWITTER_PHONE_EMAIL_OR_USERNAME_FINDER, getDriver());
	}
	
	public void enterPassword(String password) {
		EnterTextUtils.enterInput(password,
				"Given Password and  entered password are different",
				"UserName Entered", TWITTER_PASSWORD_FINDER, getDriver());
	}
	
	

	@Override
	public void resetActiveIFrame() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void waitForLoad() throws Exception {
		waitForElement(TWITTER_PHONE_EMAIL_OR_USERNAME_FINDER, WAIT_TIME_LIMIT);
		
	}
	
}
