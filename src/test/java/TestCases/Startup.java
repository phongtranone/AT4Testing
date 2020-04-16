package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import TestInit.OpenBrowser;

public class Startup {
	OpenBrowser init = new OpenBrowser();
	@BeforeTest
	void Setup(){
		try {
			init.Setup();
		} catch (IOException e) {
			
		}
	}
}
