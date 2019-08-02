package PageFactory;

public class registrationPage {
	String EmailOfRegistrationLocator = "//input[@type='email' and preceding-sibling::label[contains(text(),'Email address ')]]";
	String PasswordOfRegistrationLocator = "//div[child::h2[contains(text(),'Register')]]//input[@type='password']";
	String RegisterBtnLocator = "//input[@value='Register']";
}
