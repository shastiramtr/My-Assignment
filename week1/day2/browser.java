package week1.day2;

public class browser {

	public static void main(String[] args) {
		browser run =new browser();
		run.launchBrowser("edge");
		run.loadUrl();

		Chrome printname = new Chrome();
		printname.GetName();
		printname.PrintName();
	}
	public String launchBrowser(String Chrome){
		System.out.println("Browser launched successfully");
		return "chrome browser";
	}

	public void loadUrl() {
		System.out.println("Application url loaded successfully");
		System.out.println("-----Assignment3-----");

	}




}


