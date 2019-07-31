package Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestInit.ConstantLib;

public class SimpleKeyword {
	static WebDriver driver;
	
	public void openURL(String URL) {
		driver = ConstantLib.driver;
		driver.get(URL);
	}
	
	public void clickOnThe(By by) {
		WebElement element = ConstantLib.driver.findElement(by);
		element.click();
	}
	
}
