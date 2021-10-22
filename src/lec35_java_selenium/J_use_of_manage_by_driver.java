package lec35_java_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class J_use_of_manage_by_driver {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2021/driver/geckodriver");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		
	}
	// TODO why url is opening first and then maximize? need to know
	@Test(enabled = false, priority = 1)
	public void maximizeWindow() {
		driver.manage().window().maximize();
		driver.get("https://www.mountsinai.org/");
	}
	
	@Test(enabled = false, priority = 2)
	public void fullScreenWindow() throws InterruptedException {
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		driver.get("https://www.amazon.com/");		
	}
	
	@Test(enabled = false, priority = 3)
	public void sizeOfWindow() {
		driver.manage().window().fullscreen();		
		System.out.println("The size of the screen is: "+ driver.manage().window().getSize());
		driver.get("https://www.bestbuy.com/");		
	}
	
	@Test(enabled = false, priority = 4)
	public void deleteCookies() {
		driver.manage().window().maximize();		
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");		
	}
	/*
	 // TODO THIS ONE later (Boby)
	@Test(enabled = true, priority = 5)
	public void waitForWindow() throws InterruptedException {
		driver.manage().window().maximize();	
		driver.manage().window().wait(3000, 0);
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");		
	}
	*/
	
	
	@Test(enabled = false, priority = 6)
	public void setASpecificSizeOfWindow() throws InterruptedException {
        Dimension dimension = new Dimension(500, 500); // important interview question
		driver.manage().window().setSize(dimension);
		driver.manage().deleteAllCookies();
		driver.get("https://www.cvs.com");		
	}
	
	//TODO FAILING, NEED to see later
	@Test(enabled = true, priority = 7)
	public void pageLoadTimeoutForWindow() {
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.get("https://www.costco.com");		
	}
	
	// not so important
	// TODO for asynchronous behavior, need to explain more.
	@Test(enabled = false, priority = 8)
	public void setScriptTimeoutForWindow() {
        driver.manage().timeouts().setScriptTimeout(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.ebay.com");		
	}
	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
