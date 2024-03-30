package ProgrammingChallenge_Part1;

public class GCD {
// Greatest Common Divisor

	public static void main(String[] args) {
		int first = 15;
		int second = 30;
		int gcd = gcd(first, second);
		System.out.println("GCD of the numbers is: " + gcd);
	}

	public static int gcd(int num1, int num2) {
		int gcd = 1;
		int least = least(num1, num2);

		for (int i = 1; i <= least; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

	public static int least(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
}