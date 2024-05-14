package InterviewQuestions.IntegerBased;

import java.util.Arrays;

public class ConcatenateIntArrays {

	public static void main(String[] args) {

		int[] intArray1 = { 1, 2 };
		int[] intArray2 = { 3, 4 };

		int[] concatenatedIntArray = new int[intArray1.length + intArray2.length];

		int index = 0;
		for (int element : intArray1) {
			concatenatedIntArray[index++] = element;
		}

		for (int element : intArray2) {
			concatenatedIntArray[index++] = element;
		}

		System.out.println(Arrays.toString(concatenatedIntArray));

	}

}
