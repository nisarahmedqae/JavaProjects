package NAHMED;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordOccurances {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "apple");
		Map<String, Long> wordCount = words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		System.out.println(wordCount); // Output: {apple=2, banana=1}

	}

}
