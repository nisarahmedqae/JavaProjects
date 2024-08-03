package IntegerBased;

import java.util.Arrays;

public class SortDigits {

	public static void main(String[] args) {
		long num = -3216549870L;
		long positiveNum = -num;
		char[] charArr = String.valueOf(positiveNum).toCharArray();
		int[] arr = new int[charArr.length];

		int index = 0;
		for (char ch : charArr) {
			int digit = ch - '0';
			arr[index++] = digit;
		}

		System.out.println("Arrays before sorting: " + Arrays.toString(charArr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Arrays after sorting: " + Arrays.toString(arr));
	}

}
