package SDET;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 16461;
		int orgNum = num;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

		if (orgNum == rev) {
			System.out.println(orgNum + " Palindrome number");
		} else {
			System.out.println(orgNum + " not a Palindrome number");
		}
	}

}
