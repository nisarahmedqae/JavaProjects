package interfaceConcepts;

//Superclass
abstract class Mammal {
	protected int age;

	// Constructor
	public Mammal(int age) {
		this.age = age;
	}

	// Method
	public void grow() {
		age++;
		System.out.println("Growing... New age: " + age);
	}

}

//Subclass Dog
class Dog extends Mammal implements Animal {
	private String breed;

	// Constructor
	public Dog(int age, String breed) {
		super(age); // Call to superclass constructor
		this.breed = breed;
	}

	// Implementation of eat method
	public void eat() {
		System.out.println("Dog is eating");
	}

	// Implementation of sleep method
	public void sleep() {
		System.out.println("Dog is sleeping");
	}

	// Method to display dog info
	public void displayInfo() {
		System.out.println("Dog breed: " + breed + ", Age: " + age);
	}
}

//Subclass Cat
class Cat extends Mammal implements Animal {
	private String color;

	// Constructor
	public Cat(int age, String color) {
		super(age); // Call to superclass constructor
		this.color = color;
	}

	// Implementation of eat method
	public void eat() {
		System.out.println("Cat is eating");
	}

	// Implementation of sleep method
	public void sleep() {
		System.out.println("Cat is sleeping");
	}

	// Method to display cat info
	public void displayInfo() {
		System.out.println("Cat color: " + color + ", Age: " + age);
	}
}
