package testng.day3;

import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestCases {
	
	@Test
	public void duplicateLead() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		String actualTitle = driver.getTitle();
		
		
		//Assert.assertEquals("Leaftaps", actualTitle);
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(actualTitle, "TestLeaf");
		
		
		
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		
		System.out.println("Last line of my code");
		
		softAssert.assertAll();
		
		/*
		 * if(actualTitle.equals("TestLeaf")) { System.out.println("test pass"); } else
		 * { System.out.println("test fail"); }
		 */
		
		

	}

}
