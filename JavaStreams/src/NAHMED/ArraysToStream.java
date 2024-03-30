package NAHMED;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysToStream {

	public static void main(String[] args) {
		int[] intArray = { 4, 6, 6, 9, 4 };

		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(s -> System.out.println(s));

		System.out.println("--------------------------------------");

		String[] stringArray = { "apple", "banana", "cherry", "date" };

		Stream<String> stringStream = Arrays.stream(stringArray);
		stringStream.forEach(s -> System.out.println(s));
	}

}
