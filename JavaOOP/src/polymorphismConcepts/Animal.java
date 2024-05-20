package polymorphismConcepts;

//Base class
class Animal {
	public void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//Derived class Dog
class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
}

//Derived class Cat
class Cat extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Cat meows");
	}
}
