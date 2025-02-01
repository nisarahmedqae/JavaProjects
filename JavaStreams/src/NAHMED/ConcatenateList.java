package NAHMED;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConcatenateList {

	public static void main(String[] args) {

		// Concatenate two String lists using stream
		List<String> strList1 = Arrays.asList("Dog", "Cat");
		List<String> strList2 = Arrays.asList("parrot", "crow");

		List<String> finalStrList = Stream.concat(strList1.stream(), strList2.stream()).collect(Collectors.toList());
		System.out.println(finalStrList);

		// Concatenate two Integer lists using stream
		List<Integer> intList1 = Arrays.asList(1, 2, 3);
		List<Integer> intList2 = Arrays.asList(4, 5, 6);

		List<Integer> finalIntList = Stream.concat(intList1.stream(), intList2.stream()).collect(Collectors.toList());
		System.out.println(finalIntList);

	}

}
