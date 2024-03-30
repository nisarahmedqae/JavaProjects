package JavaMiscellaneous;

import java.util.Arrays;

public class SeparatePositiveNegativeArrays {

	public static void main(String[] args) {

		int[] originalArray = { 4, -2, 9, -7, 0, 5, -1 };

		int[] positiveArray = new int[originalArray.length];
		int[] negativeArray = new int[originalArray.length];

		int positiveIndex = 0;
		int negativeIndex = 0;

		for (int num : originalArray) {
			if (num >= 0) {
				positiveArray[positiveIndex++] = num;
			} else {
				negativeArray[negativeIndex++] = num;
			}
		}

		// Trim arrays to actual size
		positiveArray = Arrays.copyOf(positiveArray, positiveIndex);
		negativeArray = Arrays.copyOf(negativeArray, negativeIndex);

		System.out.println("Positive Array: " + Arrays.toString(positiveArray));
		System.out.println("Negative Array: " + Arrays.toString(negativeArray));
	}

}
