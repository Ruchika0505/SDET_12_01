package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM_Login {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver =new ChromeDriver(); //open the browser 
		
		//ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //pass the url
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(3000);
		driver.findElement(By.className("oxd-button")).click();
		
		
	String act_value =	driver.getTitle(); //string value
	
	String exp_value="OrangeHRM";
	
	if(act_value.equals(exp_value))
	{
		System.out.println("Test is Passed");
	}
	else
	{
		System.out.println("Test is Failed");
	}
			
   driver.close(); //close the browser
	
	}
}
