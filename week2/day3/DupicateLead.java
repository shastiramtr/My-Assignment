package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DupicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KMR");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("RAM");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TR");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("shasti");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EIE");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("shastiram@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String gettitle = driver.getTitle();
		if(gettitle.contains("View Lead")) {
			System.out.println("Verified");	
		}
		else {
			System.out.println("Unable to verified");
		}
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Main");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("menu");
		driver.findElement(By.name("submitButton")).click();
		String gettitle1 = driver.getTitle();
		if(gettitle1.contains("View Lead")) {
			System.out.println("Verified");	
		}
		else {
			System.out.println("Unable to verified");
		}
	}

}
