package lec36_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class O01_use_of_firefox_driver {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		// location of gecko driver is defined in System.setProperty 
		System.setProperty("webdriver.gecko.driver", "/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2021/driver/geckodriver");
		// WebDriver is instantiated by FirefoxDriver
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portaldev.cms.gov/portal/");
	}

	@Test (enabled = true, priority = 1)
	public void logoTest() {
		boolean elementDisplayed = driver.findElement(By.xpath("//a[@id='cms-homepage-link']")).isDisplayed();
		System.out.println(elementDisplayed);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
