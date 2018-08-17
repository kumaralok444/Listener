package Practice;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class First {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(1,TimeUnit.SECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		WebElement we=wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver arg) {
				WebElement ele=arg.findElement(By.xpath("//p[@id='demo']"));
				if(ele.getAttribute("innerHTML").equalsIgnoreCase("WebDriver")) {
					System.out.println("Value is>>>"+ele.getAttribute("innerHTML"));
					return ele;
				}
				else {
					System.out.println("Value is>>>"+ele.getAttribute("innerHTML"));
					return null;
				}
			}
		});
		System.out.println("Final visible status is:"+we.isDisplayed());
	}

}
