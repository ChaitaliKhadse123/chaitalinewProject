package screenShotStudy;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
public class ScreenShotFull {
public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\DELL\\Desktop\\ChaitaliTestingNotes\\ScreenShotPractice\\testEg.jpg");
		FileHandler.copy(source, dest);
	}

}
