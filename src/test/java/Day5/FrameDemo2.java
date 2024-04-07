package Day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo2 {

	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://ui.vision/demo/webtest/frames/");
	
	//frame1
	
	WebElement frm1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
	
	driver.switchTo().frame(frm1);
	
	driver.findElement(By.name("mytext1")).sendKeys("1111"); //webelemnet
	
	
	driver.switchTo().defaultContent(); // driver to default location of page
	
	
	//frame3 
	WebElement frm3=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
	
	driver.switchTo().frame(frm3); //webelemnet
	driver.findElement(By.name("mytext3")).sendKeys("3333");
	
	driver.switchTo().frame(0);   //index
	
	driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
	
	//frame 5
	
	driver.switchTo().defaultContent();
	
	
}
}