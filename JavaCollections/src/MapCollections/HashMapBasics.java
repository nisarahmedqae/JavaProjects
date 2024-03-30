package MapCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {

	public static void main(String[] args) {
		// No Order, No Indexing
		// Stores values in Key-Value Pairs
		// Key can not be duplicate
		// can store n number of null values but only one null key
		// HashMap is not thread safe but HashTable is thread safe/synchronized

		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "New Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11"); // It will not give duplicate error but will print latest given value
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA"); // two null values can not be assigned but compiler will print latest null value
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);

		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("UK"));
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("Russia"));

		// iterator over the keys: By using keySet()
		System.out.println("-------------iterator over the keys: By using keySet()----------------");
		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println(key + " : " + value);
		}

		// iterator over the set (pair): By using entrySet()
		System.out.println("-------------iterator over the set (pair): By using entrySet()----------------");
		Iterator<Map.Entry<String, String>> it2 = capitalMap.entrySet().iterator();
		while (it2.hasNext()) {
			Map.Entry<String, String> entry = it2.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// stream
		System.out.println("-------------stream----------------");
		capitalMap.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}