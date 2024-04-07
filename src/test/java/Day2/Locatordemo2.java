package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//className
//tag

//Three requirements:
//1) How many total no of sliders on the page.
//2) Find the total no of images available on the page.
//3) Find total no of links available on the page

public class Locatordemo2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		// total no of sliders on the page.
		
	List <WebElement> sliders =driver.findElements(By.className("homeslider-container"));
		
	System.out.println("The slider contains total images :" +sliders.size());
	
	//total no of images available on the page.--tag
	
	
	List<WebElement> image=driver.findElements(By.tagName("img"));
	System.out.println("Total no of images available on the page :" +image.size());
		
	//total no of links available on the page
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("Total no of images available on the page :" +links.size());
	
	driver.close();
		
	}

}
