package week3.day2;

public class Logintestdata extends TestData{
	public void enterusername() {
		System.out.println("Enter User Name");
	}
	public void enterpassword(){
		System.out.println("Enter Password");
	}




	public static void main(String[] args) {
		Logintestdata obj = new Logintestdata();
		obj.entercredentials();
		obj.navigatetohomepage();
		obj.enterusername();
		obj.enterpassword();

		TestData obj1 = new TestData();
		obj1.entercredentials();
		obj1.navigatetohomepage();
	}

}
