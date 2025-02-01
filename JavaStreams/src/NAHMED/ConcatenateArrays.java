package NAHMED;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcatenateArrays {

	public static void main(String[] args) {

		// Concatenate two string arrays using stream
		String[] strArray1 = { "Hello", "World" };
		String[] strArray2 = { "Java", "Selenium" };

		String[] finalStrArray = Stream.concat(Arrays.stream(strArray1), Arrays.stream(strArray2))
				.toArray(String[]::new);
		System.out.println(Arrays.toString(finalStrArray));

		// Concatenate two Integer arrays using stream
		Integer[] integerArray1 = { 1, 2 };
		Integer[] integerArray2 = { 3, 4 };

		Integer[] finalIntegerArray = Stream.concat(Arrays.stream(integerArray1), Arrays.stream(integerArray2))
				.toArray(Integer[]::new);

		System.out.println(Arrays.toString(finalIntegerArray));

		// Concatenate two int arrays using stream
		int[] intArray1 = { 5, 6 };
		int[] intArray2 = { 7, 8 };

		int[] finalIntArray = IntStream.concat(Arrays.stream(intArray1), Arrays.stream(intArray2)).toArray();

		System.out.println(Arrays.toString(finalIntArray));
	}

}
