package NAHMED;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateString {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "is", "awesome");
		String sentence = words.stream().collect(Collectors.joining(" "));
		System.out.println(sentence); // Output: Java is awesome

	}

}
