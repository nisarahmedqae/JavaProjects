package SDET;

public class CountTheWords {

	public static void main(String[] args) {
		String str = "Java programming java oops";
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a String: " + count);
	}

}
