package NAHMED;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlattenArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		int[] arr3 = { 7, 8, 9, 10 };

		// Corrected: Use flatMapToInt for primitive int[]
		int[] mergedIntArray = Stream.of(arr1, arr2, arr3).flatMapToInt(Arrays::stream).toArray();

		System.out.println("Flattened Array: " + Arrays.toString(mergedIntArray));

		// Arrays with Integer elements (boxed types)
		Integer[] integerArray1 = { 1, 2, 3 };
		Integer[] integerArray2 = { 4, 5, 6 };
		Integer[] integerArray3 = { 7, 8, 9, 10 };

		// Use flatMap to flatten the arrays and collect them into a single stream of Integers
		// Convert Integer[] to a stream of Integer objects and flatten it
		Integer[] mergedIntegerArray = Stream.of(integerArray1, integerArray2, integerArray3).flatMap(Arrays::stream)
				.toArray(Integer[]::new);

		// Print the flattened array
		System.out.println("Flattened Array: " + Arrays.toString(mergedIntegerArray));
	}
}
