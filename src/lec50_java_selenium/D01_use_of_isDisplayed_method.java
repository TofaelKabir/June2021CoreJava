package lec50_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D01_use_of_isDisplayed_method {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/Downloads/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(4000);
	}

	// isDisplayed() is an alternate of click()method which is boolean type
	// isDisplayed() is the method used to verify the presence of a web element
	// within the web page.
	// Use of isDisplayed()

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
