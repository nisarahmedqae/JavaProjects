package SDET;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // should be in sorted order
		boolean status = false;

		int key = 7;

		int low = 0; // 0th position
		int high = arr.length - 1; // last position

		while (low <= high) {
			int mid = (low + high) / 2; // mid position
			if (key == arr[mid]) {
				System.out.println("Element Found");
				status = true;
				break;
			}

			if (key > arr[mid]) { // key greater than mid
				low = mid + 1; // l moving right side
			}

			if (key < arr[mid]) { // key less than mid
				high = mid - 1; // l moving left side
			}
		}
		if (status == false) {
			System.out.println("Element not found");
		}

		// Approach2
		System.out.println(Arrays.binarySearch(arr, 9)); // it will display value at 8th position
	}

}
