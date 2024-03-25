package week4.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class LearnActionandSccreenshort {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		Actions action = new Actions (driver);
		action.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_UP).perform();
		WebElement copy =driver.findElement(By.xpath("//div[@class='desktop-copywrite']"));
		action.scrollToElement(copy);
		String text = copy.getText();
		System.out.println("gettext:"+text);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File target = new File("./screenshort/myntra.png");
		FileUtils.copyFile(source, target);
		
		
		

	}

}
