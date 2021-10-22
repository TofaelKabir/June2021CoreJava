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

// Alert should be discussed before it
// The below web site also have same feature to practice
// https://chercher.tech/practice/practice-pop-ups-selenium-webdriver
public class I02_use_of_right_click_action {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2021/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");		
	}
	
	@Test(enabled = true, priority = 1)
	public void rightClickAction() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement rc = driver.findElement(By.xpath("//span[text()='right click me']"));
		actions.contextClick(rc).build().perform(); // to do the right click, contextClick() is used
		
		// Next: I want to click on Edit link on the displayed menu options
		WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
		Thread.sleep(5000);
		edit.click(); // a regular click , not a right click
		Thread.sleep(5000);
		
		// Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("\nAlert Text:" + alert.getText());
		alert.accept();	
	}
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
