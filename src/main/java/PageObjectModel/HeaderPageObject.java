package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPageObject {
	
	public WebDriver driver;
	
//Header x-path--
		private By currency = By.xpath("//button[@class='btn btn-link dropdown-toggle']");

		private By telephone = By.xpath("//i[@class='fa fa-phone']");

		private By telephonenumber = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[2]");
		
		private By myAccount = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]");

		private By wishlist = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]");

		private By shoppingcart = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[5]");

		private By checkout = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[6]");

		public HeaderPageObject(WebDriver driver2) {

			this.driver = driver2;
		}

		public WebElement verifyCurrency() {

			return driver.findElement(currency);
		}

		public WebElement clickOnTelephone() {

			return driver.findElement(telephone);

		}
		public WebElement telephonetextnumber() {

			return driver.findElement(telephonenumber);

		}
		public WebElement verifyMyAccount() {

			return driver.findElement(myAccount);
		}

		public WebElement verifyWishlist() {

			return driver.findElement(wishlist);
		}

		public WebElement verifyShoppingCart() {

			return driver.findElement(shoppingcart);
		}

		public WebElement verifyCheckout() {

			return driver.findElement(checkout);
		}

}
