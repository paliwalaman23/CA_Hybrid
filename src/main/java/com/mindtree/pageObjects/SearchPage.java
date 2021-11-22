package com.mindtree.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.uistore.SearchPageUI;

public class SearchPage {
	public WebDriver driver;

	public SearchPage(WebDriver driver) {

		this.driver = driver;
	}

	public WebElement getSearchBox() {
		return driver.findElement(SearchPageUI.searchbox);
	}

	public WebElement getSearchProduct() {
		return driver.findElement(SearchPageUI.searchProduct);
	}

}
