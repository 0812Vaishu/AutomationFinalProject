package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterPageObject {

	public WebDriver driver;
	
//footer (no.of count of links--)
	
	private By icem=By.xpath("//footer//div[@class='row']//div//ul//li//a");
	
	public FooterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement>VerifyIECM(){
		return driver.findElements(icem);
	}

}
