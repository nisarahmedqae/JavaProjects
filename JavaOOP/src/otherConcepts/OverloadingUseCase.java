package otherConcepts;

public class OverloadingUseCase {

	// In this case, the add method is overloaded. Depending on the types of
	// parameters passed (integers or doubles), it will perform addition
	// accordingly. Overloading allows you to use the same method name with
	// different parameter lists, providing flexibility and convenience when calling
	// methods.
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(2, 2));
		System.out.println(cal.add(2.5, 2.5));

	}

}

class Calculator {
	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}
}
