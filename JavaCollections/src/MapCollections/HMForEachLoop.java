package MapCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HMForEachLoop {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "GoodBye");
		hm.put(42, "morning");
		hm.put(3, "evening");

		// Retrieving and printing a value
		System.out.println(hm.get(3));

		// Removing an element
		hm.remove(42);

		// Attempting to retrieve a removed element
		System.out.println(hm.get(42)); // This will output 'null'

		// Iterating with for each loop
		System.out.println("-------------Iterating with for each loop----------------");
		Set<Map.Entry<Integer, String>> entryForEach = hm.entrySet();

		for (Map.Entry<Integer, String> entry : entryForEach) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}

	}

}
