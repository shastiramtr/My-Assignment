package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownElements {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shastiram");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("tr");
		WebElement sourcedropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source =new Select(sourcedropdown);
		source.selectByIndex(4);

		WebElement marketingCampaigndropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCampaign =new Select(marketingCampaigndropdown);
		marketingCampaign.selectByVisibleText("Automobile");

		Thread.sleep(2000);
		WebElement ownershipdropdown = driver.findElement(By.xpath("//*[@id=\"createLeadForm_ownershipEnumId\"]"));
		Select ownership =new Select(ownershipdropdown);
		ownership.selectByIndex(5);

		driver.findElement(By.name("submitButton")).click();

		String tabtitle = driver.getTitle();
		if(tabtitle.contains("opentaps")) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Unable to verified");
		}

	}
}


