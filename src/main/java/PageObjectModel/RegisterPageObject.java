package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObject {

	public WebDriver driver;

//Your Personal Details---	

	private By MyAccount = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]");

	private By Register = By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/register'])[1]");

	private By FirstName = By.xpath("//input[@id='input-firstname']");

	private By LastName = By.xpath("//input[@id='input-lastname']");

	private By Email = By.xpath("//input[@id='input-email']");

	private By TelePhone = By.xpath("//input[@id='input-telephone']");

//Your Password---	

	private By Password = By.xpath("//input[@id='input-password']");

	private By ConfirmPassword = By.xpath("//input[@id='input-confirm']");

//Newsletter---	

	private By SubscribeYes = By.xpath("(//input[@name='newsletter'])[1]");

	private By SubscribeNo = By.xpath("(//input[@name='newsletter'])[2]");

	private By PrivacyPolicy = By.xpath("//input[@name='agree']");

	private By Continue = By.xpath("//input[@type='submit']");

	public RegisterPageObject(WebDriver driver2) {
		this.driver = driver2;
	}

//Your Personal Details---	

	public WebElement ClickonMyAccount() {
		return driver.findElement(MyAccount);
	}

	public WebElement VerifyRegister() {
		return driver.findElement(Register);
	}

	public WebElement enterFirstName() {
		return driver.findElement(FirstName);
	}

	public WebElement enterLastName() {
		return driver.findElement(LastName);
	}

	public WebElement enterEmail() {
		return driver.findElement(Email);
	}

	public WebElement enterTelePhone() {
		return driver.findElement(TelePhone);
	}

//Your Password---	

	public WebElement enterPassword() {
		return driver.findElement(Password);
	}

	public WebElement enterConfirmPassword() {
		return driver.findElement(ConfirmPassword);
	}

//Newsletter---	

	public WebElement ClickonSubscribeYes() {
		return driver.findElement(SubscribeYes);
	}

	public WebElement ClickonSubscribeNo() {
		return driver.findElement(SubscribeNo);
	}

	public WebElement ClickonPrivacyPolicy() {
		return driver.findElement(PrivacyPolicy);
	}

	public WebElement ClickonContinue() {
		return driver.findElement(Continue);
	}
}
