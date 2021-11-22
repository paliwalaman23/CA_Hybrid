package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.AboutUsUI;

public class AboutUs {

	public WebDriver driver;

	public AboutUs(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getAbout() {
		return driver.findElement(AboutUsUI.about);
	}

	public WebElement getTitle() {
		return driver.findElement(AboutUsUI.title);
	}

}
