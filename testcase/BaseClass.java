package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import testng.day2.ReadExcel;

public class BaseClass {
	
	public ChromeDriver driver;
	
	public String excelFileName;
	
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		ReadExcel re = new ReadExcel();
		String[][] data = re.readData(excelFileName);
			
		return data;

	}
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void login(String url, String username, String password) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();

	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();

	}
	
	
	
	

}
