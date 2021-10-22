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
public class Q04_SwitchMethods_Window {
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
		String mainHandle = driver.getWindowHandle();
		System.out.println("Main Window ID: " + mainHandle + "\n");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");

		driver.findElement(By.xpath("//button[text()='New Window']")).click();

		Set<String> allHandles = driver.getWindowHandles();
		System.out.println("Windows Open After Click: " + allHandles.size());

		for (String windowHandle : allHandles) {
			if (mainHandle.equals(windowHandle)) {
				System.out.println("\t Window ID 1: \t" + windowHandle + "\n \t URL: \t \t" + driver.getCurrentUrl()
						+ "\n \t Title: \t \t" + driver.getTitle());
			} else {
				driver.switchTo().window(windowHandle);

				System.out.println("\t Window ID 2: \t" + windowHandle + "\n \t URL: \t \t" + driver.getCurrentUrl()
						+ "\n \t Title: \t \t" + driver.getTitle());

			}
		}
	}

	


	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
