package Day3;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigational_cmds {

	public static void main(String[] args) throws MalformedURLException {

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); // max the window
		
		
		//driver.get("https://www.amazon.in/");
		
	//	driver.navigate().to("https://www.amazon.in/"); //method-1
		
		
		URL url =new URL("https://www.amazon.in/");
		
	    driver.navigate().to(url);  //method-2
	    
	  System.out.println(  driver.getCurrentUrl()); //https://www.amazon.in/
	    
	    
	    driver.get("https://www.flipkart.com/");
	    
	    System.out.println(  driver.getCurrentUrl()); //https://www.flipkart.com/
	    
	    driver.navigate().back();
	    
	    System.out.println(  driver.getCurrentUrl()); // https://www.amazon.in/
	    
	   driver.navigate().forward();
	   
	   System.out.println(  driver.getCurrentUrl()); //https://www.flipkart.com/
	   
	   driver.navigate().refresh(); //refresh the page 
	   
	   driver.close();
	
}}
