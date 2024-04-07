package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Tag and ID     Tag#ID
//Tag and Class  Tag.class
//Tag and attribute  Tag[name="abc"]
//Tag, class and attribute   Tag.class[type="abc"]

public class Locatordemo3 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("http://www.automationpractice.pl/index.php");
		
		Thread.sleep(3000);
		//Tag and ID
	//	driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Tops");
		
		//Tag and Class 
		
	//	driver.findElement(By.cssSelector(".search_query")).sendKeys("Tops");
		
		//Tag and attribute 
		
	//	driver.findElement(By.cssSelector("input[placeholder=\"Search\"]")).sendKeys("Tops");
		
		//Tag, class and attribute
		
		driver.findElement(By.cssSelector("input.search_query[name=\"search_query\"]")).sendKeys("Tops");
		
	//	driver.close();

	}

}
