package NAHMED;

import java.util.Arrays;
import java.util.List;

public class MaxNumFromList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		int max = list.stream().max(Integer::compare).orElse(0);
		System.out.println(max); // Outpul̥t: 40

	}

}
