package javaCore;

public class ConstructorDemo {

	// will not return values
	// name of constructor should be the class name

	public ConstructorDemo() {
		System.out.println("I am the Constructor");
	}

	public void getData() {
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// block of code whenever an object is created for constructor class
		ConstructorDemo cd = new ConstructorDemo();
		// compiler will call implicit constructor if no constructor is present in class
		// whenever you create an object constructor is called

	}

}
