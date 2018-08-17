package listenerPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgListenerExe {
	WebDriver driver;
	
@BeforeTest
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
}
@Test
public void testCase1() {
	
	driver.get("http://testng.org/doc/documentation-main.html#testng-listeners");
	driver.findElement(By.xpath("//a[@href='#loging-listeners']")).click();
}
@AfterTest
public void tearDown() {
	
}
public WebDriver getDriver() {
	return driver;
}
}
