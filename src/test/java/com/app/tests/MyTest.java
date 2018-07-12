package com.app.tests;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.app.pages.LetsKodeItPage;
import com.app.pages.ZillowInvalidZipCode;
import com.app.utilities.Driver;

public class MyTest {

	private WebDriver driver = Driver.getDriver();
	
	LetsKodeItPage let = new LetsKodeItPage();
	
//	@Test 
	public void first_Test() throws AWTException, InterruptedException {
		let.openTheBrowser();
	}
	
	@Test
	public void zillowTest() {
		ZillowInvalidZipCode z = new ZillowInvalidZipCode();
		z.zillowPage();
	}
	
}

