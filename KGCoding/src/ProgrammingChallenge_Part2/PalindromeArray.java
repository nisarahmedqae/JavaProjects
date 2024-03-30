package ProgrammingChallenge_Part2;

public class PalindromeArray {

	public static void main(String[] args) {
		int[] numArr = { 1, 2, 3, 2, 1 };

		boolean isPalin = isPalindrome(numArr);

		if (isPalin) {
			System.out.println("Your array is Palindrome");
		} else {
			System.out.println("Your array is not Palindrome");
		}
	}

	public static boolean isPalindrome(int[] numArr) {
		int length = numArr.length;
		for (int i = 0; i < length / 2; i++) {
			if (numArr[i] != numArr[length - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}