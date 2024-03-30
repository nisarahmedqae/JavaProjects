package MapCollections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapToArrayList {

	public static void main(String[] args) {
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 5000);
		compMap.put("Cisco", 15000);

		// convert HashMap keys into ArrayList
		System.out.println("------------convert HashMap keys into ArrayList-----------------");
		ArrayList<String> compNamesList = new ArrayList<String>(compMap.keySet());
		System.out.println(compNamesList);

		for (String t : compNamesList) {
			System.out.println(t);
		}

		// convert HashMap values into ArrayList
		System.out.println("------------convert HashMap values into ArrayList-----------------");
		ArrayList<Integer> empValuesList = new ArrayList<Integer>(compMap.values());
		System.out.println(empValuesList);

		for (int e : empValuesList) {
			System.out.println(e);
		}
	}

}
