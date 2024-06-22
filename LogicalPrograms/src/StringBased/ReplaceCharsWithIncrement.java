package StringBased;

public class ReplaceCharsWithIncrement {

	public static void main(String[] args) {
		String input = "tomorrow";
		String result = "";
		int count = 1;

		for (char ch : input.toCharArray()) {
			if (ch == 'o') {
				for (int i = 0; i < count; i++) {
					result = result + '&';
				}
				count++;
			} else {
				result = result + ch;
			}
		}

		System.out.println(result);
	}
}