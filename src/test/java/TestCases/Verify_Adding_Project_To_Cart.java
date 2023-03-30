package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.AddingProjectToCartPageObject;
import Resources.Constants;
import Resources.baseClass;

public class Verify_Adding_Project_To_Cart extends baseClass {

	@Test
	public void AddingProjectToCart() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		AddingProjectToCartPageObject obj3 = new AddingProjectToCartPageObject(driver);

		driver.manage().window().maximize();

// iPhone--
		obj3.enterSearch().sendKeys(Constants.Search);// iphone

		obj3.clickOnSearchButton().click();

		obj3.clickOniphoneButton().click();

		obj3.grabTheiphonePrice();

// Print the iphone price in $--
		System.out.println(obj3.grabTheiphonePrice().getText()); // $123.20

// String Convert into double and $(Dollor) replace --
		double d1 = Double.parseDouble(obj3.grabTheiphonePrice().getText().replace("$", ""));

		System.out.println(d1); // 123.2

		obj3.addToCartiphone().click();

// Samsung--
		obj3.enterSearchForSamsung().clear();

		obj3.enterSearchForSamsung().sendKeys(Constants.Search1);// Samsung

		obj3.clickOnSearchButtonSam().click();

		obj3.clickOnSamButton().click();

		obj3.grabTheSamPrice();

// Print the Samsung price in $--
		System.out.println(obj3.grabTheSamPrice().getText()); // $241.99

// String Convert into double and $(Dollor) replace --
		double d2 = Double.parseDouble(obj3.grabTheSamPrice().getText().replace("$", ""));

		System.out.println(d2); // 241.99

		obj3.addToCartSam().click();

		obj3.shoppingCart().click();

		double d = d1 + d2;// 365.19

		System.out.println(d);

		obj3.itemsTotal();

		System.out.println(obj3.itemsTotal().getText());// $365.19

	}
}