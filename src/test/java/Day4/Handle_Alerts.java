package Day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handle_Alerts {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		//Alert --special class for handling the popups/alert window
		
	//	mywait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert =driver.switchTo().alert(); //driver moves to popup
		
	//	driver.switchTo().alert().accept();
				
		//accept()---- click ok
		//dismiss()----click cancle
		//getText()--- get the text of pop up
		
//		alert.accept(); ///this will click ok on pop up
//		
//              String text= driver.findElement(By.id("result")).getText();
//              
//              if(text.equals("You clicked: Ok"))
//            	  System.out.println("Test Passed");
//              else 
//            	  System.out.println("Test Failed");
		
		alert.dismiss(); ///this will click  cancel on pop up
               
		 String text= driver.findElement(By.id("result")).getText();
       
       if(text.equals("You clicked: Cancel"))
    	   
     	  System.out.println("Test Passed");
       else 
     	  System.out.println("Test Failed");
               
	}

}
