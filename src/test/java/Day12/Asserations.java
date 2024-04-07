package Day12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserations {
	
	@Test
	void test() //methods passed
	{
	
//		int x=10;
//		int y=40;
//		
//		if(x==y)
//			System.out.println("Test is passed");
//		else
//			System.out.println("Test is Failed");
		
		//Assert.assertEquals(x,y); //hard asserations
		//Assert.assertEquals(true); //passed
		//Assert.assertEquals(false); //failed
		
	//	Assert.assertTrue(true); //pass
	//	Assert.assertTrue(false); //fail
		
//		int a=30;
//		int b=20;
//		
//		//Assert.assertEquals(actual, excepeted,description);
//		Assert.assertEquals(a>b,true,"a is not smaller than b"); //false
//			
//		String a1="abc";
//		String b1="abc";
//		
//		Assert.assertEquals(a1,b1,"Both value must be equal"); //passed
//		
		
		if(true)
			Assert.assertTrue(true);
		else
			//Assert.assertFalse(false);
		Assert.fail();
		
	}
	

}
