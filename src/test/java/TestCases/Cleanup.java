package TestCases;

import org.testng.annotations.AfterTest;

import TestInit.Initialize;

public class Cleanup {
	Initialize init = new Initialize();
	@AfterTest
	void cleanUp() {
		init.Cleanup();
	}
}
