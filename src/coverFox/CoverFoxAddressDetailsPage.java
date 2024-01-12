package coverFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage
{
	@FindBy(xpath="(//input[@type='number'])[1]")private WebElement pinCodeField;
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobNumField;
	@FindBy(xpath = "//div[text()='Continue']")private WebElement continueButton;
	
	public CoverFoxAddressDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterPinCode()
	{
		pinCodeField.sendKeys("445001");
	}
	
	public void enterMobNum()
	{
		mobNumField.sendKeys("9284834788");
	}

	public void clickOnContinueButton()
	{
		continueButton.click();
	}






}
