package lec50_java_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Q01_AuthenticationPopUp {
	ChromeDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2021/driver/chromedriver 2");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String userName = "admin";
		String password = "admin";
		// adding username, password with URL
		String url = "https://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
	}
	@Test (enabled = true, priority = 1)
	public void authenticationPopUpTest() throws InterruptedException {
		Thread.sleep(5000);
		// identify and get text after authentication of popup
		String t = driver.findElement(By.cssSelector("p")).getText();
		System.out.println("Text is: " + t);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
