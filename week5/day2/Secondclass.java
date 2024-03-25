package week5.day2;

import org.testng.annotations.Test;

public class Secondclass {
	@Test (dependsOnMethods ="week5.day2.Firstclass.first")
	public void second() {
		System.out.println("second");
	}

}
