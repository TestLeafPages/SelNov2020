package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// Pre Condition: Start ChromeDriver Server
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		RemoteWebDriver driver = new ChromeDriver();

		// Step 2: Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Step 3: Load the URL (Leaftaps)
		driver.get("http://leafground.com/pages/Alert.html");
		
		/*
		 * driver.findElementByXPath("//button[text()='Alert Box']").click();
		 * 
		 * //move the control to alert Alert alert = driver.switchTo().alert();
		 * 
		 * // to read the alert message String text = alert.getText();
		 * System.out.println(text);
		 * 
		 * Thread.sleep(2000);
		 * 
		 * //to click Ok alert.accept();
		 * 
		 * 
		 * driver.findElementByXPath("//button[text()='Confirm Box']").click();
		 * 
		 * //Alert alert2 = driver.switchTo().alert();
		 * 
		 * //alert2.dismiss();
		 * 
		 * driver.switchTo().alert().dismiss();
		 */
		
		
		//driver.findElementByXPath("//button[text()='Prompt Box']").click();
		
		/*
		 * Alert alert2 = driver.switchTo().alert();
		 * 
		 * alert2.sendKeys("TestLeaf software solutions"); Thread.sleep(5000);
		 * alert2.accept();
		 */
		
		
		driver.findElementById("btn").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='OK']").click();
		
		
		
		

	}

}
