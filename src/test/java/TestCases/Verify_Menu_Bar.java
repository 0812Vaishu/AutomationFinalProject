package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.MenuBarPageObject;
import Resources.baseClass;

public class Verify_Menu_Bar extends baseClass{
	@Test
	public void MenuBar() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		MenuBarPageObject obj=new MenuBarPageObject(driver);
		
		driver.manage().window().maximize();
		
		obj.verifyDesktops().click();
		
		obj.verifyLaptopAndNetbook().click();
		
		obj.verifyComponent().click();
		
		obj.verifySoftware().click();
		 
		obj.verifyTables().click();
		
		obj.verifyPhonesAndPDAs().click();
		
		obj.verifyCameras().click();
		
		obj.verifyMP3players().click();
		
	}

}
