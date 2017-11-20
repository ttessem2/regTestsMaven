package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
@BeforeTest
	public void setUp(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PBS\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@Test
public String getTitle(){
	WebElement title= driver.findElement(By.xpath("/html/head/title"));
	return title.getText();
}

@Test
private void assertEquals(String string, WebElement title) {
	assertEquals("Google", title);
}

@Test
public void searchGoogle(){
	
	driver.findElement(By.id("lst-ib")).sendKeys("Java");
	
}
@AfterSuite
public void tearDown(){
	driver.quit();
}

}