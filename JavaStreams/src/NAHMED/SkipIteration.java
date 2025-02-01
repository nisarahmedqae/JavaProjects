package NAHMED;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipIteration {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> sublist = numbers.stream().skip(2) // Skip the first 2 elements
				.limit(3) // Take the next 3 elements
				.collect(Collectors.toList());
		System.out.println(sublist); // Output: [3, 4, 5]

	}

}
