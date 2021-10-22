package lec50_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B05_use_of_get_attribute {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/Downloads/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.mountsinai.org/");
		Thread.sleep(4000);
	}

	@Test(enabled = true, priority = 1)
	public void getAttributeTest() {
		String value = driver.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"))
				.getAttribute("data-toggle");
		System.out.println("\nThe text of a specific attribute in this web element is: "+ value);
	}
	
	//TODO Fixed with Nasir, not important
	@Test(enabled = true, priority = 2)
	public void otherTest() {
		System.out.println("Value of a specific source: " + driver.getPageSource()); // ask Nasir
		System.out.println("Value of a specific class : " + driver.getClass()); // ask Nasir
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
