package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//id
//name
//LinkedText
//PartialLinkedText
//ClassName
//TagName

public class Locatordemo1 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirt"); //locator-id
		
//	WebElement button =	driver.findElement(By.name("submit_search")); //locating the element
//		
//		button.click();
//		
		driver.findElement(By.name("submit_search")).click(); ////locator-name
		
		//to capture the text of the link
		
		//driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		
		driver.findElement(By.partialLinkText("Faded Short")).click();
		
		System.out.println("Successfully Executed --Script Passed");
	
		driver.close();
		
		
		
	}
}
