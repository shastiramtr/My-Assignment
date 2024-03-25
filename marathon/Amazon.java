package marathon;
/*Testcase:3(Amazon)
===============
01) Launch Chrome  
02) Load https://www.amazon.in/
     add  implicitlyWait
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
03) Type "Bags for boys" in the Search box
04) Choose the 	 item in the result (bags for boys)
05) Print the total number of results (like 50000)
    1-48 of over 50,000 results for "bags for boys"
06) Select the first 2 brands in the left menu
    (like American Tourister, Generic)
07) Choose New Arrivals (Sort)
08) Print the first resulting bag info (name, discounted price)
09) Get the page title and close the browser(driver.close())*/

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys"+Keys.ENTER);
		String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println("Totalcount:"+text);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		String text2 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]")).getText();
		System.out.println("Brand name: "+text2);
		String text3 = driver.findElement(By.xpath("//div[@class='a-row']")).getText();
		System.out.println("Discound price: "+text3);
		String title = driver.getTitle();
		System.out.println("Page title: " +title);
		//driver.close();
		
		
		
	

	}

}
