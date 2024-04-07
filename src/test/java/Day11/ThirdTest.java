package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdTest {
	
	 ChromeDriver driver; //global
  @Test(priority=10)
  public void OpenApp() {
  driver=new ChromeDriver(); //local variable
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  
  }
  
  @Test(priority=20)
  public void Login() {
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("Admin");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  	  
  }
  @Test(priority=50)
  public void CloseApp() {
	  
	  driver.close();
  }
}
