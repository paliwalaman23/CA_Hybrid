package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.HomePageUI;
import com.mindtree.uistore.ShopByCategoryUI;

public class ShopByCategory {

	public WebDriver driver;

	public ShopByCategory(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getShopByCategory() {
		return driver.findElement(ShopByCategoryUI.shopbycategory);

	}

	public WebElement getCategory() {
		List<WebElement> list = driver.findElements(ShopByCategoryUI.birthdaygift);
		return list.get(1);
	}

	public WebElement getProduct() {
		return driver.findElement(ShopByCategoryUI.product);
	}

	public WebElement getWishList() {
		return driver.findElement(ShopByCategoryUI.addtowishlist);
	}

}
