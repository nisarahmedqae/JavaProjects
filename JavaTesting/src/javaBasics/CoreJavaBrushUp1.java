package javaBasics;

import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		String name = "nisar";
		char letter = 'n';
		double value = 9.99;
		boolean myCard = true;

		System.out.println(num);
		System.out.println(name);
		System.out.println(letter);
		System.out.println(value);
		System.out.println(myCard);

		// Arrays
		int arrays[] = new int[5];
		arrays[0] = 1;
		arrays[1] = 2;
		arrays[2] = 3;
		arrays[3] = 4;
		arrays[4] = 5;

		System.out.println(arrays[4]);

		int arrays2[] = { 1, 2, 3, 4, 5 };
		System.out.println(arrays2[4]);

		// For Loop
		System.out.println("************");

		for (int i = 0; i < arrays2.length; i++) {
			System.out.println(arrays2[i]);
		}

		// string array
		System.out.println("************");

		String arrayName[] = { "nisar", "ahmed", "selenium" };

		for (int i = 0; i < arrayName.length; i++) {
			System.out.println(arrayName[i]);
		}

		// Enhanced For Loop
		System.out.println("************");

		for (String s : arrayName) {
			System.out.println(s);
		}

		// Convert arrays into list
		System.out.println("************");

		String arrayName2[] = { "nisar", "ahmed", "selenium" };
		List<String> convertedArrayList = Arrays.asList(arrayName2);
		System.out.println(convertedArrayList.contains("selenium"));

	}

}
