package ProgrammingChallenge_Part2;

public class CalculatorSwitch {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 4;
		String operation = "+";

		int result = switch (operation) {
		case "+" -> num1 + num2;
		case "-" -> num1 - num2;
		case "*" -> num1 * num2;
		case "/" -> num1 / num2;
		default -> -1;
		};

		System.out.println("Your answer is: " + result);
	}
}