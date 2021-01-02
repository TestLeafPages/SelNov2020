package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {

		//Step1: create a physical report
		ExtentHtmlReporter reporter  = new ExtentHtmlReporter("./reports/result.html");
		
		//to see the history
		reporter.setAppendExisting(true);
		
		//Step2: create actual report data
		ExtentReports extent = new ExtentReports();
		
		//Step3: Attach the extent data to the physical report
		extent.attachReporter(reporter);
		
		//Step4: Create test case with details
		ExtentTest testcase1 = extent.createTest("CreateLead", "Create Lead with mandatory info");
		testcase1.assignAuthor("Hari");
		testcase1.assignCategory("Regression Test");
		
		//Step5: Test step status
		testcase1.pass("Lead created successfully",MediaEntityBuilder
				.createScreenCaptureFromPath(".././snaps/login.png").build());
		
		
		extent.flush();
		
		
	}

}
