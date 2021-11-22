package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.AboutUsUI;
import com.mindtree.uistore.GiftCardUI;

public class GiftCard {

	public WebDriver driver;

	public GiftCard(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getGiftCard() {
		return driver.findElement(GiftCardUI.giftcard);
	}

	public WebElement getTitle() {
		return driver.findElement(GiftCardUI.title);
	}

}
