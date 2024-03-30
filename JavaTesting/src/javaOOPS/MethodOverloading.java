package javaOOPS;

public class MethodOverloading {
	// either argument count is different or
	// argument data type is different

	public void getData(int a) {
		System.out.println(a);
	}

	public void getData(String a) {
		System.out.println(a);
	}

	public void getData(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading mo = new MethodOverloading();
		mo.getData(2);
		mo.getData("hello");
		mo.getData(2, 3);

	}

}
