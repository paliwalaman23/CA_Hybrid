package com.mindtree.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import com.mindtree.reusableComponent.WebDriverHelper;

public class TakeSS {

	static WebDriver driver=null;
	
	public static String getScreenShot(ITestResult result) {
		
	     driver =	WebDriverHelper.getDriver();
		
	     System.out.println(driver);
	     
		TakesScreenshot tk = (TakesScreenshot)driver;

		File source = tk.getScreenshotAs(OutputType.FILE);
		String path = null;
		SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		String date = f.format(new Date());
				System.out.println(result.getStatus());
		if(result.getStatus()==1) {
		path = ".//screenShots//pass//" + result.getName()+" "+date+ ".png";

		File des = new File(path);

		try {
			FileUtils.copyFile(source, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else if(result.getStatus()==2) {
			 path = ".//screenShots//fail//" + result.getName()+" "+date+ ".png";

			File des = new File(path);

			try {
				FileUtils.copyFile(source, des);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return path;
	 }
}
