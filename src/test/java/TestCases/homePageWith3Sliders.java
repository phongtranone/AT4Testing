package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import HighLevelFunctions.menuItems;
import Keywords.SimpleKeyword;
import PageFactory.homePage;
import PageFactory.shopPage;

public class homePageWith3Sliders {
	homePage homePage = new homePage();
	menuItems menuItem = new menuItems();
	shopPage shopPage = new shopPage();
	SimpleKeyword simpleKeyword = new SimpleKeyword();
	String menuName = "Shop";
	int expectedNumberOfSliders = 3;
	@Test
	public void verifyHomePageWith3Sliders() {
		homePage.goToHere();
		menuItem.goToMenu(menuName);
		simpleKeyword.clickOnThe(By.xpath(shopPage.homeButtonLocator));
		System.out.println(simpleKeyword.countElements(By.xpath(homePage.slidersLocator)));
	}
}
