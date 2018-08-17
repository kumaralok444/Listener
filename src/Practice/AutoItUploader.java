package Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItUploader {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Alok%20%20Kumar/Desktop/file.html");
		driver.findElement(By.xpath("//input[@name='Resume']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\AutoIT\\fileupload.exe");
	}
	
}
