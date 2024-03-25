package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[]args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/control/logout");
		//Login steps
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//- Click on the CRM/SFA link.
		WebElement link =driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		//- Click on the Contacts button.
		WebElement contactstab = driver.findElement(By.linkText("Contacts"));
		contactstab.click();
		//Click on Merge Contacts.
		WebElement mergecontats = driver.findElement(By.linkText("Merge Contacts"));
		mergecontats.click();
		//Click on the widget of the "From Contact".
		WebElement widgetofthefromcontact = driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif'][1]"));
		widgetofthefromcontact.click();
		//- Click on the first resulting contact.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>window =new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a)[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String>window1 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(window1.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a)[2]")).click();
		driver.switchTo().window(window1.get(0));
		WebElement mergebutton = driver.findElement(By.xpath("//a[text()='Merge']"));
		mergebutton.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Mergeaccept: "+text);
		alert.accept();







	}
}
