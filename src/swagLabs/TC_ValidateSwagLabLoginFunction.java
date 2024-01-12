package swagLabs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_ValidateSwagLabLoginFunction {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//create object of POM class
		SwagLabLoginPage login=new SwagLabLoginPage(driver);
		login.enterUserName();
		login.enterPassward();
		login.clickOnLoginButton();
		
		SwagLabInventoryPage inventory=new SwagLabInventoryPage(driver);
		inventory.addBackPackToCart();
		inventory.addTshirtToCart();
		inventory.clickOnCartButton();
		
	}

}
