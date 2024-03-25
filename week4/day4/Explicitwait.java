package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://leafground.com/waits.xhtml");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		WebElement clickbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Click'])[3]")));
		clickbutton.click();
		Boolean boolean1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()=\"Did you notice?\"]")));
		System.out.println("Did you notice?:"+boolean1);

	}

}
