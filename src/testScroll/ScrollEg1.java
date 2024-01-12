package testScroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollEg1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,7000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,2700)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-1000)");

	}

}
