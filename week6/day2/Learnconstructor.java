package week6.day2;

public class Learnconstructor {
	int a;
	//syntax for constructor -- > access modifier className (){}

		public Learnconstructor() {
			this(3);
			System.out.println("Hello this is default constructor");
		}
		
		public Learnconstructor(int a) {
			this(1,"Hello");
			System.out.println("This is single argument constructor");
			
		}
		
		public Learnconstructor(int a, String x) {
			System.out.println("This is two argument constructor");
		}
		
		public static void main(String[] args) {
			Learnconstructor lc  = new Learnconstructor();
		}

}
