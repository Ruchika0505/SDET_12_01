package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_Of_Items {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
	List <WebElement> input=driver.findElements(By.tagName("input"));
	
	System.out.println("No of InputBox"	+ " " + input.size());
	
List <WebElement> links=driver.findElements(By.tagName("a"));
	
	System.out.println("No of Links"+  " " + links.size());
	
}}
