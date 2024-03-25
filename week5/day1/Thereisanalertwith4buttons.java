package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thereisanalertwith4buttons {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://letcode.in/test");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//p[text()='Allow ads']")).click();
		//driver.findElement(By.id("webpushr-deny-button")).click();
		//driver.findElement(By.xpath("//button[@class='pum-close popmake-close']")).click();
		//driver.quit();




	}

}
