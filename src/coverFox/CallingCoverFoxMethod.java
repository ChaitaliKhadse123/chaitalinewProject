package coverFox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingCoverFoxMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		CoverFoxHomePage homePage=new CoverFoxHomePage(driver);
		homePage.clickOnFemaleButton();
		
		CoverFoxHealthPlanPage genderselection=new CoverFoxHealthPlanPage(driver);
		genderselection.clickOnNextButton();
		
		CoverFoxMemberDetailsPage ageSelection=new CoverFoxMemberDetailsPage (driver);
		ageSelection.handleAgeDropDown();
		ageSelection.clickOnNextButton();
		
		CoverFoxAddressDetailsPage address=new CoverFoxAddressDetailsPage(driver);
		address.enterPinCode();
		address.enterMobNum();
		address.clickOnContinueButton();
		
		Thread.sleep(10000);
		CoverFoxHealthPlanResultsPage planDetail=new CoverFoxHealthPlanResultsPage(driver);
		planDetail.validatePlanListWithResults();
		Thread.sleep(10000);
		driver.close();
	}

}
