package ProgrammingChallenge_Part2;

import java.util.Arrays;

public class DeleteElementFromArray {
	public static void main(String[] args) {
		int[] originalArray = { 1, 2, 3, 4, 5 };
		int elementToDelete = 3;

		System.out.println("Original Array: " + Arrays.toString(originalArray));

		int[] newArray = deleteElement(originalArray, elementToDelete);

		System.out.println("New Array after deleting " + elementToDelete + ": " + Arrays.toString(newArray));
	}

	public static int[] deleteElement(int[] array, int elementToDelete) {
		int count = 0;

		// Count the occurrences of the element in the array
		for (int num : array) {
			if (num == elementToDelete) {
				count++;
			}
		}

		// If the element is not present in the array, return the original array
		if (count == 0) {
			return array.clone();
		}

		// Create a new array with size = original size - count of the element to delete
		int[] newArray = new int[array.length - count];

		int newIndex = 0;

		// Copy elements to the new array, skipping the element to delete
		for (int num : array) {
			if (num != elementToDelete) {
				newArray[newIndex] = num;
				newIndex++;
			}
		}

		return newArray;
	}
}
