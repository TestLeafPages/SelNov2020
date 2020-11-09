package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
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
		System.out.println("The title is "+title);
		
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
		
		// Step 13: Click on the Create Lead Button (Enter)
		driver.findElement(By.name("submitButton")).sendKeys(Keys.ENTER);
		
		// Step 14: Print the title
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		// Step 8: Close the browser
		//driver.close();
		
		

	}

}
