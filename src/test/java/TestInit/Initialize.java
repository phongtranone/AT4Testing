package TestInit;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.rmi.CORBA.Util;
import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Keywords.Utils;

public class Initialize {
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
