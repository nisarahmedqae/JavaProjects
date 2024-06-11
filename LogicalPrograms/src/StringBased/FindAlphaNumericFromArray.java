package StringBased;

public class FindAlphaNumericFromArray {

	public static void main(String[] args) {

		String[] arr = { "hello", "world", "hello12", "world34", "free" };

		for (String ele : arr) {
			char[] charArr = ele.toCharArray();
			boolean hasAlpha = false;
			boolean hasNumeric = false;

			for (char ch : charArr) {
				if (ch >= 'a' && ch <= 'z' || (ch >= 'A' && ch <= 'Z')) {
					hasAlpha = true;
				} else if (ch >= '0' && ch <= '9') {
					hasNumeric = true;
				}
			}
			if (hasAlpha && hasNumeric) {
				System.out.println(ele);
			}
		}

	}

}
