package week1.day1;

//import org.openqa.selenium.chrome.ChromeDriver;

public class HelloTestLeaf {
	//public static void main(String[] args) {
//		System.out.println("Welcome to TestLeaf");
//		
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("www.google.com");
//	}
	public static String reverseString(String input) {
		
		// Write your code here	
		
      String s ="testleaf";
        String revers =" ";
      for(int i=s.length()-1;i<=0;i--){
        revers = revers+s.charAt(i);
	}
	return revers;
      
}

}
