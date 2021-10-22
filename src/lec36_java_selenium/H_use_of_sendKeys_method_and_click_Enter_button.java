package lec36_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class H_use_of_sendKeys_method_and_click_Enter_button {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/Downloads/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
	}

	// "Search" any item by sending value in search field and clicking the "Search"
	// button from webPage
	@Test(enabled = true, priority = 1)
	public void searchItemByclickingSearchButtonTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Black Sneakers");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();

	}

	// "Search" any item by sending value in search field and clicking "Enter"
	// button from keyboard
	@Test(enabled = true, priority = 2)
	public void searchItemByclickingEnterButtonTest() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop", Keys.ENTER);
	}

	@AfterTest
	public void tearUp() {
		driver.quit(); // To close all the opened WebDriver instances
	}

}
