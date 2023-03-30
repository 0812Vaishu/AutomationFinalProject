package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.HeaderPageObject;
import Resources.Common_Methods;
import Resources.Constants;
import Resources.baseClass;

public class Verify_Header extends baseClass {
	@Test
	public void header() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		HeaderPageObject obj = new HeaderPageObject(driver);

		driver.manage().window().maximize();

		// Header--
		obj.verifyCurrency().click();

		obj.clickOnTelephone().click();

		Common_Methods.handleAssertions(obj.telephonetextnumber().getText(), Constants.expectedtelephonenum,"Error message is not matching");

		System.out.println("Telephonenumber- " + obj.telephonetextnumber().getText());

		// Assertion for the understanding purpose--

		/*
		 * SoftAssert a = new SoftAssert(); String actual
		 * =obj.telephonetextnumber().getText(); String expected = "123456879";
		 * 
		 * a.assertEquals(actual, expected, "Error message is not matching");
		 * a.assertAll();
		 */

		obj.verifyMyAccount().click();

		obj.verifyWishlist().click();

		obj.verifyShoppingCart().click();

		obj.verifyCheckout().click();

	}
}
