package PageFactory;

public class registrationPage {
	public String EmailOfRegistrationLocator = "//input[@type='email' and preceding-sibling::label[contains(text(),'Email address ')]]";
	public String PasswordOfRegistrationLocator = "//div[child::h2[contains(text(),'Register')]]//input[@type='password']";
	public String RegisterBtnLocator = "//input[@name='register']";
}
