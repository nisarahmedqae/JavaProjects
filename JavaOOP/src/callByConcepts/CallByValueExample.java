package callByConcepts;

public class CallByValueExample {

	public static void main(String[] args) {
		int num = 10;
		changeValue(num);
		System.out.println("Original value: " + num); // Output: Original value: 10
	}

	public static void changeValue(int value) {
		value = 20; // Changes value only within the method
	}
}
