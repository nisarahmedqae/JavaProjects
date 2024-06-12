package StringBased;

public class FindAlphaNumericFromArray {

	public static void main(String[] args) {

		String[] arr = { "hello", "world", "hello12", "world34", "free" };

		for (String ele : arr) {
			char[] charArr = ele.toCharArray();
			boolean hasLetter = false;
			boolean hasDigit = false;

			for (char ch : charArr) {
				if (ch >= 'a' && ch <= 'z' || (ch >= 'A' && ch <= 'Z')) {
					hasLetter = true;
				} else if (ch >= '0' && ch <= '9') {
					hasDigit = true;
				}
			}
			if (hasLetter && hasDigit) {
				System.out.println(ele);
			}
		}

	}

}
