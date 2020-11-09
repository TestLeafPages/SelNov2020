package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		// Initial Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");

		// WebElement of the Select tag element
		// WebElement firstDropDown = driver.findElementById("dropdown1");

		// Create object for Select
		// Select dropDown1 = new Select(firstDropDown);

		// method to select a value using visible text
		// dropDown1.selectByVisibleText("Loadrunner");

		// method to select using value
		// dropDown1.selectByValue("1");

		// Select using index
		// dropDown1.selectByIndex(3);

		// webelement of combobox
		WebElement combo = driver.findElementByXPath("//div[@id='contentblock']/section[1]/div[6]/select[1]");

		Select multiSelect = new Select(combo);

		// To select multiple item
		multiSelect.selectByVisibleText("Selenium");
		//multiSelect.selectByVisibleText("Appium");
		multiSelect.selectByVisibleText("UFT/QTP");

		//multiSelect.deselectByVisibleText("Appium");

		// Interacting with second dropdown
		/*
		 * WebElement secondDropDown = driver.findElementByName("dropdown2"); Select
		 * dropDown2 = new Select(secondDropDown); dropDown2.selectByValue("1");
		 */

	}

}
