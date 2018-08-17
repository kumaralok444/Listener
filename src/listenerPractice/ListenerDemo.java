package listenerPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ListenerDemo {
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	EventFiringWebDriver event=new EventFiringWebDriver(driver);
	ActivityCapture handle=new ActivityCapture();
	event.register(handle);
	event.navigate().to("http://testng.org/doc/documentation-main.html");
	event.findElement(By.linkText("3 - testng.xml")).click();
	event.quit();
	event.unregister(handle);
}
}
