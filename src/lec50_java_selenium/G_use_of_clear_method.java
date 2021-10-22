package lec50_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class G_use_of_clear_method {

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

	@Test(enabled = true, priority = 1)
	public void userIdTest() throws InterruptedException {
		// send value in user id
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).sendKeys("Mohammad Sharkar");	
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).clear();	
		Thread.sleep(6000); // I pause here just to see the change by clear() method
		
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
