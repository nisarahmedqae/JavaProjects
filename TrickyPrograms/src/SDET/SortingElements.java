package SDET;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {

		// Approach 1
		int arr[] = { 2, 6, 1, 4, 9 };
		System.out.println("Arrays before sorting: " + Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println("Arrays after sorting: " + Arrays.toString(arr));

		// Approach 2
		System.out.println("------------------------------------------------");

		int arr2[] = { 2, 6, 1, 4, 9 };
		System.out.println("Arrays before sorting: " + Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println("Arrays after sorting: " + Arrays.toString(arr2));

		// Approach 3 (Descending Order)
		System.out.println("------------------------------------------------");

		Integer arr3[] = { 2, 6, 1, 4, 9 };
		System.out.println("Arrays before sorting: " + Arrays.toString(arr3));
		Arrays.sort(arr3, Collections.reverseOrder());
		System.out.println("Arrays after sorting: " + Arrays.toString(arr3));
	}

}
