package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.drawingml.x2006.chart.CTSecondPieSize;

import week3.day2.Webelement;

/*Assignment Details: -
Automate the Leafground web page by interacting with checkboxes using Selenium WebDriver. 
Precondition: 
- Initialize ChromeDriver 
- Load the URL https://leafground.com/checkbox.xhtml 
- Maximize the browser window - Add an implicit wait to ensure the web page elements are fully loaded 
Requirements: 
- Click on the "Basic Checkbox.” 
- Click on the "Notification Checkbox." 
- Verify that the expected message is displayed. 
- Click on your favorite language (assuming it's related to checkboxes). 
- Click on the "Tri-State Checkbox." 
- Verify which tri-state option has been chosen. 
- Click on the "Toggle Switch." 
- Verify that the expected message is displayed. 
- Verify if the Checkbox is disabled. 
- Select multiple options on the page (details may be needed). 
- Perform any additional actions or verifications required. 
- Close the web browser when done.*/
public class Checkboxinteracting {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]")).click();
		WebElement notificationmsg = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]"));
		notificationmsg.click();
		//- Click on the "Notification Checkbox." 
		//- Verify that the expected message is displayed.
		String verifiedmsg = driver.findElement(By.xpath("//*[@id=\"j_idt87:msg_container\"]/div/div/div[2]/span")).getText();
		System.out.println("Gettext result:-----"  +     verifiedmsg);
		if (verifiedmsg.contains("Checked")) {
			System.out.println("Verified");
		}
		else{
			System.out.println("Verification failed");
			
		}
		
		WebElement favoritelaunage = driver.findElement(By.xpath("//table[@id='j_idt87:basic']/tbody/tr/td/label"));
		favoritelaunage.click();
		
		WebElement TriStateCheckbox =driver.findElement(By.xpath("//*[@id='j_idt87:ajaxTriState']/div[2]"));
		TriStateCheckbox.click();
		
		WebElement Toggleswitch = driver.findElement(By.id("j_idt87:j_idt100"));
		Toggleswitch.click();
		if(Toggleswitch.equals("Checked")) {
			System.out.println("Switch Enable");
		}
		else {
			System.out.println("Switch not enable");
		}
		
		WebElement disable =driver.findElement(By.id("j_idt87:j_idt102"));
		System.out.println(disable.isEnabled());
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.id("j_idt87:multiple_panel"));
		Select select = new Select(drop);
		select.selectByIndex(1);
		
		
		/*List<WebElement> Multipledropdown =driver.findElements(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[1]/div[1]/div[2]"));
		for (WebElement checkbox : Multipledropdown) {
            checkbox.click();*/
    

	
	
	
	}
	

            }




