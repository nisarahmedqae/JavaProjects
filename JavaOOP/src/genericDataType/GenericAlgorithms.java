package genericDataType;

public class GenericAlgorithms {

	// Generics enable you to write algorithms that work on collections of different
	// types while maintaining type safety.

	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };

		printArray(intArray);
		printArray(stringArray);
	}
}