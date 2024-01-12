package swagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInventoryPage
{
	//1. variables

	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt") private WebElement tShirtButton;
	@FindBy(id="add-to-cart-sauce-labs-backpack") private WebElement backPackButton;
	@FindBy(id="shopping_cart_container") private WebElement cartButton;
	//2. Constructor
	
	public SwagLabInventoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3. Methods
	
	public void addTshirtToCart()
	{
		tShirtButton.click();
	}
	
	public void addBackPackToCart()
	{
		backPackButton.click();
	}
	
	public void clickOnCartButton()
	{
		cartButton.click();
	}
	
	
}
