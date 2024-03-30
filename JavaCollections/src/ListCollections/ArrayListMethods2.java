package ListCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods2 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(
				Arrays.asList("Naveen", "tom", "Naveen", "Steve", "Lisa", "Naveen"));
		int i = list1.lastIndexOf("Naveen");
		System.out.println(i);

		list1.remove(1);
		System.out.println(list1);

		list1.remove("Lisa");
		System.out.println(list1);

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		numbers.removeIf(num -> num % 2 == 0);
		System.out.println(numbers);

		ArrayList<String> nameList = new ArrayList<String>(
				Arrays.asList("Naveen", "Tom", "Peter", "Steve", "Lisa", "Tom"));
		System.out.println(nameList);
		nameList.retainAll(Collections.singleton("Tom"));
		System.out.println(nameList);

		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 85, 66, 7, 8, 9, 10));
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers2.subList(2, 6));
		System.out.println(subList);
	}

}
