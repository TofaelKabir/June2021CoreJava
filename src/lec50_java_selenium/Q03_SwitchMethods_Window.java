package lec50_java_selenium;


import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// How to handle multiple windows in Selenium?
public class Q03_SwitchMethods_Window {
	ChromeDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2021/driver/chromedriver 2");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/browser-windows");
	
	}
	@Test (enabled = true, priority = 1)

	public void switchWindows() throws InterruptedException {
		String mainWindow = driver.getWindowHandle();
		System.out.println("Main Window ID: " + mainWindow + "\n");
		
		// Javascript executor is also used to scroll the page (here not necessary)
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)"); // in x axis 0, y axis 250

		driver.findElement(By.xpath("//button[text()='New Window']")).click();

		
		// How you handle windows parents to child? or how you can recongnize the parent and child window
		// Get all window handles
		Set <String> allWindowHandles = driver.getWindowHandles();
		System.out.println("Windows Open After Click: " + allWindowHandles.size());

		//Extract Parent and child window handle from all window handles
		String window1 = (String) allWindowHandles.toArray()[0];
		String window2 = (String) allWindowHandles.toArray()[1];

		//	Use window handle to switch from one window to other window
		driver.switchTo().window(window2);

	}
	


	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
