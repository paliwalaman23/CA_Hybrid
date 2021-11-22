package com.mindtree.uistore;

import org.openqa.selenium.By;

public class ChristmasGiftUI {

	public static By christmas = By.linkText("Christmas Gifts");

	public static By product = By.xpath("//*[@class='grid-product__title']");

	public static By addCart = By.xpath("//*[@name='add']");

	public static By returnCart = By.className("step__footer__previous-link-content");

	public static By checkout = By.xpath("//*[@name='checkout']");

	public static By popup = By.xpath("//*[@class='wa-optin-widget-close-img']");

	public static By title = By.xpath("//*[@class='grid__item medium-up--one-half small--one-half nopaddingleft']");

}
