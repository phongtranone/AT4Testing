package Keywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		List<WebElement> optionCount = ConstantLib.driver.findElements(by);
		return optionCount.size();
	}
	
	public void inputData(String data, By by) {
		WebElement element = ConstantLib.driver.findElement(by);
		element.sendKeys(data);
	}
	
	public void waitForElementPresent(By by) {
		WebDriverWait wait = new WebDriverWait(ConstantLib.driver, 40);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
		
	}
}
