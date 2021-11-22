package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.ContactUsUI;
import com.mindtree.uistore.HomePageUI;

public class ContactUs {

	public WebDriver driver;

	public ContactUs(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getContinueShopping() {
		return driver.findElement(ContactUsUI.contShop);
	}

	public WebElement getContactUS() {
		return driver.findElement(ContactUsUI.contactUS);
	}

	public WebElement getname() {
		return driver.findElement(ContactUsUI.name);
	}

	public WebElement getEmail() {
		return driver.findElement(ContactUsUI.email);
	}

	public WebElement getMessage() {
		return driver.findElement(ContactUsUI.message);
	}

	public WebElement getSend() {
		return driver.findElement(ContactUsUI.send);
	}

	public WebElement getTitle() {
		return driver.findElement(ContactUsUI.title);
	}

}
