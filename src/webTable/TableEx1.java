package webTable;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v118.network.model.Headers;

public class TableEx1 {

	public static void main(String[] args) 
	{
		 // IdentifyWebTable 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.cricbuzz.com/cricket-series/6732/icc-cricket-world-cup-2023/points-table");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement bookTable = driver.findElement(By.name("BookTable"));
		
		//how many rows in table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int numbersOfRows=rows.size();
		System.out.println("Numbers of rows in table are "+numbersOfRows);
		 //how many columns in table 
		List<WebElement> headers = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		int numberOfColumns=headers.size();
		System.out.println("Numbers of columns in tables are "+numberOfColumns);
		
		//Output:
		//Numbers of rows in table are 7
		//Numbers of columns in tables are 4
		}
}
