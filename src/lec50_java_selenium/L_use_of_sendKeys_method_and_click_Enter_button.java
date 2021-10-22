package lec50_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class L_use_of_sendKeys_method_and_click_Enter_button {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/Downloads/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
	}

	// "Search" any item by sending value in search field and clicking the "Search"
	// button from webPage
	@Test(enabled = false, priority = 1)
	public void searchItemByclickingSearchButtonTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Black Sneakers");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
	}

	// Alternative of sending value in text field --- By using JavascriptExecutor 01
	// TODO Failed, have to look again. doom is not loading
	@Test(enabled = true, priority = 2)
	public void searchItemByclickingSearchButtonTest02() throws InterruptedException {
		WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Macbook' ", searchField);
		Thread.sleep(4000);
		js.executeAsyncScript("arguments[0].click()", searchButton);
		Thread.sleep(4000);
	}

	// Alternative of sending value in text field --- By using JavascriptExecutor 02
	// Use above one, this one I don't like
	@Test(enabled = false, priority = 3)
	public void searchItemByclickingSearchButtonTest03() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('twotabsearchtextbox').value = 'iPad';");
		Thread.sleep(4000);
		js.executeScript("document.getElementById('nav-search-submit-button').click();");
		Thread.sleep(4000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit(); // To close all the opened WebDriver instances
	}

}
