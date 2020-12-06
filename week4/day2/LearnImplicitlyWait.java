package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		// Pre Condition: Start ChromeDriver Server
				WebDriverManager.chromedriver().setup();

				// Step 1: Launch the chrome browser
				RemoteWebDriver driver = new ChromeDriver();

				// Step 2: Maximize the browser
				driver.manage().window().maximize();

				// Step 3: Load the URL (Leaftaps)
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//implicitly wait
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				
				//Thread.sleep(5000);
				
				driver.findElementById("username").sendKeys("demosalesmanager");

	}

}
