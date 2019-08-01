package Keywords;

import java.util.List;

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
	
	public int countElements(By by) {
		WebElement optionCount = ConstantLib.driver.findElement(by);
		//WebElement count =  ConstantLib.driver.findElement(by);
		//return count.getSize().height;
		//return optionCount.size();
		return 1;
	}
}
