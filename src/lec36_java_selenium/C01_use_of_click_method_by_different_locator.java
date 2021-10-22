package lec36_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C01_use_of_click_method_by_different_locator {
	
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
	
	// if no priority, test case will run alphabetically, interview question
	@Test (enabled = false, priority = 1)
	public void loginButtonTest01() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(4000);	
	}
	
	@Test (enabled = false, priority = 2)
	public void loginButtonTest02() {
		driver.findElement(By.name("Submit Login")).click();
	}
	
	@Test (enabled = false, priority = 3)
	public void newUserRegistrationTest01() {
		driver.findElement(By.className("cms-newuser-reg")).click();
		
	}
	
	@Test (enabled = false, priority = 4)
	public void newUserRegistrationTest02() {
		driver.findElement(By.linkText("New User Registration")).click();
		
	}
	
	// (partial or part of a Text) is called PartialLinkText
	@Test (enabled = true, priority = 4)
	public void newUserRegistrationTest03() {
		driver.findElement(By.partialLinkText("New User R")).click();
		
	}
	
	// not showing a unique tag name, this is not common.
	
	

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
