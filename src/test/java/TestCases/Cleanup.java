package TestCases;

import org.testng.annotations.AfterTest;

import TestInit.OpenBrowser;

public class Cleanup {
	OpenBrowser init = new OpenBrowser();
	@AfterTest
	void cleanUp() {
		init.Cleanup();
	}
}
