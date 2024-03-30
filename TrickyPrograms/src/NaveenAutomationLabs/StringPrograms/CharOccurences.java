package NaveenAutomationLabs.StringPrograms;

import org.apache.commons.lang3.StringUtils;

public class CharOccurences {

	public static void main(String[] args) {
		// CharArray - for loop

		String str = "I love coding and testing";
		int count = 0;

		for (char ch : str.toCharArray()) {
			if (ch == 't') {
				count++;
			}
		}
		System.out.println(count);

		String str2 = "I love coding and testing";
		int count2 = 0;

		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == 't') {
				count2++;
			}
		}
		System.out.println(count2);

		// Apache Common StringUtils-> Apache Commons Lang » 3.13.0
		int count3 = StringUtils.countMatches(str, 'c');
		System.out.println(count3);

		// streams
		String str3 = "Testing Solutions";
		long charCount = str3.chars().filter(s -> s == 't' || s == 'i').count();
		System.out.println(charCount);
	}
}