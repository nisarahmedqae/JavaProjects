package IntegerBased;

public class ReverseDigits {

	public static void main(String[] args) {
		int digits = 123456789;
		char[] digitsArr = String.valueOf(digits).toCharArray();

		for (int i = digitsArr.length - 1; i >= 0; i--) {
			System.out.print(digitsArr[i]);
		}

	}

}
