package NAHMED;

import java.util.Arrays;
import java.util.List;

public class FindMinValue {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 5, 15);
		int min = numbers.stream().min(Integer::compareTo)
				.orElseThrow(() -> new RuntimeException("No minimum value found"));
		System.out.println(min); // Output: 5

	}

}
