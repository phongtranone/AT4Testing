package PageFactory;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import Keywords.SimpleKeyword;
import Keywords.Utils;
import TestInit.ConstantLib;

public class homePage {
	public String slidersLocator = "//div[@data-slide-duration='0']";
	SimpleKeyword simpleKeyword = new SimpleKeyword();
	
	public void goToHere() {
		try {
			Properties prop = Utils.getProp(ConstantLib.configFile);
			simpleKeyword.openURL(prop.getProperty("url"));
		} catch (IOException e) {
			simpleKeyword = new SimpleKeyword();
		}
	}
}
