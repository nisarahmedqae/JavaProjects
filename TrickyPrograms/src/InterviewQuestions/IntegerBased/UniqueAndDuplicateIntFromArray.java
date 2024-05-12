package InterviewQuestions.IntegerBased;

import java.util.ArrayList;
import java.util.HashMap;

public class UniqueAndDuplicateIntFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9 };

		HashMap<Integer, Integer> countMap = new HashMap<>();
		ArrayList<Integer> duplicateList = new ArrayList<>();
		ArrayList<Integer> nonRepeatingList = new ArrayList<>();
		ArrayList<Integer> uniqueList = new ArrayList<>();

		// Count occurrences of each element
		for (int element : arr) {
			if (countMap.get(element) == null) {
				countMap.put(element, 1);
			} else {
				countMap.put(element, countMap.get(element) + 1);
			}
		}

		// Categorize elements based on occurrence count
		for (int element : countMap.keySet()) {
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

		System.out.println("Duplicate List: " + duplicateList);
		System.out.println("Non-Repeating List: " + nonRepeatingList);
		System.out.println("Unique List: " + uniqueList);
		System.out.println("countMap Pairs: " + countMap);
	}
}
