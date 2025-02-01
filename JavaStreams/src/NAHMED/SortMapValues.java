package NAHMED;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValues {

	public static void main(String[] args) {
		// Creating a HashMap with key-value pairs
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Date", 4);
		map.put("Banana", 5);
		map.put("Apple", 3);
		map.put("Cherry", 2);

		// Sort by values in Descending Order
		LinkedHashMap<String, Integer> sortedByValuesDesc = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // Descending order by values
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));

		System.out.println("Sorted by Values (Descending): " + sortedByValuesDesc);
	}
}