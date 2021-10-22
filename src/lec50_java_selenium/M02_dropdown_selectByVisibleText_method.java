package lec50_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class M02_dropdown_selectByVisibleText_method {

	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/Downloads/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
	}

	// use of selectByVisibleText() method -- most commonly used among 3 methods
	@Test(enabled = true, priority = 1)
	public void selectByVisibleTextTest() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Music");
		Thread.sleep(5000);
		// TODO I want to print the outcome
	}



	@AfterTest
	public void tearUp() {
		driver.quit(); // To close all the opened WebDriver instances
	}

}
