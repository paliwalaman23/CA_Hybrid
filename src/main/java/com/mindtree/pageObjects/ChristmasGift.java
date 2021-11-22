package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.ChristmasGiftUI;
import com.mindtree.uistore.HomePageUI;

public class ChristmasGift {

	public WebDriver driver;

	public ChristmasGift(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getChristmasGift() {
		return driver.findElement(ChristmasGiftUI.christmas);
	}

	public WebElement getFirstProduct() {
		return driver.findElement(ChristmasGiftUI.product);
	}

	public WebElement getAddToCart() {
		return driver.findElement(ChristmasGiftUI.addCart);
	}

	public WebElement getCheckOut() {
		return driver.findElement(ChristmasGiftUI.checkout);
	}

	public WebElement getReturnToCart() {
		return driver.findElement(ChristmasGiftUI.returnCart);
	}

	public WebElement getPopup() {
		return driver.findElement(ChristmasGiftUI.popup);
	}

	public WebElement getTitle() {
		return driver.findElement(ChristmasGiftUI.title);
	}

}
