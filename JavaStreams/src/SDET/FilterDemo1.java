package SDET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(10);
		numbersList.add(30);
		numbersList.add(50);
		numbersList.add(25);

		ArrayList<Integer> numbersList2 = new ArrayList<Integer>(Arrays.asList(10, 30, 50, 25));
		List<Integer> numbersList3 = Arrays.asList(10, 30, 50, 25);

		List<Integer> evenNumbersList = new ArrayList<Integer>();

		// streams
		evenNumbersList = numbersList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbersList);

		// streams print
		System.out.println("-----------------streams print--------------");
		numbersList.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		System.out.println("-----------------streams print 2--------------");
		numbersList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

}
