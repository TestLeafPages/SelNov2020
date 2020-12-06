package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		// Pre Condition: Start ChromeDriver Server
		WebDriverManager.chromedriver().setup();

		// to disable browser notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);

		// Step 2: Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Step 3: Load the URL (Leaftaps)
		driver.get("https://www.snapdeal.com/");

		WebElement mensFashion = driver.findElementByXPath("(//span[contains(text(),'Men')])[2]");

		Actions builder = new Actions(driver);

		builder.moveToElement(mensFashion).perform();

		driver.findElementByXPath("(//span[text()='Shirts'])[2]").click();
		
		  driver.findElementByXPath("//input[@placeholder='Enter your pincode']").sendKeys("600128");
		  
		  driver.findElementByXPath("//button[text()='Check']").click();
		  
		  

		 	
		WebElement firstProductWishList = driver.findElementByXPath("//i[@class='sd-icon sd-icon-like-outline heart-icon animated-font-pre']");

		builder.moveToElement(firstProductWishList).perform();

		driver.findElementByXPath("//div[contains(text(),'Quick View')]").click();

	}

}
