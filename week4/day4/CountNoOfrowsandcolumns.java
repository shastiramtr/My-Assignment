package week4.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNoOfrowsandcolumns {

	public static void main(String[] args) {
		
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> rows = driver.findElements(By.xpath("	//table[@class='attributes-list']/tbody/tr"));
		System.out.println("Number of row :" + rows.size());
		
		List<WebElement> column = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr/th"));
		System.out.println("Numbers of column: "+ column.size());

	}

}
