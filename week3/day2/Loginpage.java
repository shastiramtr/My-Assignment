package week3.day2;

public class Loginpage extends Basepage{
	
	public void performcommontask() {
		System.out.println("performcommontask override");
	}
	public static void main(String[] args) {
		Loginpage loginpage = new Loginpage();	
		
		loginpage.findelement();
		loginpage.clickelement();
		loginpage.entertext();
		loginpage.performcommontask();
		
	}
	
	

}
