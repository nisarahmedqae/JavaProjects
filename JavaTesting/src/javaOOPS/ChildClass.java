package javaOOPS;

public class ChildClass extends ParentClass {

	public void audioSystem() {
		System.out.println("child audioSystem code is implemented");
	}

	public void engine() {
		System.out.println("new engine");
	}

	public void color() {
		System.out.println("new color");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass cc = new ChildClass();
		cc.color();
		cc.brakes();
		cc.audioSystem(); // Method Overriding:: both have same method, name, signature
	}

}
