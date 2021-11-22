package com.mindtree.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.AllOfItUI;
import com.mindtree.uistore.HomePageUI;
import com.mindtree.uistore.ShopByCategoryUI;

public class AllOfIt {

	public WebDriver driver;

	public AllOfIt(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getAllOfIT() {
		return driver.findElement(AllOfItUI.allofit);
	}

	public WebElement getProduct() {
		List<WebElement> list = driver.findElements(AllOfItUI.product);
		return list.get(0);
	}

	public WebElement getTitle() {
		return driver.findElement(AllOfItUI.title);
	}

}
