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

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {

		// Pre Condition: Start ChromeDriver Server
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Step 2: Maximize the browser
		driver.manage().window().maximize();

		// Step 3: Load the URL (Leaftaps)
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElementByXPath("//input").sendKeys("demosalesmanager");
		
		driver.findElementByXPath("//input[@type='password']").sendKeys("crmsfa");

		
	}

}
