package Day5;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElementDemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click(); //login
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click(); //PIM
		
		driver.findElement(By.xpath("//div[6]/div/div[2]/div/div/div[1]")).click(); //arrow
	
	
		List <WebElement>options =	driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println(options.size());
		
		for(WebElement op:options)
		{
			//System.out.println("The hidden options are:"  +op.getText());
			
			if(op.getText().equals("HR Manager"))
			{
				op.click();
				break;
			}
		}
			
}}
