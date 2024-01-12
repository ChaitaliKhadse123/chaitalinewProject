package screenShotStudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEx1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		WebElement section = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File source = section.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\DELL\\Desktop\\ChaitaliTestingNotes\\ScreenShotPractice\\Stest.jpg");
		FileHandler.copy(source, dest);
	}

}
