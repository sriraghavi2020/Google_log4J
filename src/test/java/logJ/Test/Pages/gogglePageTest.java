package logJ.Test.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gogglePageTest {

	public WebDriver driver;
	Logger log = Logger.getLogger(gogglePageTest.class.toString());
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\webDriver\\chromedriver.exe");
		log.info("Chrome is launched");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		log.info("web page is opened");
	}
	
	@Test
	public void testLogo() {
		log.debug("Hello");
		log.info("Checking the logo");
		boolean logoDisplay = driver.findElement(By.id("hplogo")).isDisplayed();
		if(logoDisplay = true) {
			log.info("Logo is present");
			
		}else {
			log.info("Logo is not present");
		}
		System.out.println("Logo is displayed: " +logoDisplay);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		log.info("browser is closed");
	}
}
