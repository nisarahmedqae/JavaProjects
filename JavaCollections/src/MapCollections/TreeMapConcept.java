package MapCollections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		map.put(10, "Alice");
		map.put(20, "Bob");
		map.put(30, "Carol");
		map.put(40, "Wonder");
		map.put(50, "Superman");

		map.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println(map.lastKey());
		System.out.println(map.firstKey());

		System.out.println("----------keysLessThan30-------------");
		Set<Integer> keysLessThan30 = map.headMap(30).keySet();
		System.out.println(keysLessThan30);

		System.out.println("-----------keysGreaterEqual30------------");
		Set<Integer> keysGreaterEqual30 = map.tailMap(30).keySet();
		System.out.println(keysGreaterEqual30);

		TreeMap<String, Integer> userMap = new TreeMap<String, Integer>();
		userMap.put("Nisar", 20);
		userMap.put("Sorabh", 60);
		userMap.put("Sahil", 70);
		userMap.put("Bhagashri", 10);
		userMap.forEach((k, v) -> System.out.println(k + " : " + v));

		System.out.println("----------------reverseOrder-------------------");

		TreeMap<String, Integer> userMap2 = new TreeMap<String, Integer>(Comparator.reverseOrder());
		userMap2.put("Nisar", 20);
		userMap2.put("Sorabh", 60);
		userMap2.put("Sahil", 70);
		userMap2.put("Bhagashri", 10);
		userMap2.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}
