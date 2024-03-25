package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import week3.day2.Webelement;

/*Assignment Details: 
	- Automate the process of searching for men's fashion bags on the Ajio website, apply specific filters, and gather information including the count of items found, 
	the list of brands, and the list of product names. 
	Assignment Requirements: 
	- Launch the URL https://www.ajio.com/ 
	- In the search box, type as "bags" and press enter 
	- To the left of the screen under "Gender" click on "Men" 
	- Under "Category" click "Fashion Bags" 
	- Print the count of the items found. 
	- Get the list of brand of the products displayed in the page and print the list. 
	- Get the list of names of the bags and print it 
	Hints to Solve: 
	- Write common locator / xpath matching all the brands and bag names in the page and get into List<Element>*/
public class ajioimplemendinglistinterface {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags"+Keys.ENTER);
		driver.findElement(By.xpath("//input[@id=\"Men\"]/following-sibling::label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']/following-sibling::label")).click();
		Thread.sleep(2000);
		WebElement listofitemcount = driver.findElement(By.xpath("//div[@class=\"length\"]"));
		System.out.println("Number of itemfound: " +listofitemcount.getText());
		List<WebElement> Brandname = driver.findElements(By.xpath("//div[@class='brand']"));
		for (int i = 0; i < Brandname.size(); i++) {
			String text = Brandname.get(i).getText();
			System.out.println("brandname:"+text);
		}
		List<WebElement> Nameofthebags =driver.findElements(By.xpath("//div[@class='nameCls']"));
		for(int i=0; i <Nameofthebags.size();i++) {
			String text1 = Nameofthebags.get(i).getText();
			System.out.println("bagsname:"+text1);
		}






	}

}





















