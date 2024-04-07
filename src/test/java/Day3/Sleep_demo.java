package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sleep_demo {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);  //1sec---4sec
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(3000); 
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		
		
	}
}
