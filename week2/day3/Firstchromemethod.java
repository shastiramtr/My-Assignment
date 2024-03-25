package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Firstchromemethod {
	
	public ChromeDriver driver;
	@BeforeMethod
	public void precondition(){

	   driver = new ChromeDriver();
	  driver.get("http://leaftaps.com/opentaps/control/main");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	  driver.findElement(By.id("password")).sendKeys("crmsfa");
	  driver.findElement(By.className("decorativeSubmit")).click();
	  driver.findElement(By.linkText("CRM/SFA")).click();
	  driver.findElement(By.linkText("Leads")).click();
	}
	@AfterMethod
	public void postcondition() {
		driver.close();
	}
	 
	
	
	

}
