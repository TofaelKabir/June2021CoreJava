package lec50_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B02_use_of_get_Title {
	
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/Downloads/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		driver.manage().window().maximize(); // need to teach what need to be added in this part, delete all cookies, implicitly wait etc.
		driver.get("https://portaldev.cms.gov/portal/");
		Thread.sleep(4000);
	}
	
	
	// how can you find the title of the page?
	// right click -- view page source -- ctrl+f (to find) -- Type Title
	
	@Test
	public void titleTest(){
		System.out.println("Title of the page : " + driver.getTitle()); // to see the output of the method we print it.
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
