package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// Pre Condition: Start ChromeDriver Server
				WebDriverManager.chromedriver().setup();

				// Step 1: Launch the chrome browser
				RemoteWebDriver driver = new ChromeDriver();

				// Step 2: Maximize the browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				driver.get("http://leafground.com/pages/Window.html");
				
				String firstWinHandle = driver.getWindowHandle();
				
				
				
				System.out.println(firstWinHandle);
				
				System.out.println("**********************************************");
				
				//to print the title before new window
				System.out.println(driver.getTitle());
				
				driver.findElementById("home").click();
				
				
				Set<String> windowHandles = driver.getWindowHandles();
				
				for (String eachHandle : windowHandles) {
					System.out.println(eachHandle);
					
				}
				
				List<String> listOfHandles = new ArrayList<String>(windowHandles);
				
				String secondWinHandle = listOfHandles.get(1);
				
				//need to pass the new window handle to switch the control
				driver.switchTo().window(secondWinHandle);
				
				
				//print the title after new window got opened
				System.out.println(driver.getTitle());
				
				//to close the current window
				driver.close();
				
				driver.switchTo().window(listOfHandles.get(0));
				
				System.out.println(driver.getTitle());
				
				//to close all the windows
				//driver.quit();
				
				
	}

}
