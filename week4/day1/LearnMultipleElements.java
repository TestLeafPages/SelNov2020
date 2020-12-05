package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMultipleElements {

	public static void main(String[] args) {
				// Pre Condition: Start ChromeDriver Server
				WebDriverManager.chromedriver().setup();
				
				// Step 1: Launch the chrome browser
				RemoteWebDriver driver = new ChromeDriver();
				
				// Step 2: Maximize the browser
				driver.manage().window().maximize();

				// Step 3: Load the URL (Leaftaps)
				driver.get("http://leaftaps.com/opentaps");
				
				//List<WebElement> listInput = driver.findElementsByTagName("input");
				
				//System.out.println(listInput.size());
		/*
		 * for (WebElement eachElement : listInput) {
		 * 
		 * String className = eachElement.getAttribute("class");
		 * System.out.println(className);
		 * 
		 * }
		 */
				
		/*
		 * List<WebElement> listLabel = driver.findElementsByTagName("label");
		 * 
		 * for (WebElement eachElement : listLabel) {
		 * 
		 * String text = eachElement.getText(); System.out.println(text);
		 * 
		 * }
		 */
				
		System.out.println(driver.findElementsByTagName("a").size());
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
