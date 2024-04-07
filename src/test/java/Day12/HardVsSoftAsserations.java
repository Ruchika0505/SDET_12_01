package Day12;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAsserations {

	//@Test
	void HardAsseration()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		Assert.assertTrue(false);//failed
		
		System.out.println("This is the example of hard asseration");
		
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test
	void SoftAsseration()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		SoftAssert sa=new SoftAssert(); //required
		
		sa.assertTrue(false); //fail
		
		System.out.println("This is the example of soft asseration");
		
		sa.assertTrue(true);
		sa.assertTrue(true);
		sa.assertTrue(true);
		
		sa.assertAll(); // required 
	}
	
}
