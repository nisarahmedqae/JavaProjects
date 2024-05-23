package functionalInterfaceConcepts;

public class FunctionalInterfaceExample {

	// Functional Interfaces: Specifically designed to have a single abstract
	// method, enabling them to be used with lambda expressions for concise and
	// readable functional programming.
	
	
	public static void main(String[] args) {
		// Using a lambda expression to implement the abstract method
		MyFunctionalInterface funcInterface = (s) -> System.out.println("Hello, " + s);

		// Calling the abstract method implemented by the lambda expression
		funcInterface.myMethod("world");

		// Calling the default method
		funcInterface.defaultMethod();

		// Calling the static method
		MyFunctionalInterface.staticMethod();
	}
}