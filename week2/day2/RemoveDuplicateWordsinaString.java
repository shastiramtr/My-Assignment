package week2.day2;

public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		//Expected output: “We learn Java basics as part of sessions in week1”

		int count = 0;
		String[] words = text.split(" ");
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					words[j] = "";
					count++;
				}
			}
		}

		// If at least one duplicate word is found
		if (count > 0) {
			// Use another for loop to print the modified String array where duplicates have been replaced with empty strings
			for (String word : words) {
				// Print non-empty words
				if (!word.isEmpty()) {
					System.out.print(word + " ");
				}
			}
		} else {
			// If no duplicates were found, print the original text
			System.out.println(text);
		}
	}


}


