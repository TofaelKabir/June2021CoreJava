package lec41_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class O03_use_of_chrome_driver {
	// below ChromeDriver is instantiated, we narrow down and can only use ChromeDriver
	// But if we use WebDriver, we can choose any other Driver for instantiation
	ChromeDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2021/driver/chromedriver");
		driver = new ChromeDriver();
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
