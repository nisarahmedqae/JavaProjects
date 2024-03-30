package NaveenAutomationLabs.IntegerPrograms;

public class ShiftZerosToLeft {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 5, 0, 6 };

		int len = arr.length;
		int nonZeroIndex = len - 1; // Index to track non-zero elements starting from the end

		// Traverse the array in reverse order
		for (int i = len - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				// If the current element is non-zero, move it to the right
				arr[nonZeroIndex] = arr[i];
				nonZeroIndex--;
			}
		}

		// Fill the remaining elements with zeros
		for (int i = nonZeroIndex; i >= 0; i--) {
			arr[i] = 0;
		}

		// Print the modified array
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
