package lec50_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B03_use_of_get_current_url {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/Downloads/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // need to teach what need to be added in this part, delete all cookies,
												// implicitly wait etc.
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(4000);
	}

	@Test
	public void currentURLTest() {
		System.out.println("Current URL for the page : " + driver.getCurrentUrl());
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
