package InterviewQuestions.StringBased;

import java.util.Arrays;

public class ConcatenateStringArrays {

	public static void main(String[] args) {

		String[] strArray1 = { "Hello", "World" };
		String[] strArray2 = { "Java", "Selenium" };

		String[] concatenatedStrArray = new String[strArray1.length + strArray2.length];

		int index = 0;
		for (String element : strArray1) {
			concatenatedStrArray[index++] = element;
		}

		for (String element : strArray2) {
			concatenatedStrArray[index++] = element;
		}

		System.out.println(Arrays.toString(concatenatedStrArray));

	}

}
