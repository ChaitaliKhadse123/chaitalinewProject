package swagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class SwagLabLoginPage
{
	//1.Variable--> WebElements
	
	@FindBy(name="user-name") private WebElement userNameField;
	
	@FindBy(name="password") private WebElement passwardField;
	
	@FindBy(name="login-button") private WebElement loginButton;
	
	//2. Constructor
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3. Methods
	
	public void enterUserName()
	{
		userNameField.sendKeys("standard_user");
	}
	
	public void enterPassward()
	{
		passwardField.sendKeys("secret_sauce");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}

}
