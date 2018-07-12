package com.app.pages;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.app.utilities.Configuration;
import com.app.utilities.Driver;


public class LetsKodeItPage {

	private WebDriver driver;
	
	public LetsKodeItPage() {
		this.driver = Driver.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchBar;
	
	@FindBy(id="openwindow")
	public WebElement openWindow;
	
	@FindBy(id="opentab")
	public WebElement openTab;
	
	@FindBy(id="searchDropdownBox")
	public WebElement dropdown;
	
	
	public void openTheBrowser() throws AWTException, InterruptedException {
		driver.get(Configuration.getProperty("url"));
	
		Select sel = new Select(dropdown);
		Thread.sleep(3000);
		sel.selectByIndex(1);
		driver.navigate().forward();
		driver.navigate().back();
		
//		Alert alt = driver.switchTo().alert();
//		alt.dismiss();
//		alt.accept();
//		alt.sendKeys("");
//		alt.getText();	
	}
	
	
	
	
}
