package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//POM class
//Test --validations
public class LoginPage {

	WebDriver driver; //global
	//Constructor
	
	LoginPage(WebDriver driver) //chorme,edge,
	{
		this.driver=driver;
	}
	
	
	//locate Element
	By logo=By.cssSelector("img[alt='company-branding']");
	By user_name =By.name("username");
	By pass_word=By.name("password");
	By clickbutton=By.xpath("//button[@type='submit']");
	
	//actions
	
	public void setUserName(String username)
	{
		driver.findElement(user_name).sendKeys(username);
	
	}
	 
	public void setPasswdName(String password)
	{
		driver.findElement(pass_word).sendKeys(password);
	}
	
	public void clicksumit()
	{
		driver.findElement(clickbutton).click();
	}
	
	public Boolean checkLogo()
	{
		Boolean status =driver.findElement(logo).isDisplayed();
		return status;
	}
	
	
}
