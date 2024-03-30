package SDET;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortMethod {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 5, 5, 3, 89, 4, 2);

		System.out.println("-----------Ascending order----------------");
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

		System.out.println("-----------Descending order----------------");
		List<Integer> reverseSortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reverseSortedList);
	}

}
