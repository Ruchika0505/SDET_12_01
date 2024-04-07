package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


//Test Case
//-------------
//1) Open Web Browser(Chrome/IE/firefox).
//2) Open URL  https://demo.guru99.com/test/newtours/index.php 
//3) Enter username  (Admin).
//4) Enter password  (admin123).   
//5) Click on Login.
//6) Capture title of the home page.
//7) Verify title of the page: OrangeHRM 
//8) Close browser

public class Mercury_Login {

	public static void main(String[] args) {
	
		//System.setProperty(null, null) //for chrome driver path
	//	System.setProperty("webdriver.chrome.driver", "D:\\Drivers_2023_SDET\\chromedriver-win32\\chromedriver.exe");
	
	//WebDriverManager.chromedriver().setup();// chormedriver--4.5 //v-4.6
	// WebDriver-- Interface-- OBJECT OF INTERFACE IS NOT ALLOWED
		
		WebDriver driver =new ChromeDriver(); //open the browser 
		
		//ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/index.php"); //pass the url
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		driver.findElement(By.name("submit")).click();
		
	String act_value =	driver.getTitle(); //string value
		
	String	exp_value="Login: Mercury Tours";
	
	
	if(act_value.equals(exp_value))
	{
		System.out.println("Test is Passed");
	}
	else
	{
		System.out.println("Test is Failed");
	}
		
		
   driver.close(); //close the browser
		
		
		
	}

}
