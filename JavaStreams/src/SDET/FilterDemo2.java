package SDET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Java", "Python", "C#");
		List<String> longNames = new ArrayList<String>();

		longNames = names.stream().filter(str -> str.length() > 4 && str.length() < 8).collect(Collectors.toList());
		System.out.println(longNames);
	}

}
