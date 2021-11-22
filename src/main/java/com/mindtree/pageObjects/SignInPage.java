package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.SignInPageUI;

public class SignInPage {

	public WebDriver driver;

	public SignInPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(SignInPageUI.email);
	}

	public WebElement getPassword() {
		return driver.findElement(SignInPageUI.password);
	}

	public WebElement getSignIn() {
		return driver.findElement(SignInPageUI.SignInButton);
	}

}
