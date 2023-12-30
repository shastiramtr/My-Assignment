package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automatefacebooklogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("testleaf.2023@gmail.com");
		
		WebElement password=  driver.findElement(By.id("pass"));
		password.sendKeys("Tuna@321");
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		String homepagetitle =driver.getTitle();
		if(homepagetitle.contains("Forgotten Password")) {
			System.out.println("Verified successfully");
		}
		else {
			System.out.println("Unable to verify");
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
		
		
		

	}

}
