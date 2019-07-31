package AT4Testing.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "lib\\chrome_driver\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
