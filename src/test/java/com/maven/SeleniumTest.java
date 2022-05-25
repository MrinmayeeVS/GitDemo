package com.maven;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	// Trigger TestNG xml file from Maven
	// How to execute all TCs from test folder - mvn test
	
	@Test
	public void BrowserAutomation()
	{
		System.out.println("BrowserAutomation");
	}
	
	@Test
	public void elementsUI()
	{
		System.out.println("elementsUI");
	}
	
	

}
