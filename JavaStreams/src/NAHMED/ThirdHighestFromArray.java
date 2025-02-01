package NAHMED;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdHighestFromArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		List<Integer> list = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(list.get(2)); // Third Highest
	}

}
