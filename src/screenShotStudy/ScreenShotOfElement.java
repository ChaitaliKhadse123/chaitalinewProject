package screenShotStudy;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class ScreenShotOfElement 
{
public static void main(String[] args) throws IOException
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		WebElement screenShot = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\DELL\\Desktop\\ChaitaliTestingNotes\\ScreenShotPractice\\test.jpg");
		FileHandler.copy(source, dest);
		}
}
