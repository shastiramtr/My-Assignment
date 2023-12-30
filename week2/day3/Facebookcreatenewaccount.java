package week2.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookcreatenewaccount {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("ram");
		driver.findElement(By.name("lastname")).sendKeys("ramm");
		driver.findElement(By.name("reg_email__")).sendKeys("Shastiram@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("ramram");
		WebElement dataofbirth = driver.findElement(By.id("day"));
		Select dataofbirthdd = new Select(dataofbirth);
		dataofbirthdd.selectByValue("6");
		WebElement dataofbirth1 = driver.findElement(By.id("month"));
		Select dataofbirthdd1 = new Select(dataofbirth1);
		dataofbirthdd1.selectByValue("12");
		
		WebElement dataofbirth2 = driver.findElement(By.id("year"));
		Select dataofbirthdd2 = new Select(dataofbirth2);
		dataofbirthdd2.selectByValue("1993");

		driver.findElement(By.xpath("//*[text()='Male']")).click();







	}

}
