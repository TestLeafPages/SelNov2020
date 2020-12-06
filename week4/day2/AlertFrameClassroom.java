package week4.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertFrameClassroom {

	public static void main(String[] args) {
		// Pre Condition: Start ChromeDriver Server
				WebDriverManager.chromedriver().setup();

				// Step 1: Launch the chrome browser
				RemoteWebDriver driver = new ChromeDriver();

				// Step 2: Maximize the browser
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				
				driver.switchTo().frame("iframeResult");
				
				driver.findElementByXPath("//button[text()='Try it']").click();
				
				Alert alert = driver.switchTo().alert();
				alert.sendKeys("Hari");
				alert.accept();
				
				String text = driver.findElementById("demo").getText();
				
				
				if(text.contains("Hari")) {
					System.out.println("The text contains my name");
				}else {
					System.out.println("The text do not contain my name");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
