package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//How to select single checkbox.
//How to select multiple checkboxes
//How to select first three checkboxes
//How to select last three checkboxes

public class Handle_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		

		//How to select single checkbox.
		
	//	driver.findElement(By.id("monday")).click();
		
		//Count the no of options available in checkbox
		
	List <WebElement> checkboxes=driver.findElements(By.xpath("//*[@class=\"form-check-input\"][@type='checkbox']"));
		
	System.out.println("The no. of checkboxes are: " +checkboxes.size()); //7
	
		// Select all the check-boxes
	
//	for(int i=0;i<checkboxes.size();i++)
//	{
//		checkboxes.get(i).click();
//	}
	
//	for(WebElement chk:checkboxes)
//	{
//		chk.click();
//	}
	
	// Select last two checkboxes
	
//	for(int i=5;i<checkboxes.size();i++)
//	{
//		checkboxes.get(i).click();
//	}
//	
//	//select first two checkboxes
//	
//	for(int i=0;i<2;i++)
//	{
//		checkboxes.get(i).click();
//	}
	
//	unchecked /clear all checkboxes
//	
//	for(int i=0;i<checkboxes.size();i++)
//		{
//			checkboxes.get(i).click();
//		}
//	
//	Thread.sleep(3000);
//	
//	for(int i=0;i<checkboxes.size();i++)
//	{
//		checkboxes.get(i).click();
//	}
//	
	//un-select the first three checkboxes
	
//	for(int i=0;i<2;i++)
//	{
//		checkboxes.get(i).click();
//	}
//
//	Thread.sleep(3000);
//
//	for(int i=0;i<2;i++)
//	{
//	checkboxes.get(i).click();
//	}
	
	//requirement is only to un-select if the check box is selected
	
	for(int i=0;i<2;i++)
		{
			checkboxes.get(i).click();
		}
	
	Thread.sleep(3000);
	
	for(int i=0;i<checkboxes.size();i++)
	{
		if(checkboxes.get(i).isSelected())
		{
			checkboxes.get(i).click();
		}
	}
	
	
	}

}
