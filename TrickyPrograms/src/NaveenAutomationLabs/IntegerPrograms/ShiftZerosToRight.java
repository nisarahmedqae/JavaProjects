package NaveenAutomationLabs.IntegerPrograms;

public class ShiftZerosToRight {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 5, 0, 6 };

		int len = arr.length;
		int nonZeroIndex = 0; // Index to track non-zero elements

		// Traverse the array
		for (int i = 0; i < len; i++) {
			if (arr[i] != 0) {
				// If the current element is non-zero, move it to the left
				arr[nonZeroIndex] = arr[i];
				nonZeroIndex++;
			}
		}

		// Fill the remaining elements with zeros
		for (int i = nonZeroIndex; i < len; i++) {
			arr[i] = 0;
		}

		// Print the modified array
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
