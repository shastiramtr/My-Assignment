package week4.day4;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInteraction {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://erail.in/");
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS"+Keys.ENTER);

		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU"+Keys.ENTER);

		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> railtable = driver.findElements(By.xpath("c"));
		int noofrowandcolumn=railtable.size();
		Set<String>listoftrainname =new LinkedHashSet<String>();

		for(int i=2;i<=noofrowandcolumn;i++) {
			String trainname = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(trainname);
			listoftrainname.add(trainname);
			System.out.println(listoftrainname);
		}
		System.out.println(listoftrainname);
		if(noofrowandcolumn-1==listoftrainname.size()) {
			System.out.println("There are no duplicate trainname");
		}
		else {
			System.out.println("Duplicate trainname");
		}
	}

}
