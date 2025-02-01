package NAHMED;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharOccurances {

	public static void main(String[] args) {
		String input = "java";
		Map<Character, Long> frequency = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(frequency); // Output: {a=2, j=1, v=1}

	}

}
