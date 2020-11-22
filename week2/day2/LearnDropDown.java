package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		// Initial Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		//locate the select tag / parent element of the dropdown
		WebElement dropDown1 = driver.findElementById("dropdown1");
		
		//select using sendkeys
		//driver.findElementById("dropdown1").sendKeys("Appium");
		
		//create object for the Select class
		Select dd = new Select(dropDown1);
		
		//to get all the child WebElement into a List
		List<WebElement> options = dd.getOptions();
		
		//to get the number of items in a list
		System.out.println(options.size());
		
		for (WebElement eachElement:options) {
			
			eachElement.click();
			Thread.sleep(2000);
			
		}
		
		//to get single item / element from the list
		//options.get(2);
		
		//to select last item
		//options.get(options.size()-1).click();
		
		/*
		 * for (int i = 1; i < options.size(); i++) {
		 * 
		 * options.get(i).click(); Thread.sleep(2000);
		 * 
		 * }
		 */
		
		
		
		//dd.selectByVisibleText("Appium");
		//dd.selectByIndex(3);
		//dd.selectByValue("3");

		

	}

}
