package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.FooterPageObject;
import Resources.baseClass;

public class Verify_Footers extends baseClass {
	@Test
	public void footer() throws InterruptedException {

		driver.manage().window().maximize();

		FooterPageObject foot = new FooterPageObject(driver);

		// footer (no.of count of links--)

		for (int i = 0; i < foot.VerifyIECM().size(); i++) {

			foot.VerifyIECM().get(i).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

			System.out.println("text-" + foot.VerifyIECM().get(i).getText());

		}

	}
}