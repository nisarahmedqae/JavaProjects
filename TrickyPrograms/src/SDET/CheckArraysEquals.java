package SDET;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 5, 7 };
		int arr2[] = { 6, 4, 5, 7 };

		boolean status = Arrays.equals(arr1, arr2);

		if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

		System.out.println("--------------------------");

		boolean status2 = true;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
					status2 = false;
					break;
				}
			}
		}

		if (status2 == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}

}
