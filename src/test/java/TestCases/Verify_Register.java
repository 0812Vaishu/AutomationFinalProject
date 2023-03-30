package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.RegisterPageObject;
import Resources.Constants;
import Resources.baseClass;

public class Verify_Register extends baseClass {

	@Test
	public void register() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		RegisterPageObject reg = new RegisterPageObject(driver);

		driver.manage().window().maximize();

//Your Personal Details---	

		reg.ClickonMyAccount().click();

		reg.VerifyRegister().click();

		reg.enterFirstName().sendKeys(Constants.FirstName);

		reg.enterLastName().sendKeys(Constants.LastNmae);

		reg.enterEmail().sendKeys(Constants.Email);

		reg.enterTelePhone().sendKeys(Constants.TelePhone);

//Your Password---	

		reg.enterPassword().sendKeys(Constants.Password);

		reg.enterConfirmPassword().sendKeys(Constants.ConfirmPassword);

//Newsletter---	

		reg.ClickonSubscribeYes().click();

		reg.ClickonSubscribeNo().click();

		reg.ClickonPrivacyPolicy().click();

		reg.ClickonContinue().click();

	}

}
