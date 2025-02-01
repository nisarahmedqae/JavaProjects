package NAHMED;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListToStream {

	public static void main(String[] args) {
		// Create an ArrayList of string
		List<String> stringList = new ArrayList<>();
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Cherry");
		stringList.add("Date");

		// Convert ArrayList to Stream
		Stream<String> stringStream = stringList.stream();
		stringStream.forEach(s -> System.out.println(s));

		System.out.println("--------------------------------------");

		// Create an ArrayList of integers
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);

		// Convert ArrayList to Stream
		Stream<Integer> intStream = intList.stream();
		intStream.forEach(s -> System.out.println(s));
	}

}
