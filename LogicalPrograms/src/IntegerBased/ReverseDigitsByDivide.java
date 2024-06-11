package IntegerBased;

public class ReverseDigitsByDivide {

	public static void main(String[] args) {

		int digits = 123456789;

		while (digits != 0) {
			int lastDigit = digits % 10;
			System.out.print(lastDigit);

			digits = digits / 10;
		}

	}

}
