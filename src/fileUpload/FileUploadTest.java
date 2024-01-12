package fileUpload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadTest {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		//how to use AutoIT tool for uploading ,download file
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement chosefilebtn = driver.findElement(By.id("file-upload"));
		Actions action =new Actions(driver);
		action.moveToElement(chosefilebtn).click().build().perform();
		Thread.sleep(3000);
		//Autoit script

		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\fileupPracChai31.exe"+" "+"C:\\Users\\DELL\\Desktop\\PRASHIKBHAURAOKHADSE.pdf");
		Thread.sleep(3000);
		driver.findElement(By.id("file-submit")).click();
		
//		ControlFocus("Open","","Edit1")
//		ControlSetText("Open","","Edit1",$CmdLine[1])
//		ControlClick("Open","","Button1")
	}
}
