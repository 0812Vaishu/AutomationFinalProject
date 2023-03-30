package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuBarPageObject {

	public WebDriver driver;
	
	private By desktops = By.xpath("(//a[@class='dropdown-toggle'])[1]");
	
	private By laptopsAndNetbooks = By.xpath("(//a[@class='dropdown-toggle'])[3]");
	
	private By Components = By.xpath("(//a[@class='dropdown-toggle'])[4]");
	
	private By Tablets = By.xpath("//a[text()='Tablets']");
	
	private By Software = By.xpath("//a[text()='Software']");
	
	private By PhonesAndPDAs = By.xpath("//a[text()='Phones & PDAs']");
	
	private By Cameras = By.xpath("//a[text()='Cameras']");
	
	private By MP3Players = By.xpath("(//a[@class='dropdown-toggle'])[5]");

	public MenuBarPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement verifyDesktops() {
		return driver.findElement(desktops);
	}

	public WebElement verifyLaptopAndNetbook() {
		return driver.findElement(laptopsAndNetbooks);
	}

	public WebElement verifyComponent() {
		return driver.findElement(Components);
	}

	public WebElement verifyTables() {
		return driver.findElement(Tablets);
	}

	public WebElement verifySoftware() {
		return driver.findElement(Software);
	}

	public WebElement verifyPhonesAndPDAs() {
		return driver.findElement(PhonesAndPDAs);
	}

	public WebElement verifyCameras() {
		return driver.findElement(Cameras);
	}

	public WebElement verifyMP3players() {
		return driver.findElement(MP3Players);
	}

}
