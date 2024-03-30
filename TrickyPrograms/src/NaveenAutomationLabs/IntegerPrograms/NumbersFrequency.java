package NaveenAutomationLabs.IntegerPrograms;

import java.util.HashMap;
import java.util.Set;

public class NumbersFrequency {

	public static void main(String[] args) {

		long number = 9876543214638L;

		// if number ==1 then no need to execute the logic
		if (String.valueOf(number).length() == 1) {
			System.out.println(number + ":" + 1);
		}

		HashMap<Long, Integer> digitMap = new HashMap<Long, Integer>();
		
		while (number != 0) {
			long lastDigit = number % 10;
			if (digitMap.containsKey(lastDigit)) {
				digitMap.put(lastDigit, digitMap.get(lastDigit) + 1);
			} else {
				digitMap.put(lastDigit, 1);
			}
			number = number / 10;
		}

		Set<Long> keys = digitMap.keySet();
		for (Long key : keys) {
			System.out.println(key + ":" + digitMap.get(key));
		}
	}

}
