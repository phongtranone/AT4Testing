package HighLevelFunctions;

import org.openqa.selenium.By;

import Keywords.SimpleKeyword;

public class menuItems {
	SimpleKeyword simpleKeyword = new SimpleKeyword();
	String menuLocator = "//ul/li/a[contains(text(),'%s')]";
	public void goToMenu(String menuName) {
		String menuOutput = String.format(menuLocator, menuName);
		simpleKeyword.clickOnThe(By.xpath(menuOutput));
	}
}
