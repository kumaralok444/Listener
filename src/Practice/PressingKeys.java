package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PressingKeys {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.grazitti.com/resources/articles/handling-action-events-using-webdriver/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we=driver.findElement(By.id("mktoForm_1782"));
		we.sendKeys(Keys.ARROW_DOWN);
		//driver.switchTo().frame(we);
		//Actions a=new Actions(driver);
		//a.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0061')).perform();
	}
}
