package javaCore;

public class ChildDemo extends ParentDemo {

	// use of super keyword

	String name = "QAclickAcademy";

	public ChildDemo() {
		super(); // we are using ParentDemo constructor with super keyword here
		// This should always be in first line
		System.out.println("child class constructor");
	}

	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData() {
		super.getData();
		System.out.println("I am in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildDemo cd = new ChildDemo();
		cd.getStringData();
		cd.getData();

	}

}
