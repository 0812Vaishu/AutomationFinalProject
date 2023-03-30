package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddingProjectToCartPageObject {

	public WebDriver driver;
	
// iphone x-path--
		private By search = By.xpath("//input[@placeholder='Search']");

		private By clksearchiphone = By.xpath("//span[@class='input-group-btn']");

		private By clickoniphone = By.xpath("//a[text()='iPhone']");

		private By iphoneprice = By.xpath("(//ul[@class='list-unstyled'])[9]//li//h2");
		
		private By addtocartiphone = By.xpath("//button[@class='btn btn-primary btn-lg btn-block']");
//Samsung x-path--
		private By searchforsamsung = By.xpath("//input[@placeholder='Search']");

		private By clksearchsam = By.xpath("//span[@class='input-group-btn']");

		private By clickonsam = By.xpath("//a[text()='Samsung Galaxy Tab 10.1']");

		private By samprice = By.xpath("(//ul[@class='list-unstyled'])[9]//li//h2");

		private By addtocartsam = By.xpath("//button[@class='btn btn-primary btn-lg btn-block']");

		private By shoppingcart = By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']");

		private By itemstotal = By.xpath("(//td[@class='text-right'])[12]");

		
		public AddingProjectToCartPageObject(WebDriver driver2) {
			this.driver=driver2;
		}
//iPhone--
		public WebElement enterSearch() {

			return driver.findElement(search);
		}

		public WebElement clickOnSearchButton() {

			return driver.findElement(clksearchiphone);
		}

		public WebElement clickOniphoneButton() {

			return driver.findElement(clickoniphone);
		}

		public WebElement grabTheiphonePrice() {

			return driver.findElement(iphoneprice);
		}

		public WebElement addToCartiphone() {

			return driver.findElement(addtocartiphone);
		}
//Samsung-
		public WebElement enterSearchForSamsung() {

			return driver.findElement(searchforsamsung);
		}

		public WebElement clickOnSearchButtonSam() {

			return driver.findElement(clksearchsam);
		}

		public WebElement clickOnSamButton() {

			return driver.findElement(clickonsam);
		}

		public WebElement grabTheSamPrice() {

			return driver.findElement(samprice);
		}
		public WebElement addToCartSam() {

			return driver.findElement(addtocartsam);
		}
		public WebElement shoppingCart() {

			return driver.findElement(shoppingcart);
		}
		public WebElement itemsTotal() {

			return driver.findElement(itemstotal);
		}
}
