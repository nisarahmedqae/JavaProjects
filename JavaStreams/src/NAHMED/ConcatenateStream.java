package NAHMED;

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
		String[] strArray1 = { "Hello", "World" };
		String[] strArray2 = { "Java", "Selenium" };

		String[] concatenatedStrArray = Stream.concat(Arrays.stream(strArray1), Arrays.stream(strArray2))
				.toArray(String[]::new);
		System.out.println(Arrays.toString(concatenatedStrArray));

		// Concatenate two int arrays using stream
		int[] intArray1 = { 1, 2 };
		int[] intArray2 = { 3, 4 };

		int[] concatenatedIntArray = IntStream.concat(Arrays.stream(intArray1), Arrays.stream(intArray2)).toArray();

		System.out.println(Arrays.toString(concatenatedIntArray));
	}

}
