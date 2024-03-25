package week6.day2;

public class Learnthiskeyword extends Learnkeyword{
public Learnthiskeyword() {
		
	}

	 String fileName = "CreateLead";
	
	
	public  void getData(String fileName) {
		System.out.println(fileName);
		this.fileName= fileName;
		setData();
		System.out.println("This is getData");
	}
	
	
	public void setData() {
		
		super.readData();
		this.readData();
		System.out.println("This is setData");
	}
	
	public static void readData() {
		System.out.println("This is readData");
	
	}
	
	public void makeCall() {
		
	}
	
	public  void makeCall(String name) {
		makeCall();
	}
	
	public static void main(String[] args) {
		Learnthiskeyword ltk = new Learnthiskeyword();
		System.out.println(ltk.fileName);
		ltk.getData("EditLead");
		System.out.println(ltk.fileName);
	}

}
