package abstractConcepts;

abstract class Animal {
	protected String name;
	protected int age;

	// Constructor
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Abstract methods
	public abstract void eat();

	public abstract void sleep();

	// Concrete method
	public void breathe() {
		System.out.println(name + " is breathing...");
	}

	// Concrete method
	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}
