package week2.day2;

public class FindthecountofagivencharacterinaString {
	/*
	 * Classroom <2>: Find the count of a given character in a String Learning
	 * 
	 * Assignment Details: 
	 * Your task is to count the occurrences of character ‘e’ in the given String input="TestLeaf". 
	 * Requirements: 
	 * - Create a class with a main method. 
	 * - Initialize a variable to 0. 
	 * - Convert the given String to a character array. 
	 * - Use loop to iterate through each character in the array. 
	 * - Compare each character with the target character. 
	 * - If a match is found,increment the count. 
	 * - Finally, print the count
	 * Hints to solve: 
	 * - Use appropriate method to convert the String into a character array. 
	 * - Utilize proper loop to iterate through the character array. 
	 * - Use an if condition to compare each character with the target character and increment the count accordingly. 
	 * Expected Outcome: 
	 * Upon completion, you should be: 
	 * - Understand how to count the occurrences of a specific character in a String. 
	 * - Grasp the fundamental principles of String manipulation and conditional logic in Java.
	 */

	public static void main(String[] args) {
		// Initialize variables
		int count = 0;
		String input = "TestLeaf";

		// Convert the string to a character array
		char[] charArray = input.toCharArray();

		// Loop through each character in the array
		for (char c : charArray) {
			// Compare each character with the target character 'e'
			if (c == 'e') {
				// If a match is found, increment the count
				count++;
			}
		}

		// Finally, print the count
		System.out.println("Occurrences of 'e' in the given string: " + count);
	}



}


