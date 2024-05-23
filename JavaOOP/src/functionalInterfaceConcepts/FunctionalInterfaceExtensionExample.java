package functionalInterfaceConcepts;

@FunctionalInterface
interface ParentFunctionalInterface {
	void parentMethod();

	// Default method in parent interface
	default void defaultParentMethod() {
		System.out.println("Default method in parent");
	}
}

@FunctionalInterface
interface ChildFunctionalInterface extends ParentFunctionalInterface {
	// No additional abstract methods allowed
	// void childMethod(); // Uncommenting this line would cause a compilation error

	// Default method in child interface
	default void defaultChildMethod() {
		System.out.println("Default method in child");
	}
}

public class FunctionalInterfaceExtensionExample {
	public static void main(String[] args) {
		ChildFunctionalInterface child = () -> System.out.println("Child method");
		child.parentMethod(); // Implementing parent method
		child.defaultParentMethod(); // Inherited default parent method
		child.defaultChildMethod(); // Child interface default method
	}
}
