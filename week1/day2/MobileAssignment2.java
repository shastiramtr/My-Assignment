package week1.day2;

public class MobileAssignment2 {
	//Assignment 2:
	//- Create package name as week1.day1 under src/main/java
	//- Create a  new class as "Mobile" under week1.day1
	//- Create 2 methods (makeCall() , sendMsg()) with simple print statement
	//- In first method create variable  mobileModel (String),mobileWeight (float)
	//- In second method create variable  isFullCharged (boolean),mobileCost (int)
	//- Create main method
	//Create object for class and call  from main method and print them
	//- print a statement---->"This is my mobile";
	//-run and confirm the output printed in console 
	
	public static void main(String[] args) {
		
		  MobileAssignment2 phone =new MobileAssignment2(); 
		  phone.MakeCall();
		  phone.SendMsg();
		 


	}
	public void MakeCall() {
		System.out.println("----------Assignment2---------");
		System.out.println("This is my mobile");
		String MobileModel ="Nokia 1100";
		float MobileWeight = 80.00f;
		System.out.println("Mobile Model = "+ MobileModel);
		System.out.println("MObileWeight = "+ MobileWeight);
	}
	public void SendMsg() {
		System.out.println("send msg to ram");
		boolean isFullCharged = true;
		int MobileCost = 4500;
		System.out.println("FullyCharged = "+isFullCharged);
		System.out.println("Mobile Price = "+MobileCost);
	}

}
