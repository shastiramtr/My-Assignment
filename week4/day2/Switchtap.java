package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchtap {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://letcode.in/windows");
	WebElement openhomepagebutton = driver.findElement(By.id("home"));
	openhomepagebutton.click();
	System.out.println("window1" +driver.getTitle());
	Set<String> windowHandles = driver.getWindowHandles();
	List<String>secondtap= new ArrayList<String>(windowHandles);
	driver.switchTo().window(secondtap.get(1));
	System.out.println("window2" +driver.getTitle());
	driver.close();
	

	}

}
