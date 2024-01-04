package week3.day2;

public class APIClient {
	
	public void sendrequest(String endpoint) {
		System.out.println("Request send");
	}
	
	public void sendrequest(String endpoind,String requestbody,boolean requeststatus) {
		System.out.println("request verified");
	}
	public static void main(String[] args) {
		
		APIClient client =new APIClient();
			client.sendrequest("www.google.come");
			client.sendrequest("google", "yahoo", true);
		
	}

}
