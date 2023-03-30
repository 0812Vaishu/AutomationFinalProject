package TestCases;
import java.time.Duration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.Constants;
import Resources.baseClass;

public class Verify_Login extends baseClass {
	
	@Test(dataProvider = "testData")
	public void login(String username, String password) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		LoginPageObject log = new LoginPageObject(driver);
		
		driver.manage().window().maximize();

		log.verifyMyAccount().click();

		log.verifyLogin().click();
				
		log.enterEmail().sendKeys(username);
				
		log.enterPassword().sendKeys(password);
		
		log.clickOnLogin().click();

	}

	@DataProvider
	public Object[][] testData() {
		
		Object[][] data = new Object[1][2];
		
		data[0][0] = Constants.username;
		data[0][1] = Constants.password;

		return data;
	}

}
