package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
				// Pre Condition: Start ChromeDriver Server
				WebDriverManager.chromedriver().setup();
				
				// Step 1: Launch the chrome browser
				RemoteWebDriver driver = new ChromeDriver();
				
				// Step 2: Maximize the browser
				driver.manage().window().maximize();

				// Step 3: Load the URL (Leaftaps)
				driver.get("http://leafground.com/pages/table.html");
				
				//to find the number of rows
				List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");
				int rowsCount = rows.size();
				
				
				
				
				//traverse each row
				for (int i = 2; i <= rowsCount; i++) {
					
					//to find the number of cells
					List<WebElement> cells = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td");
					int cellCount = cells.size();
										
					//traverse each column
					for (int j = 1; j <= cellCount; j++) {
									
													
							String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
							
							System.out.println(text);
						
						
						
					}
					
				}
				
		/*
		 * if(driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").
		 * getText().equals(" ")){
		 * 
		 * boolean selected =
		 * driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+
		 * "]/input").isSelected(); if(selected) {
		 * System.out.println("checkbox is selected"); } else {
		 * System.out.println("checkbox is not selected"); }
		 * 
		 * }
		 */
				

	}

}
