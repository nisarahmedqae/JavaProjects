package StringBased;

import java.util.ArrayList;

public class ElementOccuranceInArray {

	public static void main(String[] args) {
		String[] arr = { "hello", "arm", "world", "hello", "cpu", "hello", "world" };
		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			String ele = arr[i];
			int count = 0;

			for (int j = i; j < arr.length; j++) {
				if (ele == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				list.add(ele);
			}

		}
		System.out.println(list);

		for (String ele : list) {
			int count = 0;

			for (int i = 0; i < arr.length; i++) {
				if (ele == arr[i]) {
					count++;
				}
			}
			System.out.println(ele + " : " + count);

		}

	}

}
