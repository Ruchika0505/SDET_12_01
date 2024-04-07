package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_Items {

	public static void main(String[] args) {
		
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			List <WebElement> items =driver.findElements(By.xpath("//*[@name=\"email\"]//following::*"));
			
			System.out.println(items.size()); 
			
		 
	
	}
}
