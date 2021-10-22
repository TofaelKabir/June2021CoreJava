package lec41_java_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class I04_use_of_drag_and_drop_action {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/Downloads/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
	}

	@Test(enabled = true, priority = 1)
	public void dragAndDropActionTest() throws InterruptedException {
		// Element which needs to drag (Bank)
		WebElement sourceLocator = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		// Element on which need to drop.(In 'Account' field)
		WebElement targetLocator = driver.findElement(By.xpath("//*[@id='bank']/li"));
		// We Use Actions class for drag and drop.
		Actions actions = new Actions(driver);
		// Dragged and dropped.
		actions.dragAndDrop(sourceLocator, targetLocator).build().perform();
		Thread.sleep(5000);
	}
	
	// Practice with Sales

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
