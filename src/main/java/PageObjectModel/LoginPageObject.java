package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	public WebDriver driver;
	
	private By MyAccount =By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]");
	
	private By login=By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login'])[1]");
	
	private By email=By.xpath("//input[@id='input-email']");
	
	private By password=By.xpath("//input[@id='input-password']");
	
	private By clickonLogin=By.xpath("//input[@type='submit']");
	
	public LoginPageObject(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement verifyMyAccount() {
		return driver.findElement(MyAccount);
	}
	
	public WebElement verifyLogin() {
		return driver.findElement(login);
	}
	public WebElement enterEmail() {
		return driver.findElement(email);
	}
	public WebElement enterPassword() {
		return driver.findElement(password);
	}
	public WebElement clickOnLogin() {
		return driver.findElement(clickonLogin);
	}
}
