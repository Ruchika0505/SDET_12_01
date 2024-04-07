package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_DropDownWithOutSelectTag {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		
 List <WebElement> list =driver.findElements(By.xpath("//*[contains(@class,\"multiselect\")]//li//a//label"));
    
 System.out.println("The total elements in dropdrop are :" +list.size());
 
 System.out.println("The elements are:");
 
 for(int i=0;i<list.size();i++)
 {
	System.out.println( list.get(i).getText());
 }
 
// for(WebElement li:list)
// {
//	System.out.println( li.getText());
// }
// 
 // select the option from dropdown
 
// for(int i=0;i<list.size();i++)
// {
//	if(list.get(i).getText().equals("Python"))
//	{
//		list.get(i).click();
//	     break;
//	}
// }

// for(int i=0;i<list.size();i++)
// {
//	String OptionName= list.get(i).getText();
//	
//	if(OptionName.equals("Java") || OptionName.equals("Python"))
//	{
//		list.get(i).click();
//	}
// }
 
 for(WebElement li:list)
 {
	 String OptionName= li.getText();
	 if(OptionName.equals("Java") || OptionName.equals("Python"))
	 {
		 li.click();
	 }
 }
	
	}

}
