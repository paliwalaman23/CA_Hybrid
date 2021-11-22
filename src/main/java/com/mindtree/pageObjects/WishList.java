package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.WishListUI;

public class WishList {
	public WebDriver driver;

	public WishList(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getWishList() {
		return driver.findElement(WishListUI.wishlist);
	}

	public WebElement getPopup() {
		return driver.findElement(WishListUI.popup);
	}

	public WebElement getProduct() {
		return driver.findElement(WishListUI.product);
	}

}
