package marathon;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.abhibus.com/");

		WebElement fromstation = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
		fromstation.sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();

		WebElement tostation = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
		tostation.sendKeys("bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();

		//WebElement datepicker = driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']"));
		//datepicker.sendKeys("13/01/2024");
		WebElement tomorrow = driver.findElement(By.xpath("//a[text()='Tomorrow']"));
		tomorrow.click();

		WebElement searchbutton = driver.findElement(By.xpath("//a[text()='Search']"));
		searchbutton.click();

		String firsttitle = driver.findElement(By.xpath("(//h5[@class='title'])[1]")).getText();
		System.out.println("firstbus:"+firsttitle);

		WebElement chooseslepper = driver.findElement(By.xpath("//span[text()='Sleeper']"));
		chooseslepper.click();

		String seatcount = driver.findElement(By.xpath("(//div[@class='text-grey'])[1]")).getText();
		System.out.println("Seat availiable"+seatcount);
		
		WebElement showseat = driver.findElement(By.xpath("(//button[text()='Show Seats'])[1]"));
		showseat.click();
		
		WebElement seatclick = driver.findElement(By.xpath("(//button[@class='seat sleeper'])[1]"));
		seatclick.click();
		
		WebElement boardingpoint = driver.findElement(By.xpath("(//div[@class='label'])[1]"));
		boardingpoint.click();
		
		WebElement droppingpoint = driver.findElement(By.xpath("(//div[@class='label'])[1]"));
		droppingpoint.click();
		
		String seatselected = driver.findElement(By.xpath("//span[text()='Seat Selected :']")).getText();
		System.out.println("Seats Selected:"+seatselected);
		
		String basefare = driver.findElement(By.xpath("//span[text()='Base Fare :']")).getText();
		System.out.println("Base Fare:"+basefare);
		
		String  Titleofthepage = driver.getTitle();
		System.out.println("Titleofthepage:"+Titleofthepage);
		
		driver.close();
		
		
		
		
		
	}

}
