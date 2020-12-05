package week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI {

	public static void main(String[] args) {
		// Pre Condition: Start ChromeDriver Server
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		RemoteWebDriver driver = new ChromeDriver();

		// Step 2: Maximize the browser
		driver.manage().window().maximize();

		// Step 3: Load the URL (Leaftaps)
		/*
		 * driver.get("https://www.myntra.com/");
		 * 
		 * // WebElement eleMen = driver.findElementByLinkText("Men");
		 * 
		 * WebElement eleMen = driver.findElementByXPath("//a[text()='Men']");
		 * 
		 * 
		 * //create object for actions class Actions builder = new Actions(driver);
		 * 
		 * builder.moveToElement(eleMen).perform();
		 */
		
		
		  driver.get("http://leafground.com/pages/selectable.html");
		  
		  WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		  WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		  
		  Actions builder = new Actions(driver);
		  
		  builder.clickAndHold(item1).moveToElement(item4).release().perform();
		  
		/*
		 * builder .keyDown(Keys.CONTROL) //to press the key .click(item1) .click(item2)
		 * .keyUp(Keys.CONTROL) // to release the key in the keyboard .perform();
		 */
		  //builder.moveToElement(item1).doubleClick().perform();
		  //builder.doubleClick(item1).perform();
		  
		 // builder.contextClick(item1).perform();
		 
		
		
		/*
		 * driver.get("http://leafground.com/pages/drag.html");
		 * 
		 * WebElement source = driver.findElementById("draggable");
		 * 
		 * // WebElement target = driver.findElementById("droppable");
		 * 
		 * Actions builder = new Actions(driver);
		 * 
		 * //builder.dragAndDrop(source, target).perform();
		 * builder.dragAndDropBy(source, 100, 100).perform();
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
