package swagLabs;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC01 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement userName = driver.findElement(By.name("user-name"));
		WebElement passward = driver.findElement(By.name("password"));
		WebElement ClickButton = driver.findElement(By.name("login-button"));
		userName.sendKeys("standard_user");
		passward.sendKeys("secret_sauce");
		ClickButton.click();
		
		WebElement backpack = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		
		//WebElement bikeLight = driver.findElement(By.name("add-to-cart-sauce-labs-bike-light"));
		
		backpack.click();
		//bikeLight.click();
		
		WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
		cartButton.click();
		
		 List<WebElement> cartItems = driver.findElements(By.className("inventory_item_name"));
		System.out.println("Number Of Items are = "+cartItems.size());
		
		for( WebElement ci:cartItems)
		{
			System.out.println("Items are = "+ci.getText());
		}
		
		//validate item is same as what we want
		
		Iterator<WebElement> it=cartItems.iterator();
		WebElement itemNum1=it.next();
		
		if(itemNum1.getText().equals("Sauce Labs Backpack"))
		{
			System.out.println("Selected item is correct as ==> Sauce Labs Backpack");
			driver.findElement(By.name("checkout")).click();
		}
		else
		{
			System.out.println("Selected item is not correct");
		}
		//put your name,lastName and zip code
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		WebElement lastName = driver.findElement(By.name("lastName"));
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		WebElement continueButton = driver.findElement(By.name("continue"));
		
		firstName.sendKeys("chaitali");
		lastName.sendKeys("khadse");
		postalCode.sendKeys("445001");
		continueButton.click();
		
		WebElement finishButton = driver.findElement(By.id("finish"));
		finishButton.click();
		WebElement thankYouMsg = driver.findElement(By.xpath("//h2[text()='Thank you for your order!']"));
		if(thankYouMsg.getText().equals("Thank you for your order!"))
		{
			System.out.println("Thank you msg is displyed......Logging out");
			driver.findElement(By.id("react-burger-menu-btn")).click();
			Thread.sleep(500);
			driver.findElement(By.id("logout_sidebar_link")).click();
		}
		else
		{
			System.out.println("Thank you msg is displyed......Logging out");
		}
	}
}
