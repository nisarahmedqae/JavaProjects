package functionalInterfaceConcepts;

@FunctionalInterface
public interface MyFunctionalInterface {
	// Single abstract method
	void myMethod(String s);

	// Default method
	default void defaultMethod() {
		System.out.println("This is a default method.");
	}

	// Static method (implicitly public)
	static void staticMethod() {
		System.out.println("This is a static method.");
	}
}