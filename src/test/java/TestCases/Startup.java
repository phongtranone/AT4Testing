package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import TestInit.Initialize;

public class Startup {
	Initialize init = new Initialize();
	@BeforeTest
	void Setup(){
		try {
			init.Setup();
		} catch (IOException e) {
			
		}
	}
}
