package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_demo {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); // max the window
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait 
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		

	}

}
