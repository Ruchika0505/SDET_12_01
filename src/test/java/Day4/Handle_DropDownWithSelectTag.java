package Day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handle_DropDownWithSelectTag {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
	WebElement dd=driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
		
		
		Select drp=new Select(dd); //dropdown
		
		// Selecting an option from drop down
		
//		drp.selectByVisibleText("India");
		
      	drp.selectByIndex(4);
		
	//	drp.selectByValue("4"); //value attribute 
		
      	Thread.sleep(4000);
      	
      WebElement state=driver.findElement(By.id("state-list"));
		
		Select drp1=new Select(state); //dropdown
		
		drp1.selectByIndex(3);
		
		//Total no of options in dropdown
		
//		List <WebElement> options=drp.getOptions();
//		
//	 System.out.println(options.size());
//		
//	 
//	 // print option on console
//	
////	 for(int i=0;i<options .size();i++)
////	 {
////		System.out.println( options.get(i).getText());
////	 }
//	 
//	 for(WebElement op:options)
//	 {
//	System.out.println(	op.getText());
//	  }
//	 
//	 
//		Thread.sleep(5000);
//		driver.close();
		
		
	}

}
