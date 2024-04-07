package Day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//	System.out.println("The title of the page is :" +  driver.getTitle());
//	
//	System.out.println(	"The url of the page is :" + driver.getCurrentUrl());
//	
//	System.out.println("The HTML code is :");
//	
//	
//	System.out.println(driver.getPageSource());
		
//		String windowid=driver.getWindowHandle();
//		
//		System.out.println("The window id is :" + windowid) ; //8C042020A7883B0FF19810FE7F60BB69

		Thread.sleep(3000);
		
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click(); //will open the web page 
		
	Set <String> windowids=driver.getWindowHandles();
	
	for(String winids:windowids)
	{
		System.out.println(winids);
	}
	driver.close();
	}
}
