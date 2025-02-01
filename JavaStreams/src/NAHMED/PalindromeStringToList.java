package NAHMED;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeStringToList {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("madam", "racecar", "java", "level", "hello");
		List<String> palindromes = words.stream()
				.filter(word -> word.equals(new StringBuilder(word).reverse().toString())).collect(Collectors.toList());
		System.out.println(palindromes); // Output: [madam, racecar, level]

	}

}
