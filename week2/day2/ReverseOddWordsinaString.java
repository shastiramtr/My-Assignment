package week2.day2;

public class ReverseOddWordsinaString {

	/*
	 * Assignment Details: Reverse the odd position words from a String with the
	 * input: String test = "I am a software tester"; 
	 * Expected output: “I ma aerawtfos tester” 
	 * Assignment Requirements: 
	 * - Split the words and have it in an array 
	 * - Traverse through each word using loop 
	 * - Find the odd index within the loop 
	 * - Convert the String array into a character array 
	 * - Print the even position words using another loop 
	 * Hints to Solve: 
	 * - Print the even position words in reverse order using nested loop 
	 * - Convert words to character array if the position is odd else print the word as it is (concatenate space at the end).
	 */

	public static void main(String[] args) {

		String test ="I am a software tester";
		String[] array = test.split(" ");
		for(int i=0;i<array.length;i++) {
			if(i%2!=0) {
				char[]chararray =array[i].toCharArray();
				for(int j=chararray.length-1;j>=0;j--) {
					System.out.println(chararray);

				}

			}
		}
	}
}
	



