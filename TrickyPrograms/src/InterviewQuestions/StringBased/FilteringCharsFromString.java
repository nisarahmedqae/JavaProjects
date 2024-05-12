package InterviewQuestions.StringBased;

import java.util.ArrayList;
import java.util.HashMap;

public class FilteringCharsFromString {

	public static void main(String[] args) {

		String str = "mynameiskhan";

		HashMap<Character, Integer> countMap = new HashMap<>();
		ArrayList<Character> duplicateList = new ArrayList<>();
		ArrayList<Character> nonRepeatingList = new ArrayList<>();
		ArrayList<Character> uniqueList = new ArrayList<>();

		// Count occurrences of each element
		for (char element : str.toCharArray()) {
			if (countMap.get(element) == null) {
				countMap.put(element, 1);
			} else {
				countMap.put(element, countMap.get(element) + 1);
			}
		}

		// Categorize elements based on occurrence count
		for (char element : countMap.keySet()) {
			int count = countMap.get(element);

			if (count > 1) {
				duplicateList.add(element);
			} else if (count == 1) {
				nonRepeatingList.add(element);
			}
			if (count >= 1) {
				uniqueList.add(element);
			}
		}

		System.out.println("countMap Pairs: " + countMap);
		System.out.println("Duplicate List: " + duplicateList);
		System.out.println("Non-Repeating List: " + nonRepeatingList);
		System.out.println("Unique List: " + uniqueList);
		
	}
}
