package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {
		// Pre Condition: Start ChromeDriver Server
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		RemoteWebDriver driver = new ChromeDriver();

		// Step 2: Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Step 3: Load the URL (Leaftaps)
		
		/*
		 * driver.get("https://dev68594.service-now.com/");
		 * 
		 * //driver.findElementById("Click").click();
		 * 
		 * //switch to frame using id / name
		 * 
		 * driver.switchTo().frame("gsft_main123");
		 * 
		 * //switch to frame using index driver.switchTo().frame(0);
		 * 
		 * 
		 * driver.findElementById("user_name").sendKeys("admin");
		 */
		 
		
		
		  driver.get("http://leafground.com/pages/frame.html");
		  
		  //locate the iframe 
		  WebElement firstFrame = driver.findElementByXPath("(//div[@id='wrapframe']/iframe)[1]");
		  
		  //switch to frame using WebElement 
		  driver.switchTo().frame(firstFrame);
		  
		  driver.findElementById("Click").click();
		  
		  //to move to the main window
		  
		  driver.switchTo().defaultContent();
		  String text = driver.findElementByTagName("h1").getText();
		  System.out.println(text);
		 
		
		
		
		
		
		
		
		

	}

}
