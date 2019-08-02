package TestCases;

import org.testng.annotations.Test;

import HighLevelFunctions.menuItems;
import PageFactory.homePage;

public class registerSuccessForNewAccount {
	homePage homePage = new homePage();
	menuItems menuItem = new menuItems();
	String menuName = "My Account";
	String newEmailForRegistration = "test001@yopmail.com";
	String password = "ptpt@753159";
	@Test
	public void verifyRegisterSuccessForNewAccount() {
		homePage.goToHere();
		menuItem.goToMenu(menuName);
	}
}
