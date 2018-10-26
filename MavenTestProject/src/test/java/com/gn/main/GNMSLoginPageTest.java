package com.gn.main;

import org.junit.After;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GNMSLoginPageTest 
{
	
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.ie.driver","C:/Users/aboddu/Downloads/IEDriverServer_x64_3.14.0/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}


	@Test
	public void testGNMSTitlePage() throws InterruptedException
	{
		
		driver.navigate().to("http://127.0.0.1:7001/gnms/");
		String strPageTitle = driver.getTitle();
		assertThat(strPageTitle).isEqualToIgnoringCase("G N M S");
		
		
	}
		
	
	@After
	public void tearDown() 
	{
		if(driver!=null)
		{
			System.out.println("Closing IE browser");
			driver.quit();
		}
	}
}
