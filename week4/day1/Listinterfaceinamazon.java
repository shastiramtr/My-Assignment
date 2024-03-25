package week4.day1;


import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listinterfaceinamazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones"+Keys.ENTER);
		List<WebElement> phoneprice = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
		int phonepricecount =phoneprice.size();
		System.out.println("numberofphone"+phonepricecount);
		List<Integer>allmobileprice =new LinkedList<Integer>();
		List<String>allpricestr =new LinkedList<String>();
		


	}

}
