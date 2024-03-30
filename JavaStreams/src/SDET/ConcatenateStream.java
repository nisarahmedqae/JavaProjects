package SDET;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcatenateStream {

	public static void main(String[] args) {
		// Concatenate two lists using stream
		List<String> list1 = Arrays.asList("Dog", "Cat");
		List<String> list2 = Arrays.asList("parrot", "crow");

		List<String> concatenatedList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(concatenatedList);

		// Concatenate two string arrays using stream
		String[] array1 = { "Hello", "World" };
		String[] array2 = { "Java", "8" };

		String[] concatenatedArray = Stream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray(String[]::new);
		System.out.println(Arrays.toString(concatenatedArray));

		// Concatenate two int arrays using stream
		int[] intArray1 = { 1, 2 };
		int[] intArray2 = { 3, 4 };

		// Use IntStream.concat to concatenate the arrays and toArray to convert the
		// result to an array
		int[] concatenatedIntArray = IntStream.concat(Arrays.stream(intArray1), Arrays.stream(intArray2)).toArray();

		// Print the concatenated array
		System.out.println(Arrays.toString(concatenatedIntArray));
	}

}
