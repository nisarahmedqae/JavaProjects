package SDET;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(10, 30, 5, 20);
		List<Integer> result = numbersList.stream().map(num -> num * 3).collect(Collectors.toList());
		result.forEach(n -> System.out.println(n));
	}

}
