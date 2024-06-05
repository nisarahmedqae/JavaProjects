package StringBased;

public class ReplaceChars {

	public static void main(String[] args) {
		String name = "khan";
		char[] splittedChars = name.toCharArray();

		String blank = "";

		for (char fetchedChar : splittedChars) {
			char currentChar = fetchedChar;
			if (currentChar == 'k') {
				currentChar = 'A';
			} else if (currentChar == 'n') {
				currentChar = 'D';
			}
			blank = blank + currentChar;
		}

		System.out.println(blank);

	}

}
