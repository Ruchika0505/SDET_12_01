package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//isDisplay()
//IsEnabled()
//isSelected
public class Conditional_method {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		WebElement Register =driver.findElement(By.xpath("//h1[normalize-space()='Register']"));
		
	Boolean	Display =Register.isDisplayed();
	System.out.println("The Register Text is available: "  +Display);
	
	
	WebElement TextBox1=driver.findElement(By.cssSelector("#FirstName"));
	
	System.out.println("The TextBox1 is visible :" +  "    "+TextBox1.isDisplayed());
	System.out.println("The TextBox1 is enabled :" +  "    "+TextBox1.isEnabled());
	
	
	WebElement MRadioButton=driver.findElement(By.xpath("//input[@id='gender-male']"));
	System.out.println("The Male Radio Button is visible :" +  "    "+ MRadioButton.isDisplayed());
	System.out.println("The Male Radio Button is enabled :" +  "    "+ MRadioButton.isEnabled());
	
	MRadioButton.click();
	
	
	System.out.println("The Male Radio Button is selected :" +  "    "+ MRadioButton.isSelected());
	
	
	WebElement FRadioButton=driver.findElement(By.xpath("//input[@id='gender-female']"));
	System.out.println("The Female Radio Button is visible :" +  "    "+ FRadioButton.isDisplayed());
	System.out.println("The Female Radio Button is enabled :" +  "    "+ FRadioButton.isEnabled());
	System.out.println("The Female Radio Button is selected :" +  "    "+ FRadioButton.isSelected());
	
	
	driver.close();
	}
}
