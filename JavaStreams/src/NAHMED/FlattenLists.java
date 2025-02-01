package NAHMED;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlattenLists {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9, 10);

		// Using flatMap to merge multiple lists into a single list
		List<Integer> mergedList = Stream.of(list1, list2, list3).flatMap(Collection::stream)
				.collect(Collectors.toList());

		System.out.println("Flattened List: " + mergedList);
	}
}