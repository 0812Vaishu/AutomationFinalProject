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

/*//Currency--
	private By Currency = By.xpath("//button[@class='btn btn-link dropdown-toggle']");

// TelePhone--
	private By Telephone=By.xpath("//i[@class='fa fa-phone']");
	
    private By TelePhoneNumber =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[2]");
// myAccont--
	private By MyAccount =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]");
	
// wishList--
	private By Wishlist =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]");
// ShoppingCart---
	private By ShoppingCart =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[5]");
	
// CheckOut--
	private By checkOut =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[6]");
	
	public HeaderPageObject(WebDriver driver2) {
		this.driver = driver2;
	}
	public WebElement VerifyCurrency() {
		return driver.findElement(Currency);
	}
	public WebElement ClickonTelephone() {
		return driver.findElement(Telephone);
	}
	public WebElement verifyTelePhone() {
		return driver.findElement(TelePhoneNumber);
	}
	public WebElement verifyMyAccount() {
		return driver.findElement(MyAccount);
	}
	public WebElement verifyWishList() {
		return driver.findElement(Wishlist);
	}
	public WebElement verifyShoppingCart() {
		return driver.findElement(ShoppingCart);
	}
	public WebElement verifyCheckOut() {
		return driver.findElement(checkOut);
	}*/
}
