package javaCore;

public class ConstructorDemo2 {

	// will not return values
	// name of constructor should be the class name

	public ConstructorDemo2() {
		System.out.println("I am the Constructor");
	}

	public ConstructorDemo2(String str) {
		System.out.println(str);
	}

	public ConstructorDemo2(int a, int b) {
		System.out.println("I am the parameterized constructor");
		int c = a + b;
		System.out.println(c);
	}

	public void getData() {
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// block of code whenever an object is created for constructor class
		ConstructorDemo2 cd = new ConstructorDemo2();
		// if parameters are not defined in object then default constructor will be
		// called
		ConstructorDemo2 cd2 = new ConstructorDemo2(2, 5);
		ConstructorDemo2 cd3 = new ConstructorDemo2("hello");

	}

}
