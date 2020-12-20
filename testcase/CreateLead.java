package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testng.day2.ReadExcel;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setFileName() {
		excelFileName = "CreateLead";

	}
	
	@Test(dataProvider = "fetchData")
	public void runCreateLead(String company, String firstName, String lastName) {
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(company);
		driver.findElementById("createLeadForm_firstName").sendKeys(firstName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lastName);
		driver.findElementByName("submitButton").click();

	}
	
	
	/*
	 * @DataProvider(name = "fetchData") public String[][] sendData() throws
	 * IOException {
	 * 
	 * ReadExcel re = new ReadExcel(); String[][] data = re.readData("CreateLead");
	 * 
	 * 
	 * String[][] data = new String[3][3];
	 * 
	 * data[0][0] = "Testleaf"; data[0][1] = "Hari"; data[0][2] = "R";
	 * 
	 * data[1][0] = "TCS"; data[1][1] = "Naveen"; data[1][2] = "E";
	 * 
	 * data[2][0] = "Wipro"; data[2][1] = "Dhivya"; data[2][2] = "P";
	 * 
	 * 
	 * return data;
	 * 
	 * }
	 */

}
