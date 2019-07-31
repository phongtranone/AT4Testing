package TestInit;

import org.openqa.selenium.WebDriver;

public class ConstantLib {
	public static WebDriver driver;
	public static String configFile  = System.getProperty("user.dir") + "\\resources\\config.properties";
	public static String chrome_path = System.getProperty("user.dir") + "\\lib\\chrome_driver\\chromedriver.exe";
}
