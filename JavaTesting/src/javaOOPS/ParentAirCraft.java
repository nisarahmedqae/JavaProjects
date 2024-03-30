package javaOOPS;

public abstract class ParentAirCraft {

	public void engineSpecs() {
		System.out.println("Follow Engine Specs Guidelines");
	}

	public void safetyStandards() {
		System.out.println("Follow Safety Guidelines");
	}

	// if any method in class is abstract then class will also be abstract
	public abstract void bodyColor();

}
