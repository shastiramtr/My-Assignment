package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctcwindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		String parentwindow = driver.getWindowHandle();
		System.out.println("parent window address:"+parentwindow);
		driver.findElement(By.xpath("//a[text()=\" FLIGHTS \"]")).click();
		 Set<String> secondwindow = driver.getWindowHandles();
		 List<String> window =new ArrayList<String>(secondwindow);
		 driver.switchTo().window(window.get(1));
		 String secondwindowtitle = driver.getTitle();
		System.out.println("second window title:"+secondwindowtitle);
		driver.switchTo().window(window.get(0));
		driver.close();
		 
		 
		
		 

	}

}
