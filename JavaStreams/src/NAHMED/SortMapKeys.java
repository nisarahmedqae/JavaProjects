package NAHMED;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapKeys {

	public static void main(String[] args) {
		// Creating a HashMap with key-value pairs
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Date", 4);
		map.put("Banana", 5);
		map.put("Apple", 3);
		map.put("Cherry", 2);

		// Sort by keys in Ascending Order
		LinkedHashMap<String, Integer> sortedByKeysAsc = map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));

		System.out.println("Sorted by Keys (Ascending): " + sortedByKeysAsc);

	}

}
