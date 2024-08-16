package StringBased;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class SecondHighestInHashMap {

	public static void main(String[] args) {
		/// Sample HashMap with integer values
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 30);
		map.put("B", 10);
		map.put("C", 70);
		map.put("D", 50);
		map.put("E", 40);

		// Convert the values to a list
		List<Integer> valuesList = new ArrayList<>(map.values());
		Collections.sort(valuesList, Comparator.reverseOrder());

		System.out.println(valuesList.get(1));

	}

}
