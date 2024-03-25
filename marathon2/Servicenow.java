package marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Servicenow {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://dev206063.service-now.com");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("qVM@gxa1+H1A");
		driver.findElement(By.id("sysverb_login")).click();
		
		System.out.println("Launched ServiceNow application");
		
		
	}

}
