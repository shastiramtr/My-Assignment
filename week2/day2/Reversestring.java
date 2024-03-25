package week2.day2;

public class Reversestring {

	public static void main(String[] args) {
		/*String companyname ="TestLeaf";
		char[] chararray = companyname.toCharArray();
		for(int i=companyname.length()-1;i>=0;i--) {
			System.out.println(chararray[i]);
		}*/
		
		String name = "Shastiram";
		String revers ="";
		for(int i=name.length()-1;i>=0;i--) {
			revers=revers+name.charAt(i);
		}
		if(name.equals(revers)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrom");
		}

	}

}
