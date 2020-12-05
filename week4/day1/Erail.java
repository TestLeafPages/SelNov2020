package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		// Pre Condition: Start ChromeDriver Server
		WebDriverManager.chromedriver().setup();

		// Step 1: Launch the chrome browser
		RemoteWebDriver driver = new ChromeDriver();

		// Step 2: Maximize the browser
		driver.manage().window().maximize();

		// Step 3: Load the URL (Leaftaps)
		driver.get("https://erail.in/");

		// clear, type and tab for fromStation
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms");
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);

		// clear, type and tab for toStation
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu");
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		
		
		//to uncheck the sortOnDate
		driver.findElementById("chkSelectDateOnly").click();
		
		Thread.sleep(2000);
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		
		int rowsCount = rows.size();
		
		
		List<String> listNames = new ArrayList<String>();
		
		
		for (int i = 1; i <= rowsCount; i++) {
			
			String trainName = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
			listNames.add(trainName);
			
		}
		
		Set<String> setNames = new LinkedHashSet<String>(listNames);
		
		
		if(listNames.size()==setNames.size()) {
			System.out.println("No duplicate train names");
		}
		else {
			System.out.println("There are duplicate train names");
		}
		
		
	

	}

}
