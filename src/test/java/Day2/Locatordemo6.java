package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Locatordemo6 {

	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://automationbookstore.dev/");
		
		WebElement book6=driver.findElement(By.id("pid6"));
		
		String book5 =driver.findElement(RelativeLocator.with(By.tagName("li")).near(book6)).getText();
		System.out.println(book5);

		driver.close();
}
}