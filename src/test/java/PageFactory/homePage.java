package PageFactory;

import java.io.IOException;
import java.util.Properties;

import Keywords.SimpleKeyword;
import Keywords.Utils;
import TestInit.ConstantLib;

public class homePage {
	SimpleKeyword simpleKeyword = new SimpleKeyword();
	public void goToHere() {
		try {
			Properties prop = Utils.getProp(ConstantLib.configFile);
			simpleKeyword.openURL(prop.getProperty("url"));
		} catch (IOException e) {
			
		}
	}
}
