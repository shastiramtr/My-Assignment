package marathon2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		
		
		WebElement All = driver.findElement(By.id("nav-hamburger-menu"));
		All.click();
		
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[18]/a")).click();
		driver.findElement(By.xpath("(//a[text()='Watches'])[1]")).click();

	}

}
