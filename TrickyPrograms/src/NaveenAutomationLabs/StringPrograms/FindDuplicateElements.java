package NaveenAutomationLabs.StringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		String[] arr = { "Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "Sauce Labs", "Azure", "GCP" };

		System.out.println("**********brute force**********");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

		System.out.println("**********hash set**********");
		Set<String> data = new HashSet<String>();
		for (String e : arr) {
			if (!data.add(e)) {
				System.out.println(e);
			}
		}

		System.out.println("**********streams**********");
		Set<String> data2 = new HashSet<String>();

		Set<String> dupSet = Arrays.asList(arr).stream().filter(e -> data2.add(e) == false)
				.collect(Collectors.toSet());
		System.out.println(dupSet);
	}

}
