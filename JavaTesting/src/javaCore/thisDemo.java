package javaCore;

public class thisDemo {

	int a = 2; // global or class variable

	public void getData() {
		int a = 3; // local variable
		System.out.println(a);
		// this refers to current object
		// object scope lies in class level
		System.out.println(this.a);

		// sum of local + global variable
		System.out.println(this.a + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisDemo td = new thisDemo();
		td.getData();

	}

}
