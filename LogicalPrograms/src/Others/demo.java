package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo {

	public static void main(String[] args) {
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };

		Map<String, List<String>> map = new HashMap<>();

		for (String ele : words) {
			char[] arr = ele.toCharArray();
			Arrays.sort(arr);
			String str = new String(arr);
			map.putIfAbsent(str, new ArrayList<>());
			map.get(str).add(ele);
		}
		System.out.println(map.values());
	}
}