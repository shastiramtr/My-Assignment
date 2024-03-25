package week7.day3;

public class Learnexceptionhandling {

	public static void main(String[] args) {
		System.out.println("Learn exception handling");
		int a = 10;
		int b = 20;
		int[] x = {1,2,3};
		String num = "$123";
		try {
			System.out.println(a+1);
			System.out.println(x[2]);
			System.out.println(num);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array " +x[x.length-1]);
		}
		
		System.out.println("Welcome");

	}

}
