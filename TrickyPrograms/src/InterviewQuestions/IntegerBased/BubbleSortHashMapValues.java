package InterviewQuestions.IntegerBased;

import java.util.*;

public class BubbleSortHashMapValues {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Create a HashMap
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("banana", 5);
		hashMap.put("apple", 2);
		hashMap.put("grape", 7);
		hashMap.put("orange", 3);
		hashMap.put("pineapple", 6);

		System.out.println("HashMap before sorting: " + hashMap);

		// Convert the entries of the HashMap into an array
		Map.Entry<String, Integer>[] entries = new Map.Entry[hashMap.size()];
		int index = 0;
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			entries[index++] = entry;
		}

		// Perform bubble sort on the entries based on values
		for (int i = 0; i < entries.length; i++) {
			for (int j = i + 1; j < entries.length; j++) {
				if (entries[i].getValue() > entries[j].getValue()) {
					// Swap entries
					Map.Entry<String, Integer> temp = entries[i];
					entries[i] = entries[j];
					entries[j] = temp;
				}
			}
		}

		// Create a new LinkedHashMap to store the sorted entries
		LinkedHashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();

		// Put the sorted entries into the LinkedHashMap
		for (Map.Entry<String, Integer> entry : entries) {
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}

		System.out.println("HashMap after sorting by values: " + sortedHashMap);
	}
}
