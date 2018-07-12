package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.app.utilities.Configuration;
import com.app.utilities.Driver;

public class ZillowInvalidZipCode {

//	1. Create test from testNG
//	2. go to https://www.zillow.com/mortgage-calculator/
//	3. locate 'enter your zip code' text box
//	4. send invalid zip
//	5. click 'Get pre-qualified' button
//	6. validate error message "Please enter a valid ZIP code."
	private WebDriver driver = Driver.getDriver();	
	public ZillowInvalidZipCode() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="inputs-zipCode")
	public WebElement inputBar;
	
	@FindBy(xpath="//button[@class='zsg-button_alt zsg-button_fullsize']")
	public WebElement getPrequalBtn;
	
	@FindBy(xpath="//p[contains(text(), 'Please enter a valid ZIP code.')]")
	public WebElement validationText;
	
	
	
	public void zillowPage() {
		driver.get(Configuration.getProperty("urlZ"));
		inputBar.sendKeys("004-4");
		getPrequalBtn.click();
		
		String expectedText = "Please enter a valid ZIP code.";
		String actualText = validationText.getText();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualText, expectedText, "text verification");
		
		Assert.assertEquals(actualText, expectedText);
		
	}
	
	
	
	
	
}
