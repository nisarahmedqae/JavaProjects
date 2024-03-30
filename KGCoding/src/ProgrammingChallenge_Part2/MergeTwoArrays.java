package ProgrammingChallenge_Part2;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9 };
		int[] arr2 = { 2, 4, 6, 8, 10 };

		int length = arr1.length + arr2.length;
		int[] newArray = new int[length];
		int i = 0;

		for (int a1 : arr1) {
			newArray[i] = a1;
			i++;
		}
		for (int a2 : arr2) {
			newArray[i] = a2;
			i++;
		}

		System.out.println(Arrays.toString(newArray));
	}
}