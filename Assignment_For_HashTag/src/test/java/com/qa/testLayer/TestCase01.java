package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TestCase01 extends TestBase{

	@Test
	public void Click_On_ApplyNow()
	{
		login.enterName("Vishal Khade");
		login.enterEmail("vishalkhade9288@gmail.com");
		login.enterPhone("9545171623");
		login.enterDescription("A detail Oriented Professional with 2 year and 6 months of Experience in Software Testing\r\n"
				+ "which includes Manual and Automation Testing.");
		login.cliclOnApplyNow();
	}
}
