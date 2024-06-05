package StringBased;

import java.util.ArrayList;
import java.util.List;

public class FindAlphaNumericString {

	public static void main(String[] args) {
		String[] arr = { "hello1", "A", "123", "345", "2world" };

		// Pass it to the function that will return all alphanumeric elements
		List<String> elements = alphaNumeric(arr);
		System.out.println(elements);
	}

	public static List<String> alphaNumeric(String[] arr) {
		List<String> result = new ArrayList<>();
		for (String element : arr) {
			if (containsAlphaNumeric(element)) {
				result.add(element);
			}
		}
		return result; // Return the list of alphanumeric strings
	}

	private static boolean containsAlphaNumeric(String str) {
		boolean hasLetter = false;
		boolean hasDigit = false;
		for (char ch : str.toCharArray()) {
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				hasLetter = true;
			} else if (ch >= '0' && ch <= '9') {
				hasDigit = true;
			}
			if (hasLetter && hasDigit) {
				return true;
			}
		}
		return false;
	}

}