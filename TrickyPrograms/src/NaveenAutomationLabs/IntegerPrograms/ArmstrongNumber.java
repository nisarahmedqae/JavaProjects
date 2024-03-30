package NaveenAutomationLabs.IntegerPrograms;

public class ArmstrongNumber {

	// check given number is Armstrong number/ Narcissistic number
	// pluperfect digital invariant (PPDI) number/ plus perfect number

	public static boolean isArmStrongNumber(int num) {
		if (num < 0) {
			return false;
		}

		int power = String.valueOf(num).length();
		int copyNum = num;
		int sum = 0;

		while (copyNum != 0) {
			int lastDigit = copyNum % 10;
			int factor = 1;
			for (int i = 0; i < power; i++) {
				factor = factor * lastDigit;
			}
			sum = sum + factor;
			copyNum = copyNum / 10;
		}
		if (sum == num) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isArmStrongNumber(0)); // true
		System.out.println(isArmStrongNumber(-1));
		System.out.println(isArmStrongNumber(153)); // true
		System.out.println(isArmStrongNumber(1674));
		System.out.println(isArmStrongNumber(12));
	}

}
