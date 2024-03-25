package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tatacliq {
	/*
	 * TestCase 1:
	 * Tatacliq Testcase: ================== 
	 * 1. Load the url as https://www.tatacliq.com/ 
	 * 2. MouseHover on 'Brands' 
	 * 3. MouseHover on 'Watches & Accessories' 
	 * 4. Choose the first option from the 'Featured brands'. 
	 * 5.Select sortby: New Arrivals 
	 * 6. choose men from catagories filter. 
	 * 7. print all price of watches 
	 * 8. click on the first resulting watch. 
	 * 9. Handle Alrert Pop Up 
	 * 10. compare two price are similar 
	 * 11. click Add to cart and get count from the cart icon. 
	 * 12. Click on the cart 
	 * 13. Take a snap of the resulting page. 
	 * 14. All the opened windows one by one.
	 */

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.tatacliq.com/");

		//Actions action =new Actions (driver);
		WebElement notification = driver.findElement(By.xpath("//button[text()='Ask me later']"));
		notification .click();

		WebElement brand = driver.findElement(By.xpath("//div[text()='Brands']"));
		brand.click();

		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		watch.click();

		WebElement casio = driver.findElement(By.xpath("//div[text()='Casio']"));
		casio.click();

		//dropdown
		WebElement sortby = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select sortbydd= new Select(sortby);
		sortbydd.selectByVisibleText("New Arrivals");

		WebElement category = driver.findElement(By.xpath("(//div[text()='Men'])[1]"));
		category.click();

		Thread.sleep(2000);
		List<WebElement> pricelist = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		int size = pricelist.size();
		System.out.println("watchpricesize: " +size);
		for(int i=0; i<pricelist.size(); i++ ) {
			String text = pricelist.get(i).getText();
			System.out.println("watchprice: " + text);
		}

		WebElement Secondwatch = driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[2]"));
		Secondwatch.click();

		//Switch windows first to second
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>window =new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));

		WebElement addtocardbutton = driver.findElement(By.xpath("(//div[@class='Button__base'])[3]"));
		addtocardbutton.click();

		//Number of item in the add to bag
		String text1 = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Add to bag :" +text1);

		WebElement Addtobagbutton = driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']"));
		Addtobagbutton.click();

		Thread.sleep(2000);
		String compareprice = driver.findElement(By.xpath("//div[@class='DesktopCheckout__price']")).getText();
		if(pricelist.equals(compareprice)) {
			System.out.println("Price is same");
		}else {
			System.out.println("price isnot same");
		}

		Thread.sleep(2000);
		File source =driver.getScreenshotAs(OutputType.FILE);
		File target =new File("./screenshort/tatcliq.png");
		FileUtils.copyFile(source, target);

		driver.quit();







	}

}
