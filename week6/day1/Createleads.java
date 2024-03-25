package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Createleads extends Projectspecifi{
	@Test(dataProvider ="fetchData")
	public void runcreadLead(String cname,String fname,String lname,String phno) {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(text.contains("Testleaf")) {
			System.out.println("Lead create successfully");
		}
		else {
			System.out.println("Lead is not crearte");
		}
			
		}
	
	
	
	
	
	
    @DataProvider(name ="fetchData")
	public String[][] getData(){
		String[][]data =new String[3][4]; //for instansitation it starts from 1,1
				
		//For declaring a data it starts from ,0,0

        data[0][0] ="great";
		data[0][1] ="shasti";
		data[0][2] ="ram";
		data[0][3] = "90";
		
		
		data[1][0] ="great1";
		data[1][1] ="shasti1";
		data[1][2] ="ram1";
		data[1][3] = "90";
		
		
		data[2][0] ="great2";
		data[2][1] ="shasti2";
		data[2][2] ="ram2";
		data[2][3] = "90";
		
		return data;
	}

}
