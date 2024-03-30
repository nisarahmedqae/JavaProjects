package SDET;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {

	public static void main(String[] args) {
		// map
		List<Integer> numbersList1 = Arrays.asList(10, 30, 5, 20);
		List<Integer> numbersList2 = numbersList1.stream().map(n -> n + 10).collect(Collectors.toList());
		System.out.println(numbersList2);

		// flat map
		List<Integer> list1 = Arrays.asList(1, 2);
		List<Integer> list2 = Arrays.asList(3, 4);
		List<Integer> list3 = Arrays.asList(5, 6);

		List<List<Integer>> finalList = Arrays.asList(list1, list2, list3);
		List<Integer> finalResults = finalList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		System.out.println(finalResults);

		List<Integer> finalResults2 = finalList.stream().flatMap(x -> x.stream()).map(n -> n + 10)
				.collect(Collectors.toList());
		System.out.println(finalResults2);
	}

}
