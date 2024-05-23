package exceptionsConcepts;

public class ManualExceptionThrowing {

	public static void main(String[] args) {
		try {
			// Manually throw an ArithmeticException
			throw new ArithmeticException("This is a manually thrown exception.");
		} catch (ArithmeticException e) {
			// Catch the thrown exception and handle it
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		}
	}
}
