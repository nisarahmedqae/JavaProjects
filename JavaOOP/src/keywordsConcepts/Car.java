package keywordsConcepts;

public class Car {

	// Distinguishing Between Instance Variables and Parameters
	
	private String model;

	public Car(String model) {
		this.model = model; // 'this.model' refers to the instance variable, 'model' refers to the parameter
	}

	public void displayModel() {
		System.out.println("Model: " + this.model);
	}

	public static void main(String[] args) {
		Car car = new Car("Tesla");
		car.displayModel(); // Outputs: Model: Tesla
	}
}