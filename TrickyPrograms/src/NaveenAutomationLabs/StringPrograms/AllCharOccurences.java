package NaveenAutomationLabs.StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class AllCharOccurences {

	public static void main(String[] args) {

		String name = "test";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char ch : name.toCharArray()) {
			if (ch != ' ') { // Check if the character is not a space
				if (charMap.containsKey(ch)) {
					charMap.put(ch, charMap.get(ch) + 1);
				} else {
					charMap.put(ch, 1);
				}

			}

		}
		System.out.println(name + ":" + charMap);
	}
}
