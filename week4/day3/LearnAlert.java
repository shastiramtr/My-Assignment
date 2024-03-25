package week4.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");// iframeid 
		driver.findElement(By.xpath("//button[text()='Try it']")).click();// Try it button on iframe so switch to frame use 
		Alert alert = driver.switchTo().alert();
		String textmsg = alert.getText();
		System.out.println("get text:-"+textmsg);
		alert.dismiss();
		

	}

}
