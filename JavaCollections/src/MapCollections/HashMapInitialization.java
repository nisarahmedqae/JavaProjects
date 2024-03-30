package MapCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {

	public static Map<String, Integer> marksMap;

	static {
		marksMap = new HashMap<String, Integer>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}

	public static void main(String[] args) {
		// 1. using HashMap class
		HashMap<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();

		// 2. Static way: static HashMap
		System.out.println(HashMapInitialization.marksMap.get("A"));

		// 3. immutable with only single entry
		Map<String, Integer> map3 = Collections.singletonMap("test", 200);
		System.out.println(map3.get("test"));

		// 4. stream
		Map<String, String> map4 = Stream.of(new String[][] { { "Tom", "A Grade" }, { "Naveen", "A+ Grade" }, })
				.collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A++ Grade");
		System.out.println(map4.get("Lisa"));
	}

}
