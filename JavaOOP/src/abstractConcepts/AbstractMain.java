package abstractConcepts;

public class AbstractMain {

	public static void main(String[] args) {
		// Creating an object of Dog
		Dog dog = new Dog("Buddy", 3, "Labrador");
		dog.eat();
		dog.sleep();
		dog.breathe(); // Concrete method from abstract class
		dog.bark(); // Specific method of Dog
		dog.displayInfo();

		// Creating an object of Cat
		Cat cat = new Cat("Whiskers", 2, "Black");
		cat.eat();
		cat.sleep();
		cat.breathe(); // Concrete method from abstract class
		cat.meow(); // Specific method of Cat
		cat.displayInfo();

		// Using polymorphism
		Animal myAnimal = new Dog("Max", 4, "Beagle");
		myAnimal.eat();
		myAnimal.sleep();
		myAnimal.breathe();
		myAnimal.displayInfo();
	}
}