package Day5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo {

	
		
		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
//		Set <String> windowids=driver.getWindowHandles();
		
	
		//Approach-1  List---arraylist,set
		
		/*List <String> al= new ArrayList(windowids); //set is converted into arrayList
		
		String parentwindowid = al.get(0);
		String childwindowid =  al.get(1);
		
		 driver.switchTo().window(childwindowid); //switching between the windows
		 
		 driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentwindowid);
		
		driver.findElement(By.name("username")).sendKeys("12345");*/
		
		
		//Approach-2
		Set <String> windowids=driver.getWindowHandles();
		
		/*for(String winid:windowids)
		{
			String title=driver.switchTo().window(winid).getTitle(); 
			
			
			if( title.equals("Human Resources Management Software | OrangeHRM)"))
			{
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click(); //click on contact sale
				Thread.sleep(3000);
				System.out.println(driver.getTitle());
			}
			
			else if(title.equals("OrangeHRM"))
			{
				driver.findElement(By.name("username")).sendKeys("12345");
				System.out.println(driver.getTitle());
			}}*/
		
		for(String winid:windowids)
		{
			String title=driver.switchTo().window(winid).getTitle(); 
			
			if( title.equals("Human Resources Management Software | OrangeHRM"))
			{
				driver.getTitle();
				driver.close();
			}
		
			else
			{
				Thread.sleep(2000);
				driver.findElement(By.name("username")).sendKeys("12345");
				System.out.println(driver.getTitle());
			}
				
		
		
	}

}}
