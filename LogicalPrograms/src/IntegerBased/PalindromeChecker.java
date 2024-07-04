package IntegerBased;

public class PalindromeChecker {

	public static void main(String[] args) {
		int input = 123;
		char[] digits = String.valueOf(input).toCharArray();

		for (int i = digits.length - 1; i >= 0; i--) {
			System.out.println("Input: " + input);
			int reversed = reverseNumber(input);
			System.out.println("Reversed: " + reversed);
			if (input == reversed) {
				System.out.println("Palindrome found: " + input);
				break;
			}
			int newDigit = digits[i] - '0'; // converting char to int
			input = input * 10 + newDigit;
		}
		System.out.println("Final Input: " + input);
		System.out.println("Final Palindrome: " + input);
	}

	public static int reverseNumber(int input) {
		char[] digits = String.valueOf(input).toCharArray();
		int reversedResult = 0;

		for (int i = digits.length - 1; i >= 0; i--) {
			int digit = digits[i] - '0'; // converting char to int
			reversedResult = reversedResult * 10 + digit;
		}

		return reversedResult;
	}
}
