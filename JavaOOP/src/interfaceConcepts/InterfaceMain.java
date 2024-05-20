package interfaceConcepts;

public class InterfaceMain {

	public static void main(String[] args) {
		// Creating an object of Dog
		Dog dog = new Dog(3, "Labrador");
		dog.eat();
		dog.sleep();
		dog.displayInfo();
		dog.breathe(); // Default method from interface
		dog.grow(); // Public method from parent abstract class

		System.out.println("******************");

		// Creating an object of Cat
		Cat cat = new Cat(2, "Black");
		cat.eat();
		cat.sleep();
		cat.displayInfo();
		cat.breathe(); // Default method from interface
		cat.grow(); // Public method from parent abstract class

		System.out.println("******************");

		// Using polymorphism
		Dog myAnimal = new Dog(4, "Beagle");
		myAnimal.eat();
		myAnimal.sleep();
		myAnimal.breathe();

		System.out.println("******************");

		// Calling static method from interface
		Animal.animalInfo();

		System.out.println("******************");
	}
}