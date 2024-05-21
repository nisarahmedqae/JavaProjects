package genericDataType;

public class BoundedType<T extends Number> {

	// Generics allow you to specify bounds for the type parameters, ensuring that
	// the generic type is a subtype of a particular class or interface.

	private T number;

	public BoundedType(T number) {
		this.number = number;
	}

	public void printSquare() {
		System.out.println(number.doubleValue() * number.doubleValue());
	}

	public static void main(String[] args) {
		BoundedType<Integer> intBox = new BoundedType<>(5);
		intBox.printSquare();

		BoundedType<Double> doubleBox = new BoundedType<>(5.5);
		doubleBox.printSquare();
	}
}
