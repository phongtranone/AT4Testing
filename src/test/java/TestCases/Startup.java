package TestCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;

import TestInit.Innitialize;

public class Startup {
	Innitialize init = new Innitialize();
	@BeforeTest
	void Setup(){
		try {
			init.Setup();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
