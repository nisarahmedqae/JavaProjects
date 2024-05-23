package keywordsConcepts;

public class Vehicle {

	// Calling Superclass Method

	public void start() {
		System.out.println("Vehicle is starting");
	}
}

class Motorcycle extends Vehicle {
	@Override
	public void start() {
		super.start(); // Calls the superclass (Vehicle) start method
		System.out.println("Motorcycle is starting");
	}

	public static void main(String[] args) {
		Motorcycle motorcycle = new Motorcycle();
		motorcycle.start(); // Outputs: Vehicle is starting\nMotorcycle is starting
	}
}
