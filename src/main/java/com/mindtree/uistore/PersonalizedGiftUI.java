package com.mindtree.uistore;

import org.openqa.selenium.By;

public class PersonalizedGiftUI {

	public static By personalizedgift = By.linkText("Personalized Gifts");

	public static By sortby = By.id("sortBy");

	public static By hightolow = By.xpath("//*[@id=\'sortBy\']/option[7]");

	public static By maxprice = By.xpath("//*[@class='money']");

}
