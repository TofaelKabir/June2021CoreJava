package lec32_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class G_use_of_isSelected_method {

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

	// isSelected(), isEnabled(), isDisplayed() -- important interview question
	// isSelected() is the method used to verify if the web element is selectable or
	// not. isSelected() method is predominantly used with radio buttons, dropdowns
	// and checkboxes.
	
	// I will find a check box example where check box is completely selected
	@Test(enabled = true, priority = 1)
	public void checkBoxTest() {
		// the xpath is not really that tough, I make it complex, so don't afraid
		boolean elementSelected = driver.findElement(By.xpath("//input[contains(@id, 'checkd') and @name='tosREGISTER']")).isSelected();
		System.out.println(elementSelected);
	}
	
	@Test(enabled = true, priority = 3)
	public void findADocotorByPrimaryCareTest() {
		driver.get("https://www.mountsinai.org/");
		boolean elementSelected = driver.findElement(By.xpath("(//span[text()='Primary Care'])[1]")).isSelected();
		System.out.println(elementSelected);
	}


	@AfterTest
	public void tearUp() {
		driver.close(); // To close current WebDriver instance
	}

}
