package week1.day2;

//Assignment:3
//Problem statement: Convert a negative number to positive number
//-----------------------------------------------Pseudocode: 
//1. Initialize an integer with a negative number like, int number = -40;
//2. Check if the number is a negative number Hint : any number that is lesser than zero is a negative number
//3. If so, convert the number to a positive numer
//4. Print as below "The number -40 is converted to 40"

public class Convertanegativenumbertopositivenumber {

	public static void main(String[] args) {
		int mark = 75;
		
		if(mark<50) {
			System.out.println("Fail");
		}
		else if (mark>=50&&mark<60) {
			System.out.println("D grade");
		}
		else if (mark>=60&&mark<70) {
			System.out.println("c grade");
		}
		else if (mark>=70&&mark<80) {
			System.out.println("B grade");
		}
		else if (mark>=80&&mark<90) {
			System.out.println("A grade");
		}
		else if (mark>=90&&mark<100) {
			System.out.println("A+ grade");
		}
		else {
			System.out.println("Invalid");
		}
		


	}

}
