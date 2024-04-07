package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboarddemo1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
        driver.findElement(By.xpath("//input[@id='target']"));
        
        Actions act=new Actions(driver);
        
        act.sendKeys("a").perform();
        
       String text= driver.findElement(By.xpath("//p[@id='result']")).getText();
       
        
        
        if(text.equals("You entered: A"))
        	System.out.println("Test passed");
        else
        	System.out.println("Test Failed");
		

	}

}
