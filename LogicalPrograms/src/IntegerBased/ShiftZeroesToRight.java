package IntegerBased;

import java.util.Arrays;

public class ShiftZeroesToRight {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 0, 3, 0, 4, 5, 0 };
		int[] result = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				result[index++] = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				result[index++] = 0;
			}
		}

		System.out.println(Arrays.toString(result));

	}
}
