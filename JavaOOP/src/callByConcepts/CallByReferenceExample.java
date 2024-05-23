package callByConcepts;

import java.util.Arrays;

public class CallByReferenceExample {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3 };
		changeArray(arr);
		System.out.println("Modified array: " + Arrays.toString(arr)); // Output: Modified array: [10, 20, 30]
	}

	public static void changeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] *= 10; // Modifies the original array
		}
	}
}
