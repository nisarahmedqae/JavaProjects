package InterviewQuestions.IntegerBased;

import java.util.Arrays;

public class AddTwoIntArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 1, 2, 2, 3, 4, 5 };
		int[] arr2 = { 6, 6, 7, 8, 9, 9 };

		int arrLength = arr1.length + arr2.length;
		int[] combinedArr = new int[arrLength];

		int index = 0;
		for (int value : arr1) {
			combinedArr[index] = value;
			index++;
		}

		for (int value : arr2) {
			combinedArr[index] = value;
			index++;
		}

		System.out.println(Arrays.toString(combinedArr));

	}

}
