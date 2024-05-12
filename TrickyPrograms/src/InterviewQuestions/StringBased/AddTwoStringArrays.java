package InterviewQuestions.StringBased;

import java.util.Arrays;

public class AddTwoStringArrays {

	public static void main(String[] args) {

		String[] arr1 = { "nisar", "riyaz", "nisar", "kayenat" };
		String[] arr2 = { "riyaz", "nisar", "fatma" };

		int arrLength = arr1.length + arr2.length;
		String[] combinedArr = new String[arrLength];

		int index = 0;
		for (String value : arr1) {
			combinedArr[index] = value;
			index++;
		}

		for (String value : arr2) {
			combinedArr[index] = value;
			index++;
		}

		System.out.println(Arrays.toString(combinedArr));

	}

}
