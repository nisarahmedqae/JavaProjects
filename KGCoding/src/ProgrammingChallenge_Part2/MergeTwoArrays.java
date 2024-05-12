package ProgrammingChallenge_Part2;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 2, 4, 6, 8, 10 };

		int length = arr1.length + arr2.length;
		int[] newArray = new int[length];
		int index = 0;

		for (int a1 : arr1) {
			newArray[index] = a1;
			index++;
		}
		for (int a2 : arr2) {
			newArray[index] = a2;
			index++;
		}

		System.out.println(Arrays.toString(newArray));
	}
}