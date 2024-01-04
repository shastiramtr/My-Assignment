package week3.day3;

public abstract class Canarabank implements Payment {
	
	public void recordpaymentdetails () {
		System.out.println("record payment details");
	}
	
	public void cashondelivery() {
		System.out.println("cash on delivey");
	}
	public void upipayment() {
		System.out.println("upi payment");
	}
		
	
	public void cardpayment() {
		System.out.println("card payment");
	}
	public void internetbanking() {
		System.out.println("internet banking");
		
	}

}
