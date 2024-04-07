package Day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_demo {

	public static void main(String[] args) {

        ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); // max the window
		
		 //Explicit --declaration
		
		WebDriverWait mywait =new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		
		//Explicit --usage
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		driver.findElement(By.name("username")).sendKeys("Admin");

	   mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
	   
	   driver.findElement(By.name("password")).sendKeys("admin123");
	
	}}
