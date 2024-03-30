package ListCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {

	public static void main(String[] args) {

		ArrayList<String> nameList = new ArrayList<String>(
				Arrays.asList("Naveen", "Tom", "Peter", "Steve", "Lisa", "Tom"));

		Object[] arr = nameList.toArray();
		System.out.println(Arrays.toString(arr));

		for (Object obj : arr) {
			System.out.println(obj);
		}
	}

}
