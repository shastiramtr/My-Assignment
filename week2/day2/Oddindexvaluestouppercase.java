package week2.day2;

public class Oddindexvaluestouppercase {



	public static void main(String[] args) {
		String test ="changeme";
		char[] array = test.toCharArray();
		for(int i=array.length-1;i>=0;i--) {
			if (i%2!=0){
				 array[i] = Character.toUpperCase(array[i]);
			}

		}
		System.out.println(array);

	}
}


       

        
     
