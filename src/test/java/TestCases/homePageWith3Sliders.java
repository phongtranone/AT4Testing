package TestCases;

import org.testng.annotations.Test;

import HighLevelFunctions.menuItems;
import PageFactory.homePage;

public class homePageWith3Sliders {
	homePage homePage = new homePage();
	menuItems menuItem = new menuItems();
	String menuName = "Shop";
	@Test
	public void verifyHomePageWith3Sliders() {
		homePage.goToHere();
		menuItem.goToMenu(menuName);
	}
}
