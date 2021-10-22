package lec41_java_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_use_of_get_method {
// next time, gecko driver also need to be shown from the beginning. see lec36 O01 class
	public static void main(String[] args) throws InterruptedException {
		// System is a class and setProperty is a method
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/Downloads/chromedriver");
		// WebDriver is an interface and ChromeDriver is a concrete class
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // or fullscreen() method
		driver.get("https://www.amazon.com");
		// Thread is a class which has a method sleep(), which helps the webdriver to wait.
		Thread.sleep(4000);
		driver.quit();
	}

}
// hi
