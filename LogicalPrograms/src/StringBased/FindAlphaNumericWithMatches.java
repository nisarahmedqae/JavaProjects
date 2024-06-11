package StringBased;

public class FindAlphaNumericWithMatches {

	public static void main(String[] args) {
		String[] arr = { "hello", "World", "23alpha", "10", "hel22", "arm" };

		int strCount = 0;
		int intCount = 0;
		int alphaNumericCount = 0;

		for (String ele : arr) {
			if (ele.matches(".*[A-Za-z].*") && ele.matches(".*[0-9]+.*")) {
				strCount++;
			} else if (ele.matches(".*[A-Za-z].*")) {
				alphaNumericCount++;
			} else if (ele.matches("[0-9]+")) {
				intCount++;
			}
		}
		System.out.println("Number of strings: " + strCount);
		System.out.println("Number of integers: " + intCount);
		System.out.println("Number of alphanumeric strings: " + alphaNumericCount);
	}
}