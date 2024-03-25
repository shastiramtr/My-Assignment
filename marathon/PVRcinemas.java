package marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PVRcinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.pvrcinemas.com/");
		// ChromeOptions option = new ChromeOptions();
		// option.addArguments("--disable-notifications");
		// ChromeDriver driver = new ChromeDriver(option);

		WebElement Locationsearch = driver.findElement(By.id("locationsearch"));
		Locationsearch.click();

		WebElement Searchcity = driver.findElement(By.xpath("//input[@placeholder='Search city']"));
		Searchcity.sendKeys("chennai");

		WebElement locationclick = driver.findElement(By.xpath("//span[text()='Chennai']"));
		locationclick.click();

		WebElement hamburgerbutton = driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']"));
		hamburgerbutton.click();

		WebElement MovieLibrary = driver.findElement(By.xpath("//a[text()='Movie Library']"));
		MovieLibrary.click();

		WebElement DDgenre = driver.findElement(By.xpath("//select[@name='genre']"));
		Select genredropdown = new Select(DDgenre);
		genredropdown.selectByVisibleText("ANIMATION");

		WebElement language = driver.findElement(By.xpath("//select[@name='lang']"));
		Select languagedropdown = new Select(language);
		languagedropdown.selectByVisibleText("ENGLISH");

		WebElement Applybutton = driver.findElement(By.xpath("//button[text()='Apply']"));
		Applybutton.click();

		Thread.sleep(5000);
		String animationmovie = driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']"))
				.getText();
		System.out.println("animation movie:" + animationmovie);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement selectmovie = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='movie-list']/div[1]")));
		selectmovie.click();

		WebElement ProceedToBook = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Proceed To Book']")));
		ProceedToBook.click();

		WebElement cinemadd = driver.findElement(By.xpath("//select[@id='cinemaName']"));
		Select cinemadropdown = new Select(cinemadd);
		cinemadropdown.selectByVisibleText("PVR Velachery Chennai");

		WebElement namefield = driver.findElement(By.xpath("//input[@name='name']"));
		namefield.sendKeys("Shastiram");

		WebElement datepicker = driver.findElement(By.id("datepicker-input"));
		datepicker.click();

		WebElement date = driver.findElement(By.xpath("//span[text()='18']"));
		date.click();

		WebElement showtimedd = driver.findElement(By.xpath("//select[@name='timings']"));
		Select showtimedropdown = new Select(showtimedd);
		showtimedropdown.selectByIndex(0);

		WebElement noofseats = driver.findElement(By.xpath("//input[@name='noOfTickets']"));
		noofseats.sendKeys("2");

		WebElement fooddd = driver.findElement(By.xpath("//select[@name='food']"));
		Select fooddropdown = new Select(fooddd);
		fooddropdown.selectByIndex(1);

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("shastiram@yahoo.in");

		WebElement mobile = driver.findElement(By.xpath("//input[@name='mobile']"));
		mobile.sendKeys("7373979702");

		WebElement OtherRequirements = driver.findElement(By.xpath("//input[@name='comment']"));
		OtherRequirements.sendKeys("no");

		WebElement copytoselfcheckbox = driver.findElement(By.xpath("//label[@class='custom-control custom-radio']"));
		copytoselfcheckbox.click();

		WebElement SendRequest =
				driver.findElement(By.xpath("//button[text()='SEND REQUEST']"));
		SendRequest.click();

		WebElement cancelbutton =
				driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]"));
		cancelbutton.click();

		WebElement OTPdialog =
				driver.findElement(By.xpath("//button[@class='swal2-close']"));
		OTPdialog.click();

		String title = driver.getTitle();
		System.out.println("Page title:" + title);

		if (driver.getTitle().contains("Movie")){
			System.out.println("Title Verified");
		}
		else {
			System.out.println("Title Mismatch");
		}


	}

}


