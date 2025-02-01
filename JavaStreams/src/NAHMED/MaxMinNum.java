package NAHMED;

import java.util.Arrays;
import java.util.List;

public class MaxMinNum {

	public static void main(String[] args) {
		// Max number from list
		List<Integer> list = Arrays.asList(10, 20, 30, 40);
		int max = list.stream().max(Integer::compare).orElse(0);
		System.out.println(max); // Outpul̥t: 40

		// Min number from array
		int[] arr = { 10, 20, 30, 40 };
		int min = Arrays.stream(arr).boxed().min(Integer::compare).orElse(0);
		System.out.println(min); // Outpul̥t: 10
	}

}
