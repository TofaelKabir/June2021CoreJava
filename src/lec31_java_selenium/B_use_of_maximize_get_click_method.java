package lec31_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B_use_of_maximize_get_click_method {
	
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
	
	@Test
	public void loginButtonTest() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(4000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
