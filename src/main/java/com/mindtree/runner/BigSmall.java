package com.mindtree.runner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mindtree.utility.RetreiveExcelData;


import com.mindtree.pageObjects.AboutUs;
import com.mindtree.pageObjects.AllOfIt;
import com.mindtree.pageObjects.ChristmasGift;
import com.mindtree.pageObjects.ContactUs;
import com.mindtree.pageObjects.GiftCard;
import com.mindtree.pageObjects.HomePage;
import com.mindtree.pageObjects.PersonalizedGift;
import com.mindtree.pageObjects.SearchPage;
import com.mindtree.pageObjects.ShopByCategory;
import com.mindtree.pageObjects.SignInPage;
import com.mindtree.pageObjects.WishList;
import com.mindtree.reusableComponent.WebDriverHelper;
import com.mindtree.utility.ReadPropertyFile;

public class BigSmall {

	Logger log = LogManager.getLogger(BigSmall.class.getName());

	WebDriver driver = null;
	ReadPropertyFile rp = null;

	@Test(priority = 1)
	public void homePageLanding() throws Exception {

		rp = new ReadPropertyFile();
		HomePage hp = new HomePage(driver);

		driver = WebDriverHelper.initializeDriver();
		driver.manage().window().maximize();

		log.info("Browser has been Opened");

		driver.get(rp.getUrl());

	}

	@Test(priority = 2, dataProvider = "dataSuplier")
	public void signInTesting(String username, String password) throws Exception {

		HomePage hp = new HomePage(driver);
		hp.getLogin().click();

		SignInPage sp = new SignInPage(driver);
		sp.getEmail().clear();
		sp.getEmail().sendKeys(username);
		log.info(username + " entered");
		sp.getPassword().clear();
		sp.getPassword().sendKeys(password);
		log.info(password + " entered");
		sp.getSignIn().click();
		log.info("clicked on submit button");

		Thread.sleep(5000L);

	}

	@Test(priority = 3)
	public void PersonalGift() throws IOException, InterruptedException {

		PersonalizedGift pg = new PersonalizedGift(driver);

		pg.getPersonalGift().click();
		pg.getsortby().click();
		pg.gethightolow().click();
		
		
		if (pg.getmaxprice().getText().contains("Rs. 4,500")) {
			Assert.assertTrue(true);
			log.info("Successfully sorted the Price from High to low");
		} else {
			Assert.assertTrue(false);
			log.info("Price is not sorted from High to Low");
		}

	}

	@Test(priority = 4)
	public void selectProductTesting() throws InterruptedException, IOException {

		RetreiveExcelData re = new RetreiveExcelData();
		SearchPage sp = new SearchPage(driver);

		ArrayList<String> product = RetreiveExcelData.getData("searchproduct");

		for (int i = 1; i < product.size(); i++) {

			sp.getSearchBox().sendKeys(product.get(i));
			sp.getSearchBox().sendKeys(Keys.ENTER);

		}

		if (sp.getSearchProduct().isDisplayed()) {
			Assert.assertTrue(true);
			log.info("Products has been Displayed");
		} else {
			Assert.assertTrue(false);
			log.info("Product is not Displayed");
		}

	}

	@Test(priority = 5)
	public void ChristmasGiftTesting() throws InterruptedException {

		ChristmasGift cg = new ChristmasGift(driver);
		cg.getChristmasGift().click();

		cg.getFirstProduct().click();
		cg.getAddToCart().click();
		cg.getCheckOut().click();
		cg.getPopup().click();
		cg.getReturnToCart().click();
		if (cg.getTitle().getText().contains("Shopping Cart")) {
			Assert.assertTrue(true);
			log.info("Returned to the Cart");
		} else {
			Assert.assertTrue(true);
			log.info("User is not came back to the Cart");
		}

	}

	@Test(priority = 6)
	public void ShopByCategoryTesting() throws InterruptedException {
		ShopByCategory sc = new ShopByCategory(driver);

		sc.getShopByCategory().click();

		sc.getCategory().click();

		sc.getProduct().click();
		sc.getWishList().click();
		log.info("Product has been added to the Wishlist");

	}

	@Test(priority = 7)
	public void AllOfItTesting() throws InterruptedException {
		AllOfIt ai = new AllOfIt(driver);

		ai.getAllOfIT().click();
		ai.getProduct().click();
		if (ai.getTitle().getText().contains("Auto Rickshaw Pen Stand")) {
			Assert.assertTrue(true);
			log.info("Title under All Of It is verified");
		} else {
			Assert.assertTrue(false);
			log.info("Title under All Of It is not verified");
		}

	}

	@Test(priority = 8)
	public void WishListTesting() throws InterruptedException {
		WishList wl = new WishList(driver);
		Thread.sleep(3000);
		wl.getWishList().click();
		wl.getPopup().click();

		if (wl.getProduct().isDisplayed()) {
			Assert.assertTrue(true);
			log.info("Product is present over there in WishList");
		} else {
			Assert.assertTrue(false);
			log.info("Product is not present in the WishList");
		}

	}

	@Test(priority = 9)
	public void AboutUSTesting() throws InterruptedException {
		AboutUs au = new AboutUs(driver);
		au.getAbout().click();
		log.info(au.getTitle().getText());
		if (au.getTitle().getText().contains("About us")) {
			Assert.assertTrue(true);
			log.info("Entered in About Us page");
		} else {
			Assert.assertTrue(false);
			log.info("User is not Entered in About Us Page");
		}
	}

	@Test(priority = 10)
	public void GiftCardTesting() throws InterruptedException {
		GiftCard gc = new GiftCard(driver);
		ChristmasGift cg = new ChristmasGift(driver);

		gc.getGiftCard().click();
		cg.getAddToCart().click();
		Thread.sleep(5000);
		log.info(gc.getTitle().getText());
		if (gc.getTitle().getText().contains("Standard delivery")) {
			Assert.assertTrue(true);
			log.info("Gift Card has been added to the cart");
		} else {
			Assert.assertTrue(false);
			log.info("Gift Card has not been added to the cart");
		}

	}

	@Test(priority = 11)
	public void ContactUsTesting() throws InterruptedException {
		ContactUs cu = new ContactUs(driver);
		rp = new ReadPropertyFile();

		cu.getContinueShopping().click();
		Thread.sleep(2000);
		cu.getContactUS().click();
		Thread.sleep(3000);
		cu.getname().sendKeys(rp.getName());
		cu.getEmail().sendKeys(rp.getEmail());
		cu.getMessage().sendKeys(rp.getMessage());

		if (cu.getTitle().getText().contains("Contact us")) {
			Assert.assertTrue(true);
			log.info("Ttile Verfied and Data has been sent successfully");
		} else {
			Assert.assertTrue(false);
			log.info("Title has not been verified and Data has not been sent yet ");
		}

	}

	@AfterTest
	public void closeDriver() {
		driver.close();
		driver = null;
	}

	@DataProvider
	public Object[][] dataSuplier() {
		Object[][] data = new Object[3][2];

		// FOR SIGN IN TESTING WITH EMPTY FIELD.
		data[0][0] = "";
		data[0][1] = "";

		// FOR SIGN IN TESTING WITH INVALID DATA.
		data[1][0] = "Simon@123";
		data[1][1] = "abcd";

		// FOR SIGN IN TESTING WITH VALID DATA.
		data[2][0] = "JackNJill@gamil.com";
		data[2][1] = "JacjNJill@123";

		return data;
	}

}
