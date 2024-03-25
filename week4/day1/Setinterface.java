package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Setinterface {

	public static void main(String[] args) {
		String companyname ="google";
		char[] uniquechar = companyname.toCharArray();
		System.out.println(uniquechar);
		Set<Character> uniquechars =new LinkedHashSet<>();
		 for (int i = 0; i < uniquechar.length; i++) {
			 uniquechars.add(uniquechar[i]);
	        }
		 System.out.println( uniquechars);
		

	}

}
