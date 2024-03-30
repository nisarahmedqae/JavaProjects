package SDET;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", null, "Python", "C#", null, "JS");

		List<String> result = words.stream().filter(w -> w != null).collect(Collectors.toList());
		System.out.println(result);

	}

}
