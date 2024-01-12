package testScroll;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetSize {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		Dimension defaultSize = driver.manage().window().getSize();
		System.out.println(defaultSize); //(1051, 806)
		Dimension d=new Dimension(90,1000);
		Thread.sleep(1000);
		driver.manage().window().setSize(d);
	}

}
