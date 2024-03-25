package week4.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*Home Assignment <2>: Find Second Largest Number using List
Learning Objective: To gain a clear understanding of List Interface by manipulating the collection of elements.
Assignment Details: 
Find the second largest number from the given array 
Assignment Requirements: 
- Declare an array {3, 2, 11, 4, 6, 7}. 
- Pick the 2nd element from the last and print it. 
Hints to Solve: 
- Arrange the collection in ascending order 
- Use the get method to print the second largest number*/

public class FindSecondLargestNumberusingList {

	public static void main(String[] args) {
		
		int[] numbers = {3, 2, 11, 4, 6, 7};
		List<Integer> number = new ArrayList<>();
		for(int storenumbers : numbers) {
			number.add(storenumbers);
		}
		
		Collections.sort(number);
		System.out.println("short numbers:"+number);
		
	
		

	}

}
