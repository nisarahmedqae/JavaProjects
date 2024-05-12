package InterviewQuestions.StringBased;

import java.util.ArrayList;
import java.util.HashMap;

public class FilteringStringFromArray {

	public static void main(String[] args) {

		String[] arr = { "nisar", "riyaz", "nisar", "kayenat", "riyaz", "nisar", "fatma" };

		HashMap<String, Integer> countMap = new HashMap<>();
		ArrayList<String> duplicateList = new ArrayList<>();
		ArrayList<String> nonRepeatingList = new ArrayList<>();
		ArrayList<String> uniqueList = new ArrayList<>();

		// Count occurrences of each element
		for (String element : arr) {
			if (countMap.get(element) == null) {
				countMap.put(element, 1);
			} else {
				countMap.put(element, countMap.get(element) + 1);
			}
		}

		// Categorize elements based on occurrence count
		for (String element : countMap.keySet()) {
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
