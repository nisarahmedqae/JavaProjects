package NAHMED;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLength {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Tom");
		Map<Integer, List<String>> grouped = names.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(grouped); // Output: {3=[Bob], 5=[Alice], 7=[Charlie]}

	}

}
