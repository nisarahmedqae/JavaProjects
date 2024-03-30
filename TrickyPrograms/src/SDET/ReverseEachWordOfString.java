package SDET;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String str = "Welcome To Java"; // original string
		String[] words = str.split(" "); // splitting string into words
		String reverseString = "";

		for (String w : words) { // welcome
			String reverseWord = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + w.charAt(i);
			}
			reverseString = reverseString + reverseWord + " "; // emoclew
		}
		System.out.println(reverseString);
	}

}
