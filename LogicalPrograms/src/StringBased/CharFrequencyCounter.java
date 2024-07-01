package StringBased;

import java.util.HashMap;

public class CharFrequencyCounter {

	public static void main(String[] args) {

		String input = "aabbcccdd"; // Output = a2b2c3d2
		char[] charArr = input.toCharArray();
		String result = "";

		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		for (char ch : charArr) {
			if (hashmap.get(ch) == null) {
				hashmap.put(ch, 1);
			} else {
				hashmap.put(ch, hashmap.get(ch) + 1);
			}
		}
		System.out.println(hashmap);

		for (char ch : hashmap.keySet()) {
			result = result + ch + hashmap.get(ch);
		}
		System.out.println(result);

	}

}
