package testScroll;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetPosition {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println(defaultPosition); //(9, 9)
		Point p = new Point(-280,-100);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		
		Point p1 = new Point(-280,100);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p1);
	}

}
