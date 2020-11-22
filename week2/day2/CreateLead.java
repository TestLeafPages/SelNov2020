package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		// Pre Condition: Start ChromeDriver Server
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Step 2: Maximize the browser
		driver.manage().window().maximize();

		// Step 3: Load the URL (Leaftaps)
		driver.get("http://leaftaps.com/opentaps");

		// Step 4: Find the username field and enter the DemoSalesManager
		WebElement eleUserName = driver.findElementById("username");
		eleUserName.sendKeys("DemoSalesManager");

		// Step 5: Find the password field and enter the crmsfa
		driver.findElementById("password").sendKeys("crmsfa");

		// Step 6: Find the Login button and click on it
		 driver.findElementByClassName("decorativeSubmit").click();

		// Step 7: Confirm the login is successful !!
		String title = driver.getTitle();
		System.out.println("The title is " + title);

		// Step 8: Click on the CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();

		// Step 9: Click on the Create Lead Link
		driver.findElementByLinkText("Create Lead").click();

		// Step 10: Enter the Company Name and TAB
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");

		// Step 11: Enter the First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Babu");

		// Step 12: Enter the Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manickam");
		
		
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd1 = new Select(source);
		
		List<WebElement> sourceOptions = dd1.getOptions();
		
		sourceOptions.get(sourceOptions.size()-2).click();
		
		
		WebElement markCamp = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd2 = new Select(markCamp);
		List<WebElement> markCampOptions = dd2.getOptions();
		
		for (WebElement eachEle : markCampOptions) {
			
			eachEle.click();
			Thread.sleep(1000);
			
		}
		
		

		// Step 13: Click on the Create Lead Button (Enter)
		driver.findElement(By.name("submitButton")).sendKeys(Keys.ENTER);

		// Step 14: Print the title 
		String title2 = driver.getTitle();
		System.out.println(title2);

		// Step 8: Close the browser
		driver.close();

	}

}
