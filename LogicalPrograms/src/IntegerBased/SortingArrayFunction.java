package IntegerBased;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArrayFunction {

	public static void main(String[] args) {
		// Sample primitive int array
		int[] primitiveArr = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3 };

		// Convert primitive int array to Integer array using autoboxing
		Integer[] integerArr = Arrays.stream(primitiveArr).boxed().toArray(Integer[]::new);

		// Sort Integer array in ascending order
		Arrays.sort(integerArr);
		System.out.println("Ascending order:");
		System.out.println(Arrays.toString(integerArr));

		// Sort Integer array in descending order
		Arrays.sort(integerArr, Comparator.reverseOrder());
		System.out.println("Descending order:");
		System.out.println(Arrays.toString(integerArr));
	}

}
