package week3.day3;

public class Concreteclass implements DatabaseConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect data base ");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect data base");
		
	}

	@Override
	public void executeupdate() {
		// TODO Auto-generated method stub
		System.out.println("Execute update ");
		
	}

}
