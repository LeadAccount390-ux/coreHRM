package com.util;

import org.testng.Assert;

public class TestNGUtils {
		
	public static void  assertfail(String message)
	{
		
	}
		//method checks if actual string contains the excepted string
		public static void  assertTrue(String actual,String expected)
		{
			if(actual.contains(expected)) {
				Assert.assertTrue(actual.contains(expected));
				}else {
					System.out.println(expected+"not present in "+actual);
				}
		}

		
}
