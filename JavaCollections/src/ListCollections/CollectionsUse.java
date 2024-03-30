package ListCollections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUse {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		System.out.println("Original ArrayList: " + numbers);

		Collections.reverse(numbers);

		System.out.println("Reversed ArrayList: " + numbers);

		// we can also convert the array into a List and then
		// use the Collections.reverse() method to reverse it.
	}

}
