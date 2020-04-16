package TestInit;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Keywords.Utils;

public class OpenBrowser {
	public void Setup() throws IOException {
		WebDriver driver = null;	
		Properties prop = Utils.getProp(ConstantLib.configFile);
		
		  switch (prop.getProperty("browser")) { 
		  case "Chrome": 
			  //System.out.println(ConstantLib.chrome_path);
			  System.setProperty("webdriver.chrome.driver", ConstantLib.chrome_path);
			  driver = new ChromeDriver(); 
			  driver.manage().window().maximize();
			  break; 
		  }
		 ConstantLib.driver = driver;
	}
	
	public void Cleanup() {
		//ConstantLib.driver.close();
	}
}
