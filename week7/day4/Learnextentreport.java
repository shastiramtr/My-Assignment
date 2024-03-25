package week7.day4;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Learnextentreport {

	public static void main(String[] args) throws IOException {
		//step 1: set apath
		File file = new File("./report/result.html");
		// step2 : create object for Extenthtml report
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(file);
		//step 3: step to maintain report history
		reporter.setAppendExisting(true);// default value is false, by changing true it will maintain history
		// create object for extent report
		ExtentReports extent = new ExtentReports();
		//  attach report into the report file 
		extent.attachReporter(reporter);
		//by using create test method, create a report for the test case
		ExtentTest test = extent.createTest("TC001loginTC","Login testcase with positive functionality");
		//assign author
		test.assignAuthor("shastiram");
		//assign category
		test.assignCategory("smoke");
		//test pass or faill
		test.pass("username entered successfully");

		test.pass("password entered successfully", MediaEntityBuilder.createScreenCaptureFromBase64String(".././screenshort/myntra.png").build());

		//test.fail("Login button click successfully", MediaEntityBuilder.createScreenCaptureFromBase64String(".././snaps/Homepage.png").build());

		// Last step mandatory wirhout extnt.flush()report will not create / write
		extent.flush();


	}

}
