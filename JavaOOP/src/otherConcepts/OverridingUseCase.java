package otherConcepts;

public class OverridingUseCase {

	// Imagine you have a base class Animal with a method makeSound(). Now, you want
	// to create specific types of animals like Cat and Dog, which should make
	// different sounds.
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		cat.makeSound();
		dog.makeSound();

	}

}

class Animal {
	void makeSound() {
		System.out.println("Generic animal sound");
	}
}

class Cat extends Animal {
	@Override
	void makeSound() {
		System.out.println("Meow");
	}
}

class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Woof");
	}
}
