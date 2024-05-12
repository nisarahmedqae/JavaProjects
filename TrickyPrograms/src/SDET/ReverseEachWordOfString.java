package SDET;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String str = "Welcome To Java"; // original string
		String[] splittedStr = str.split(" "); // splitting string into words
		String reverse = ""; // Reset reverse for each word

		for (String word : splittedStr) { // welcome

			for (int i = word.length() - 1; i >= 0; i--) {
				reverse = reverse + word.charAt(i);
			}
			reverse = reverse + " ";
		}

		System.out.println(reverse); // Move to the next line after printing all reversed words
	}
}