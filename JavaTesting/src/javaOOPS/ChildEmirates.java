package javaOOPS;

public class ChildEmirates extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildEmirates ce = new ChildEmirates();
		ce.bodyColor();

		// parent class methods can also be used as child class inheriting parent class
		// properties
		ce.engineSpecs();
		ce.safetyStandards();

		// ParentAirCraft p = new ParentAirCraft();
		// we can not instantaniate parent classes coz of abstract class tag
		// private access specifiers is not allowed cause goal of abstract is that
		// someone has to use abstract class

	}

	@Override
	public void bodyColor() {
		System.out.println("Body color selected is Blue");

	}

}
