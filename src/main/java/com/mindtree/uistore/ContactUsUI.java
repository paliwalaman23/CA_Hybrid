package com.mindtree.uistore;

import org.openqa.selenium.By;

public class ContactUsUI {

	public static By contactUS = By.linkText("Contact us");

	public static By message = By.id("ContactFormMessage-page-contact-template-0");

	public static By name = By.id("ContactFormName-page-contact-template-0");

	public static By email = By.id("ContactFormEmail-page-contact-template-0");

	public static By send = By.xpath("//*[@type='submit']");

	public static By title = By.cssSelector(".section-header__title.appear-delay");

	public static By contShop = By
			.cssSelector(".drawer__close-button.js-drawer-close.btn.btn--secondary.btn--full.arrow-new1");

}
