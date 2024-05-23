package functionalInterfaceConcepts;

public class FunctionalInterfaceMain implements MyFunctionalInterface {

	public static void main(String[] args) {
		FunctionalInterfaceMain main = new FunctionalInterfaceMain();
		main.myMethod("hello");

	}

	@Override
	public void myMethod(String s) {
		System.out.println("myMethod of MyFunctionalInterface is implemented");
		System.out.println(s);
	}

}
