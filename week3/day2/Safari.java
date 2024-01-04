package week3.day2;

public class Safari extends Edge {
	public void readermode() {
		System.out.println("read");
	}
	public void fullscreenmode() {
		System.out.println("fullscreen");
	}
	
	public static void main(String[] args) {
		Safari safari =new Safari();
	
		safari.openURL();
		safari.closebrowser();
		safari.navigatebace();
		safari.openincognito();
		safari.clearcache();
		safari.takesnap();
		safari.clearcookies();
		safari.readermode();
		safari.fullscreenmode();
	}

}
