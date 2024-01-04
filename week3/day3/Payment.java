package week3.day3;
//Assignment Details: Design an abstract class that implements an interface with abstract methods representing various payment methods and further implement those methods in a concrete class. Requirements: Create an Interface Payments with the following abstract methods: - cashOnDelivery() - upiPayments() - cardPayments() - internetBanking() Create an Abstract Class CanaraBank that implements Payments interface and adds `recordPaymentDetails()` for payment specifics.
//Create a Concrete Class Amazon that inherits CanaraBank, implementing methods. Hints to Solve: - Utilize appropriate keywords to signify that a class is implementing an interface. - Implement abstract methods in the concrete class to provide specific functionality Reference Links: Abstraction in Java - Oracle Docs Expected Outcome: Upon completion, you should be able to: - Grasp the concept of Abstraction in Java, including interface and concrete class. - Created a practical example of how abstraction allows for the definition of a common structure while leaving specific implementations to subclass.

public interface Payment {
	
	public void cashondelivery();
	public void upipayment();
	public void cardpayment();
	public void internetbanking();
	

}
