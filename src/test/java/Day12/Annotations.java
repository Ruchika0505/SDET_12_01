package Day12;

import org.testng.annotations.*;

public class Annotations {

	@AfterSuite
	public void logout()
	{
			System.out.println("This is After Suite....");			
	}
	
	@Test(priority=1)
	public void Search()
	{
			System.out.println("Search Functionality....");
				
	}
	
	@Test(priority=2)
	public void AdvancedSearch()
	{
		System.out.println("Advanced Search Functionality....");
				
	}
	
	
}
