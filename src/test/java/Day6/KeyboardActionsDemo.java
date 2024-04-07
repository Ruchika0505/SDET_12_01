package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		
	driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to automation");
	
	Actions act=new Actions(driver);
	
	//cntrl+a
	
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	
//	act.keyDown(Keys.CONTROL)
//	   .sendKeys("a")
//	   .keyUp(Keys.CONTROL)
//	   .perform();
	
	//cntrl+c
	
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	
	//tab
	
	act.sendKeys(Keys.TAB);
	
	//cntrl+v
	
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

}
