package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameDemo1 {

		public static void main(String[] args) {
	
			ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello Frames");
		
		//Approach-1 using id or name 
		//driver.switchTo().frame("frm1");  //locating frame with id/name
		
		//Approach-2 using WebElement 
		
		WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frm1']"));
		driver.switchTo().frame(frame1);
		
		WebElement drp=driver.findElement(By.xpath("//select[@id='course']"));
		
		Select drpdwn=new Select(drp);
		drpdwn.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Byeee Frames");

	}

}
