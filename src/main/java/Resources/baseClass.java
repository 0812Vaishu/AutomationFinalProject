package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import extentManager.ExtentManager;

public class baseClass {

	public static WebDriver driver;

	public Properties prop;

	public void driverInitilize() throws IOException {

// This will the read the properties file--
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");

// access the properties file--
	    prop = new Properties();
		
		prop.load(fis);// here load is a properties method

		String browserName = prop.getProperty("browser");// here string consider as a variable

		if (browserName.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			
		}
		else {
			
			System.out.println("please make sure you have correct browser");
		}

	}

	@BeforeSuite
	public void Beforesuite() {
		ExtentManager.setup();

	}

	@BeforeMethod
	public void openurl() throws IOException {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		driverInitilize();

		// this driver have scope
		String urlName = prop.getProperty("url");
		driver.get(urlName);
	}

	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {

		String dateFormat = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + dateFormat + ".png";

		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);

		return destination;
	}

	@AfterMethod
	public void closeBrowser() throws IOException {
		driver.quit();
	}

	@AfterSuite
	public void Aftersuite() {
		ExtentManager.endReport();
	}

}
