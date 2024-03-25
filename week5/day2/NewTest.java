package week5.day2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test (enabled=true)
  public void f() {
	  System.out.println("@test");
  }
  @Test(dependsOnMethods = "f") 
  public void f2() {
	  System.out.println("test second");
  }
  @Test (threadPoolSize =3,invocationCount = 10, timeOut =4000)
  public void f3() {
	  System.out.println("testcthitd");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@before method");
  }
 
  @AfterMethod
  public void afterMethod() {
	  System.out.println("@aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@aftertest");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@aftersuite");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@beforesuite");
  }

}
