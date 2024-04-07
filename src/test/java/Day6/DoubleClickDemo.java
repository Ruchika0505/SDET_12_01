package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	
		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");

			driver.switchTo().frame("iframeResult"); //name
			
			WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
			f1.clear(); //clear text
			f1.sendKeys("Welcome"); 
			
		WebElement	button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		Actions act=new Actions(driver);
	//perform double click on web element
		
		act.doubleClick(button).perform(); 
		
		//validation
		
		WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));
		//String text=f2.getText(); // return only inner text
		String text=f2.getAttribute("value"); // return value of mentioned attribute
		System.out.println(text);
		
		if(text.equals("Welcome"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
}}
