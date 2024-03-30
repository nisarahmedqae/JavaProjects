package MapCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

	public static void main(String[] args) {
		// SynchronizedMap method in collections class
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");

		// create synchronizedMap:
		Map<Integer, String> syncMap = Collections.synchronizedMap(map1);
		System.out.println(syncMap);

		// concurrentHashMap: It does not throw any ConcurrentModificationException
		ConcurrentHashMap<String, String> concurrentMap = new ConcurrentHashMap<String, String>();
		concurrentMap.put("A", "Java");
		concurrentMap.put("B", "Python");
		concurrentMap.put("C", "Ruby");
		System.out.println(concurrentMap.get("A"));
	}

}
