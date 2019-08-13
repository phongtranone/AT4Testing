package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import HighLevelFunctions.menuItems;
import Keywords.SimpleKeyword;
import PageFactory.homePage;
import PageFactory.registrationPage;
import TestInit.ConstantLib;

public class registerSuccessForNewAccount {
	homePage homePage = new homePage();
	menuItems menuItem = new menuItems();
	SimpleKeyword keyword = new SimpleKeyword();
	registrationPage registrationPage = new registrationPage();
	
	String menuName = "My Account";
	String newEmailForRegistration = "test005@yopmail.com";
	String password = "Ptpt@753159";
	String validation_locator = "//div[@aria-live='polite']";
	
	@Test
	public void verifyRegisterSuccessForNewAccount() {
		homePage.goToHere();
		menuItem.goToMenu(menuName);
		keyword.inputData(newEmailForRegistration, By.xpath(registrationPage.EmailOfRegistrationLocator));
		keyword.inputData(password, By.xpath(registrationPage.PasswordOfRegistrationLocator));
		ConstantLib.driver.findElement(By.xpath(registrationPage.PasswordOfRegistrationLocator)).sendKeys(Keys.NUMPAD0);
		ConstantLib.driver.findElement(By.xpath(registrationPage.PasswordOfRegistrationLocator)).sendKeys(Keys.NUMPAD0);
		ConstantLib.driver.findElement(By.xpath(registrationPage.PasswordOfRegistrationLocator)).sendKeys(Keys.NUMPAD0);
		ConstantLib.driver.findElement(By.xpath(registrationPage.PasswordOfRegistrationLocator)).sendKeys(Keys.NUMPAD0);
		//keyword.waitForElementPresent(By.xpath(validation_locator));
		keyword.clickOnThe(By.xpath(registrationPage.RegisterBtnLocator));
	}
}
