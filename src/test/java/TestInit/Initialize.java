package TestInit;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.rmi.CORBA.Util;
import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Keywords.Utils;

public class Innitialize {
	public void Setup() throws IOException {
		WebDriver driver = null;	
		Properties prop = Utils.getProp(ConstantLib.configFile);
		
		  switch (prop.getProperty("browser")) { 
		  case "Chrome": 
			  driver = new ChromeDriver(); 
			  //driver.navigate().to("google.com");
			  driver.get("https://www.google.com/");
			  break; 
		  }
		 ConstantLib.driver = driver;
	}
	
	public void Cleanup() {
		
	}
}
