package MapCollections;

import java.util.*;

public class SortedMapExample {

	public static void main(String[] args) {

		// Use TreeMap instead of HashMap for sorting
		TreeMap<Integer, String> sortedMap = new TreeMap<>();
		sortedMap.put(3, "Three");
		sortedMap.put(1, "One");
		sortedMap.put(5, "Five");
		sortedMap.put(2, "Two");
		sortedMap.put(4, "Four");

		System.out.println("Sorted Map: " + sortedMap);
	}

}
