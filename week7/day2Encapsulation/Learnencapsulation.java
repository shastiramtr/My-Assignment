package week7.day2Encapsulation;

public class Learnencapsulation {



	private int creditcardpin;
	private void setpin (int pin) {
		creditcardpin = pin;
	}
	
	protected int getpin() {
		setpin(1234);
		return  creditcardpin;
	}

	public static void main(String[] args) {
		Learnencapsulation le =new Learnencapsulation();
		le.setpin(1234);
		System.out.println(le.creditcardpin);
	}
}
