package webTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableEx2 {

	public static void main(String[] args) 
	{
		// IdentifyWebTable 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 //only one header reading 
		String text1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[1]/th[2]")).getText();
		System.out.println(text1);
		 
		//whole row of header 
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th"));
		System.out.println("========================================");
	for(WebElement th:tableHeader)
	{
		System.out.print(th.getText()+" ");
	}
	System.out.println();
	System.out.println("====================================");
	
	//print only one data form table 
	WebElement singleElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[3]"));
	
	System.out.println(singleElement.getText());
	System.out.println("====================================");
	//how to read complete row from table 
	 List<WebElement> row3 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]/td"));
	for(WebElement r:row3)
	{
		System.out.print(r.getText()+" ");
	}
	System.out.println();
	System.out.println("===============================");
	//read complete single column
	for(int i=2;i<=7;i++)//2
	{
		WebElement data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td[4]"));
		{
		System.out.println(data.getText());
		}		
	}
	System.out.println("==================================");
	}
}

/*
Author
========================================
BookName Author Subject Price 
====================================
Selenium
====================================
Learn Java Mukesh Java 500 
===============================
300
500
300
3000
2000
1000
==================================
*/




























