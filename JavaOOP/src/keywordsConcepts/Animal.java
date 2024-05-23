package keywordsConcepts;

public class Animal {

	// Calling Superclass Constructor

	public Animal() {
		System.out.println("Animal constructor");
	}
}

class Cat extends Animal {
	public Cat() {
		super(); // Calls the superclass (Animal) constructor
		System.out.println("Cat constructor");
	}

	public static void main(String[] args) {
		Cat cat = new Cat(); // Outputs: Animal constructor\nCat constructor
	}
}
