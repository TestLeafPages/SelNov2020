package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseClass{

	@Test(dataProvider = "fetchData")
	public void runEditLead(String company, String phNo) throws InterruptedException {
		
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phNo);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		driver.findElementByLinkText("Edit").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys(company);
		driver.findElementByName("submitButton").click();
		
}
	
	
	@DataProvider(name = "fetchData")
	public String[][] sendData() {
		String[][] data = new String[2][2];
		
		data[0][0] = "Testleaf";
		data[0][1] = "99";
		
		data[1][0] = "TCS";
		data[1][1] = "9";
			
		return data;

	}
	
}






