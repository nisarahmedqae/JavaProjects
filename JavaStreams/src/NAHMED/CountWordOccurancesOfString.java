package NAHMED;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWordOccurancesOfString {

	public static void main(String[] args) {
		String sentence = "Java is fun and Java is powerful";
		Map<String, Long> wordCount = Arrays.stream(sentence.split(" "))
				.collect(Collectors.groupingBy(word -> word, Collectors.counting()));
		System.out.println(wordCount); // Output: {Java=2, is=2, fun=1, and=1, powerful=1}

	}

}
