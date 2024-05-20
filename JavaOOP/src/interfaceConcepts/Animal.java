package interfaceConcepts;

interface Animal {

	// Constants (public, static, final by default)
	int DEFAULT_AGE = 1;

	// Abstract methods
	void eat();

	void sleep();

	// Default method
	default void breathe() {
		System.out.println("Breathing...");
	}

	// Static method
	static void animalInfo() {
		System.out.println("Animals are living beings.");
	}
}
