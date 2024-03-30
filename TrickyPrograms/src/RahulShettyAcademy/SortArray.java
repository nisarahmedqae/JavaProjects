package RahulShettyAcademy;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortArray {

	public static void main(String[] args) {
		// sort the array in ascending and descending order
		// This is also called bubble sort

		int arr[] = { 2, 6, 1, 4, 9 };
		int temp;

		System.out.println("Arrays before sorting: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Arrays after sorting: " + Arrays.toString(arr));

		System.out.println("--------------------------------------");

		Stream.of(2, 6, 1, 4, 9).sorted().forEach(s -> System.out.print(s + " "));

	}

}
