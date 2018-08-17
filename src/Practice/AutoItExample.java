package Practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoItExample {
public static void main(String[] args) throws IOException {
	WebDriver driver;
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver64.exe");
	driver=new FirefoxDriver();
	Runtime.getRuntime().exec("D:\\AutoIT\\WinAuth.exe");
	driver.get("https://www.engprod-charter.net/");
	
	
	
}
}
