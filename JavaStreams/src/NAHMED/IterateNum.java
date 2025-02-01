package NAHMED;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IterateNum {

	public static void main(String[] args) {
		List<Integer> evenNumbers = Stream.iterate(0, n -> n + 2).limit(10).collect(Collectors.toList());
		System.out.println(evenNumbers); // Output: [0, 2, 4, 6, 8, 10, 12, 14, 16, 18]

	}

}
