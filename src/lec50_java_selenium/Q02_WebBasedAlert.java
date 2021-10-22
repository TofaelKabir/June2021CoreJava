package lec50_java_selenium;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

// Also called Browser Based alert or Javascript Alert
// Generally called it Alert
public class Q02_WebBasedAlert {
	ChromeDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadsharkar/eclipse-workspace/CoreJavaJune2021/driver/chromedriver 2");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
	
	}
	@Test (enabled = true, priority = 1)

	public void alertWindow() throws Exception{
		// driver.findElement(By.xpath("//*[@id='content']/button")).click(); // i will explain this xpath
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();	
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		String print = alert.getText();
		System.out.println(print);
		
		//if we want to dismiss the alert, first click the try it button and then dismiss
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		alert.dismiss();
	
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
